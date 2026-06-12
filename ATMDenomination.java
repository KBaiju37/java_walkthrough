import java.util.Scanner;

public class ATMDenomination {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter amount :");
         int amount = scanner.nextInt() ;
        int[] denominations = {500,200,100,50};
        System.out.println("Breakdown for amount Rupees : "+ amount );
        
        for(int note : denominations) {
        int count = amount/note ;
        amount %= note;

        if(count >0){
            System.out.println("rupees :" + note + "x"+ count);}}

        if (amount >0){
            System.out.println("Remaining amount ");
        }

    }
    
}
