package person;

import java.util.List;

public interface Swimable {
  void swim();

  // extends用黎描述範圍
  // public static <T extends Swimable> void start(List<T> humans) {// 限制human
  // 一定有swim()
  // wildcard :
  public static void start(List<? extends Swimable> humans) {
    for (Swimable human : humans) {
      human.swim();
    }
  }
}
