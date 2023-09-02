public class Phone {
  String number;
  Colour colour;
  double weight;

  public Phone(Builder builder) {// 用builder 黎set野
    this.number = builder.number;
    this.colour = builder.colour;
    this.weight = builder.weight;

  }

  @Override
  public String toString() {
    return "number : " + this.number + //
        "colour : " + this.colour + //
        " weight + " + this.weight;//
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String number;
    private Colour colour;
    private double weight;

    public Builder number(String number) {// setter
      this.number = number;
      return this;
    }

    public Builder colour(Colour colour) {// setter
      this.colour = colour;
      return this;
    }

    public Builder weight(double weight) {// setter
      this.weight = weight;
      return this;
    }

    public Phone build() {
      return new Phone(this);
    }
  }

  public static void main(String[] args) {// builder pattern
    // Chain Method : replace fifferent
    Phone phone = new Phone.Builder()//
        .colour(Colour.BLACK)//
        .number("1234568")//
        .weight(3.7d)//
        .build();

    Phone phone2 = Phone.builder().build();
  }
}
