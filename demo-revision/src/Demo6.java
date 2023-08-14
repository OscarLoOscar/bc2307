import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class Demo6 {

  public static void main(String[] args) {

    Deque<String> arrayDeque = new ArrayDeque<>();// array
    arrayDeque.addFirst("null");
    arrayDeque.addLast("null");
    arrayDeque.pollFirst();
    arrayDeque.pollLast();
    Deque<String> linkedList = new LinkedList<>(); // linkedList
    linkedList.addFirst("null");
    linkedList.addLast("null");
    linkedList.pollFirst();
    linkedList.pollLast();
    // ArrayDeque add無優勢
    Queue<String> arrayQueue = new ArrayDeque<>();// array
    arrayQueue.add("a");
    arrayQueue.poll();
    Queue<String> linkedQueue = new LinkedList<>();// array
    linkedQueue.add("a");
    linkedList.poll();

    Queue<String> pQueue = new PriorityQueue<>();// array
    pQueue.add("a");
    pQueue.poll();

    List<Integer> arrayList = new ArrayList<>();
    arrayList.add(3);
    arrayList.remove(3);
    List<Integer> linkedlist = new LinkedList<>();
    // list2.poll();
    linkedlist.add(3);
    linkedlist.remove(3);
    //
    arrayList.listIterator();
    // 右手邊決定.add()行乜野 , how to do
    // List care about 次序 , what can i do
    Stack<String> stack = new Stack<>();
    stack.add("");
    stack.remove(0);

    Vector<String> stack2 = new Stack<>();// Vector VS List
    stack2.add("abc");
    stack2.remove(0);

    Stack<String> stack3 = new Stack<>(); // Stack declare itself
    stack3.push("abc");
    stack3.pop();

  }
}
