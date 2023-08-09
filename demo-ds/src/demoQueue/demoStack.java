package demoQueue;

import java.util.Stack;

public class demoStack {
  public static void main(String[] args) {
    // First In Last Out
    Stack<String> strs = new Stack<>();
    strs.push("abc");
    strs.push("def");
    System.out.println(strs.pop());// Removes the object at the top of this stack
    System.out.println("---");
    strs.push("xyz");
    strs.push("abc2");
    while (!strs.isEmpty())
      System.out.println(strs.pop());

    //
    strs.add("1");
    strs.add("2");
    strs.add("3");
    System.out.println(strs.pop());
  }
}
