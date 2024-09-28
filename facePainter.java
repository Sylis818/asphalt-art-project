import org.code.neighborhood.*;
public class facePainter extends PainterPlus {
/*
  * Puts together the paintEye and paintMouth methods
  * Fills in the face for the creeper
  */
  public void paintFace() {
  move();
  turnRight();
  move();
  move();
  paintEye("black");
  turnRight();
  turnRight();
  move();
  move();
  move();
  move();
  turnLeft();
  move();
  paintEye("black");
  turnLeft();
  move();
  turnRight();
  move();
  paintMouth("black");
  while (canMove()){
  move();
  }
    
  
  
    }
/*
  * Paints an eye for the creeper
  * Allows each eye to be painted individually
  */
  public void paintEye(String color) {
if (isFacingSouth()) {
  turnLeft();
}
    if (isFacingWest()) {
      turnRight();
      turnRight();
    }
    if (isFacingNorth()) {
      turnRight();
    }
    paint(color);
    move();
    paint(color);
      turnRight();
    move();
    paint(color);
      turnRight();
    move();
    paint(color);
}
/*
  * Paints the mouth for the creeper
  *
  */
public void paintMouth(String color) {
  paint(color);
  move();
  paint(color);
  turnLeft();
    move();
  paint(color);
    move();
  paint(color);
  turnRight();
  move();
  turnRight();
  move();
  turnRight();
  turnRight();
  paint(color);
   move();
  paint(color);
   move();
  paint(color);
  turnLeft();
  move();
  move();
  turnLeft();
  move();
  move();
  turnRight();
  turnRight();
  paint(color);
   move();
  paint(color);
   move();
  turnLeft();
  move();
  turnLeft();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
}
  




































  
}