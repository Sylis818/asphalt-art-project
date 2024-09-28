import org.code.neighborhood.*;
public class greenPainter extends PainterPlus {
// Will paint the packground after putting a color and the size for the grid
  public void paintBackground(String color, int size) {
while (canMove("south")) {
paintLine(color, size);
turnToWest();
// While the painter can move south they will paint
if (canMove("south")) {
paintLine(color, size);
turnToEast();
}
}
// Will paint the line of green to the corners
paintLine(color, size);
turnAround();
moveToCorner();
  }

 public void paintLine(String color, int spaces) {
setPaint(spaces);
// Will make sure while the painter has paint, they will paint
while (hasPaint()) {
paint(color);
if (canMove()) {
move();
}
}
}
// turns the painter to the west
 public void turnToWest() {
if (isFacingEast()) {
turnRight();
move();
turnRight();
}
}
// turns the painter to the east
  public void turnToEast() {
if (isFacingWest()) {
turnLeft();
move();
turnLeft();
}
}

  
   // makes the painter turn completely around
public void turnAround() {
turnLeft();
turnLeft();
}

  
   // makes the painter face north
public void resetPosition() {
if (isFacingEast()) {
turnLeft();

while (canMove()) {
move();
}

turnLeft();

while (canMove()) {
move();
}

turnAround();
}
}

  
   // will make the painter move all the way to the corner
  public void moveToCorner() {
while (canMove()) {
move();
}
    
turnRight();

while (canMove()) {
move();
}
}
  
}
