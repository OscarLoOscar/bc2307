package linkedlist;

public class NodeList {
  Node head;


  public NodeList(Node head) {
    this.head = head;
  }

  public void add(Mode node) {
    this.head.next = node;// bug , catch the tail , not catch head
  }

  public void remove() {

  }

  public void insert(int index, Node node) {

  }

  public static void main(String[] args) {
    NodeList list = new NodeList(new Node(10));
    list.add(new Node(100));
    list.add(new Node(200));

  }
}
