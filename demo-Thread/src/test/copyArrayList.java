package test;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class copyArrayList implements Runnable {
  private List<String> list;

  public copyArrayList(List<String> list) {
    this.list = list;
  }

  @Override
  public void run() {
    try {
      for (int i = 0; i < 10; i++) {
        list.add("b" + i);
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
  public static void main(String[] args) throws Exception {
    try {
      final CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
      list.add("a1");
      list.add("a2");
      list.add("a3");
      list.add("a4");
      list.add("a5");
      list.add("a6");

      Thread thread = new Thread(new copyArrayList(list));
      thread.start();

      for (String s : list) {
        System.out.println(s);
      }
    } catch (Exception e) {
      throw new Exception(e);
    }
  }
}
