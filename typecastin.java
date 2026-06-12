
public class typecastin{

   public static void main(String[] args){
    

     System.out.print("string to int  ");
     String numstring = "12345";

     int n1 = Integer.parseInt(numstring);
     System.out.println("parse int way" + n1+"(math check :"+(n1+1)+")");

     int n2 = Integer.valueOf(numstring);
     System.out.println("parse int way "+n2+ "(math check : "+(n2+1)+")");

     String invalidString = "123abc";
     try{
      int badnumber = Integer.parseInt(invalidString);
     }
     catch(NumberFormatException e){
      System.out.println("error : cannot convert"+invalidString+" to int");
     }

   }




}