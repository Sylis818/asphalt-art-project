import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
/*
  *Paints the background green
  *The background serves as the skin color for the creeper
  */
greenPainter gp = new greenPainter();
    gp.paintBackground("green", 8);
/*
  *Adds in the face for the creeper
  *Puts details like the eyes and mouth
  */
    facePainter fp = new facePainter();
    fp.setPaint(10000);
    fp.paintFace();
  }
}