import org.code.neighborhood.Painter;

public class NeighborhoodRunner {
  public static void main(String[] args) {

   MuralPainter cam = new MuralPainter();
         cam.paintBackground("white",16);
    FlagPainter t = new FlagPainter() ;
    t.drawFlag();
    t.setPaint(1000);
  }
}