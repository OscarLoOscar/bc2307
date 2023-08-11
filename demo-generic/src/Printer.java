// Generic
//T is not a Object
// T -> 由compile time 開始放乜都得 -> String , Integer...
public class Printer<T> {// step 1. declare class signature,add <> , T represent Type / any class
  // 描述
  T value;
  Object obj;
  T[] numbers; //queue

  public T getValue() {
    return this.value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public void setObject(Object obj) { // run time polymorphism , need downcast -> override equals , hashCode
    this.obj = obj;
  }

  public Object getObject() {
    return this.obj;
  }

  public static void main(String[] args) {
    // 使用
    Printer<String> printer = new Printer<>();// Strong type checking -> check if you put a real class into <>
    printer.setValue("abc");
    System.out.println(printer.getValue());
    //
    Printer<Integer> printInt = new Printer<>();
    printInt.setValue(100);
    System.out.println(printInt.getValue());
    //
    Printer<Boolean> printBoolean = new Printer<>();
    printBoolean.setObject("str");
    System.out.println(((String) printBoolean.getObject()).split(" "));

  }
}
