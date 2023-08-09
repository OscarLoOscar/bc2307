import java.util.ArrayList;

public class Pocket {
  ArrayList<Ball5> balls;// = new ArrayList<>();
  // just attribute , 唔需要比生命佢

  public Pocket() {
    this.balls = new ArrayList<>();// new pocket比左object，ball一定唔會null
  }

  // public Pocket() {
  // this.balls = null;
  // }
  public boolean isFull() {
    return this.balls.size() >= 5;
  }

  public void add(Ball5 ball) {
    // if numbers of balll > 5 , remove the 1set (idx = 0 ) , and add
    // if (this.balls.size() > 5) {
    // this.balls.remove(0);
    // this.balls.add(ball);
    // return;
    // }
    this.balls.add(ball);// run time error
  }

  public void removeFirstBall(Ball5 ball) {
    this.balls.remove(0);// run time
  }

  public void remove(Ball5 ball5) {
    this.balls.remove(ball5);
  }

  public void remove(int ballId) {// OverLoading
    for (Ball5 b : this.balls) {
      if (b.getId() == ballId) // primitive
        this.balls.remove(b);
      return; // remove the first one and return
      // without return : ConcurrentModificationException
      //return: 从当前的方法中退出,返回到该调用的方法的语句处,继续执行。 記
    }
  }

  public void remove1(int ballId) {
    for (int i = 0; i < this.balls.size(); ++i) {
      if (this.balls.get(i).getId() == ballId) {
        this.balls.remove(i);
      }
      // return;
    }
  }

  // @Override
  // public String toString() {
  // return this.balls.toString();
  // }

  public int getSize() {
    return this.balls.size();
  }

  public int totalScore() {
    int sum = 0;
    for (Ball5 b : this.balls) {
      sum += b.getScore();
    }
    return sum;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (Ball5 b : this.balls) {
      sb.append(b.toString());
      sb.append(",");
    }
    sb.append("]");
    return sb.toString();
  }
}
