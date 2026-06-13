  class Smartp{
     String brand;
     String model;
     int storage;

     public Smartp(){
      this.brand = "Unknown";
      this.model = "generic";
      this.storage = 128;
      System.out.println("no parameterised "+ "constructor called");
     }

     public Smartp(String a ,String  b , int c){
      this.brand = a;
      this.model = b;
      this.storage = c;
      System.out.println("parameterised Constructor called with\n"+"brand :"+a+"\n"+"model :"+b+"\n"+"storage :"+c);
     }
}


public class constructor {
    public static void main(String[] args) {

        Smartp obj = new Smartp();
        Smartp obj2 = new Smartp("motalora","G33",128);
        
    }
}
