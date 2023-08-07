public enum OrderStatus {
  ORDERPLACED(0), //
  PROCESSING(1), //
  PREPARETOSHIP(2), //
  SHIPPED(3), //
  DELIVERED(4),//
  ;

  int id;

  private OrderStatus(int id) {
    this.id = id;
  }

  private int getId() {
    return this.id;
  }

  public boolean isForward(OrderStatus status) {
    return status.getId() > this.id;
  }

  public static void main(String[] args) {
    System.out
        .println(OrderStatus.ORDERPLACED.isForward(OrderStatus.PROCESSING));// true
  }
}
