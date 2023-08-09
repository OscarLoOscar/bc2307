package demoQueue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class demoLinkedList {
  // 最簡單queue
  public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>();
    // First In First Out
    queue.add("hello");
    queue.add("world");
    // System.out.println(queue.poll());
    System.out.println(queue.peek());// 望一望,無出
    System.out.println(queue.poll());// 彈出黎
    System.out.println(queue.poll());
    System.out.println(queue.size());// 0

    queue.add("abc");
    queue.add("def");
    queue.add("xyZ");
    System.out.println(queue.remove("def"));// true
    System.out.println(queue.poll());// abc
    System.err.println(queue.offer("ijk"));// seems like add
    System.out.println(queue.add("test"));
    System.err.println(queue.offer("ijk"));
    System.out.println(queue.size());

    // if (queue.contains("ijk"))
    // queue.remove("ijk");
    // for (String s : queue) {
    // System.out.println("s : " +s);
    // }
    System.out.println("before : " + queue.size());

    Queue<String> backup1 = new LinkedList<>(queue);
    Queue<String> backup = queue;
    while (!queue.isEmpty())
      System.out.println(queue.poll());

    System.out.println(backup.size());// 0 ,but why?
    System.out.println(backup1.size());// 4


    LinkedList<Integer> queueNum = new LinkedList<>();
    queueNum.add(10);// 1
    queueNum.add(9);// 2
    queueNum.add(0);// 3
    queueNum.add(-3);// 4
    queueNum.add(100);// 5

    Stack<Integer> stack = new Stack<>();
    int countEven = 0;
    while (countEven < 2) {
      if (queueNum.peek() % 2 == 0)
        countEven++;
      stack.push(queueNum.poll());
      if (countEven == 2) {
        stack.pop();
        while (!stack.isEmpty()) {
          queueNum.add(0, stack.pop());
        }
      }
    }
    System.out.println(queueNum); // [10, 9, -3, 100]

  }
}

