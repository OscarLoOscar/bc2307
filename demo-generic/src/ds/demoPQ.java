package ds;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class demoPQ {
  public static void main(String[] args) {
    // 特性
    // Priority : natural order by Default
    Queue<String> pq1 = new PriorityQueue();
    pq1.add("bcd");
    pq1.add("abc");
    pq1.add("def");
    pq1.add("AAA");// base on ASCII
    System.out.println(pq1.poll()); // abc

    // Priority : Custom Priority by Comparator
    //
    Queue<String> pq2 = new PriorityQueue(new SortByDescending()); // 用constructor 由day1開始限制排序
    pq2.add("bcd");
    pq2.add("abc");
    pq2.add("def");
    System.out.println(pq2.poll()); // def
    // Collections.sort(pq2, new SortByDescending());
    /* Collections.sort() 前面放List， 放唔到queue，所以要係constructor 到放條件 */

    Queue<Integer> pq3 = new PriorityQueue<>((o1, o2) -> o2 - o1); // 用constructor 由day1開始限制排序
    pq3.add(1);
    pq3.add(2);
    pq3.add(5);
    pq3.add(10);
    pq3.add(9);
    pq3.add(3);
    pq3.add(6);
    System.out.println(pq3.poll()); // def
    while (!pq3.isEmpty()) {
      Integer output = pq3.poll();
      System.out.print(output + " ");
    }




    //


    
  }
}
/*
 * 佢地頭 11 個week Full time, 之後 5 個禮拜Elective,
 * : 4 moudue , last mou -> Data / frontEnd
 * 一半chose data , but cant get a job -> marketing / business sense ,
 * 咁最後五個禮拜Elective 教佢地個 trainers 係咪應該唔係開頭 11個 月教佢地個trainer? ->不同Module diff 人教
 * 
 * 同埋頭 11 個禮拜，係咪唔同topic 唔同trainer 教？同埋最後分 elective 之後又唔同 trainer ＋ TA support.
 * Daily 課程安排 ->每日上堂節奏，課程進度
 * 
 */