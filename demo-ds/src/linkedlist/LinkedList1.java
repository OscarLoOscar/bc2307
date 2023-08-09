package linkedlist;

import java.util.ArrayList;
import java.util.List;
import linkedlist.LinkedList1.ListNode;

public class LinkedList1 {
  String str;
  LinkedList1 node;

  // target : save String
  public LinkedList1() {

  }

  public LinkedList1(String str) {
    this.str = str;
  }

  public void setStr(String str) {
    this.str = str;
  }

  public void setNode(LinkedList1 node) {
    this.node = node;
  }

  public String getStr() {
    return this.str;
  }

  public LinkedList1 getNode() {
    return this.node;
  }


  //
  public int getDecimalValue(ListNode head) {
    int ans = 0;
    while (head != null) {
      ans = ans * 2 + head.val;
      head = head.next;
    }
    return ans;
  }

  public static void main(String[] args) {
    LinkedList1 ll = new LinkedList1();
    ll.setStr("head");
    ll.setNode(new LinkedList1("body"));
    ll.getNode().setNode(new LinkedList1("tail"));

    LinkedList1 head = ll;
    String str = "";
    // while (head.getNode() != null) {//bug
    while (head != null) {// bug
      str += head.getStr();
      head = head.getNode(); // object reference
    }

    // LinkedList
    List<String> l1 = new ArrayList<>();// 底層結構不同，影響速度 記
    // add 一億次，LinkedList，沒有array，利用object reference儲存數據
    // read 多 ,ArrayList，速度快
    // db拎data ，client static ArrayList 拎data有優勢
    // 左手邊有interface放interface
    // LinkedList有兩張contract

  }
}
