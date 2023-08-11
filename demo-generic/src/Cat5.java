public class Cat5 extends Animal { // parent 自動繼承，可以唔override

  private Cat5(String name) {
    super(name);
  }

  public static Cat5(String name){
    return new Cat5(name);
  }

  
}




  

  