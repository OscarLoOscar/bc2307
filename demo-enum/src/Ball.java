
public class Ball {
  Color color; // "RE D" , "RED", "red","R ed"

  public Ball(Color color) {
    this.color = color;
  }
  
  public Color getColour() {
    return this.color;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Color))
      return false;
    Ball ball = (Ball) o;
    return ball.color == this.color;// enum always use == to compare
  }


  public static void main(String[] args) {
    Ball ball = new Ball(Color.BLUE);
    System.out.println(ball.getColour());

    System.out.println(ball.getColour() == Color.BLUE);

    System.out.println(Color.BLUE.getHexcode());
  }
}
