import java.util.Scanner;

public class ifelse {
    

    public static void main(String[] args) {
        int a;
        Scanner input= new Scanner(System.in);
        

        System.out.print("age :");
        int age= input.nextInt();

        if((age>=0) && (age<=5))
            {
              System.out.println("baby");
            }
        else if((age>=6) && (age<=12))
            {
               System.out.println("child");
            }
        else if((age>=13) && (age<=19))
            {
                System.out.println("Teenager");
            }
        else if((age>=20) && (age<=50))
            {
                System.out.println("Adult");
            }
        else{
                System.out.println("old");
            }
       

        


        

    } 
}
