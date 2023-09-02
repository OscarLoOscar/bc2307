package checked;

public class Student {
  String name;

  Long pocketMoney;

  public Student() {

  }

  public Student(String name) {
    this.name = name;
  }

  public void setName(String name) throws NameTooLongException {
    if (name.length() > 10)
      throw new NameTooLongException("Name is too long (>10)");
    this.name = name;
  }

  public void setName2(String name) {
    try {
      if (name.length() > 10)
        throw new NameTooLongException("Name is too long (>10)");
      this.name = name;
    } catch (NameTooLongException e) {
      System.out.println(e.getMessage());
    }
  }

  public void setMoney(Long money) throws AmountZeroException {
    if (money < 1)
      throw new AmountZeroException("Amount<=0");
    this.pocketMoney = money;
  }

  public static void main(String[] args) {
    Student student = new Student("John");
    try {
      int i = 10 / 0;
      // checked Exception
      student.setName("JOfbjofjnjefwgn");
      // checked exception , if exception , throw it to the caller,將錯誤交給input條友
      student.setMoney(-3l);
    } catch (NameTooLongException | AmountZeroException e) {
      System.out.println("Student Setter Issue , message : " + e.getMessage());
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());// 借用polymorphism兜底
    } finally {
      System.out.println("finally");
    }

    Student s2 = new Student();
    // s2.setName("asb ashcb skjdgn rsjgn");
    // s2.name.length();// null pointer ecception , unchecked exception , JVM
    // unknows

    // runtime need to fix the bug , check exception 一定要catch
    // extends runtime no need handle
  }
}
