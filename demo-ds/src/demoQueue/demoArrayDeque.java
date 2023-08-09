package demoQueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class demoArrayDeque {
  public static void main(String[] args) {
    ArrayDeque<String> aDeque = new ArrayDeque<>();
    aDeque.add("abc1");
    aDeque.add("def");
    aDeque.add("abc2");
    System.out.println(aDeque.poll());// abc
    System.out.println(aDeque.size());// 2
    aDeque.add("xyz");// addLast() = add()
    System.out.println(aDeque.poll());// def
    aDeque.addFirst("ijk");// head
    System.out.println(aDeque.peek());
    aDeque.pollFirst();// ijk , pollFirst() = poll()
    //
    Deque<String> deque = new LinkedList<>();
    Queue<String> queue = new LinkedList<>();

    // arraydeque底層 ＝ array
    // linkedList底層 = 有.next
    // 底層結構影響性能
    /*
     * ->Interface Extends : 以Queue，Deque為引子：
     * 
     * 大家都係polymorphism，左面interface 能力(method)小於OR等於右邊class class可以引用多張合約
     * 
     * 因為Deque extends Queue，用Deque裝住收窄範圍
     * 
     * polymorphism 重點在收窄範圍 ，but why ?
     * 
     * 1.提高Readability ，extend 優勢
     * 
     * ，收窄使用範圍：知你重點係用呢種data structure黎做乜
     * 
     * 如果有一萬行code，第一句記比到重點人知個logic做乜 ->
     * 
     * eg : Queue : First in First out , Stack : First In Last Out
     * 
     * -> 令每種Data structure 維持獨特性， 自動度高，隨時extend / implement -> 靈活運用
     * 
     * 2.左邊唔改改右邊： 控制input parameter 既數據結構 ,唔搞亂原有data
     * 
     * 左手影響範圍,令programme簡單表達 右手影響input，背後行既底層logic不一樣
     * 
     * 3.
     * 
     * Collection<String> arraylist = new ArrayList<>();
     * 
     * List<String> list = new LinkedList<>();
     * 
     * Collection , List ->
     * 
     * 用collection放左邊-> 話比人聽會用埋List，Queue，Set
     * 
     * 用List-> only 用List
     * 
     * BY angus
     */
    run1(new LinkedList<>());// LinkedList
    run1(new ArrayDeque<>());// array
    // run1(new PriorityQueue<>());//comile - error

    run2(new LinkedList<>());
    run2(new ArrayDeque<>());
    run2(new PriorityQueue<>());

    List<Integer> test = new LinkedList<>();
    LinkedList<Integer> test2 = new LinkedList<>();
    List<Integer> test3 = new List<>();
    //Unresolved compilation problem: 
   // Cannot instantiate the type List

    System.out.println("TEST");
    System.out.println(test3);
  }



  public static void run1(Deque<String> deque) {
    deque.addFirst("ss");
    deque.addLast("ll");
  }

  public static void run2(Queue<String> queue) {
    queue.add("ss");
    queue.add("ss");
  }

}

