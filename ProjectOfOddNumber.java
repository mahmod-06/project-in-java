
package project.of.odd.number;
import java.util.Scanner;

        
public class ProjectOfOddNumber {

    
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("entar the number");
        int n=input.nextInt();
        if(n%2==1){
            System.out.println("yes:the number is odd");
        }
        else  
            System.out.println("please rewrite the number");
    }
    
}
