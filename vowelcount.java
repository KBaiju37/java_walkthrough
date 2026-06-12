import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class vowelcount {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int acount = 0,ecount = 0,icount = 0,ocount = 0,ucount = 0;
        System.out.println(word);
        for (int i=0;i<word.length();i++)
            {

                char c=word.charAt(i);
                switch(c) {
                  case 'a' :
                  acount++;
                  break;

                  case 'e':
                    ecount++;
                    break;

                  case 'i':
                    icount++;
                    break;

                  case 'o':
                    ocount++;
                    break;
                
                  case 'u':
                    ucount++;
                    break;


                }

      
            
            
            
            }
              if (acount==0 && ecount==0 && ocount==0 && icount==0 && ucount==0){
                System.err.println("doesnt contain vowel");
                 }else{
                    System.err.println("it contains vowel");
                    }
            System.out.println("vowel" + " count "+'\n'+"a :"+ acount+'\n'+"e :"+ ecount+'\n'+"i :"+ icount+'\n'+"o :"+ ocount+'\n'+"u :"+ ucount+'\n');


            scanner.close();
    }
}
