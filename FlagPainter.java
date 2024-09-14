import org.code.neighborhood.*;

public class FlagPainter extends MuralPainter {
  public void drawFlag() {
    paintOutline();
  }

    //paints the hungary flag red
  public void paintOutline() {

    //starting spot
    paintLine("red",16);
    turnRight();
    move();
    turnRight();
    paintLine("red",16);
    turnLeft();
    move();
    turnLeft();
    paintLine("red",16);
    turnRight();
    move();
    turnRight();
    paintLine("red",16);
    turnLeft();
    move();
    turnLeft();
    paintLine("red",16);
    turnRight();

    //paints the flag white
    move();
    move();
    move();
    move();
    move();
    move();
    move();

    //paints the hungary flag green
    turnRight();
    paintLine("green",16);
    turnLeft();
    move();
    turnLeft();
    paintLine("green",16);
    turnRight();
    move();
    turnRight();
    paintLine("green",16);
    turnLeft();
    move();
    turnLeft();
    paintLine("green",16);
    turnRight();
    move();
    turnRight();
    paintLine("green",16);

  
  
   
  }
}