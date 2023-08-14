package Comparator;

import java.util.Comparator;

public class SortByCard implements Comparator<Paper> {

  @Override
  public int compare(Paper o1, Paper o2) {
    return o1.size > o2.size ? 1 : -1;
  }

}
