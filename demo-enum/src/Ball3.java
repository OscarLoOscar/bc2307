
public class Ball3 {
  Color3 color; // "RE D" , "RED", "red","R ed"

  public Ball3(Color3 color) {
    this.color = color;
  }

  public Color3 getColour() {
    return this.color;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Color3))
      return false;
    Ball3 ball = (Ball3) o;
    return ball.color == this.color;// enum always use == to compare
  }


  public static void main(String[] args) {
    Ball3 ball = new Ball3(Color3.BLUE);
    System.out.println(ball.getColour());

    System.out.println(ball.getColour() == Color3.BLUE);

    System.out.println(Color3.BLUE.getHexcode());
  }
}
