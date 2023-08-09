package linkedlist;

public class Node {
  int data;// data can be any type
  Node next;// address of next node
  // pass by reference

  public Node() {

  }

  public Node(int data) {
    this.data = data;
  }

  // store the address of next node
  public static void main(String[] args) {
    Node head = new Node(10);

  }
}
