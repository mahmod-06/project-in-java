
package projec.of.degree;
import java.util.Scanner;

public class ProjecOfDegree {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("entar the number of degree in celsius");
        double f=input.nextDouble();
        double c=input.nextDouble();
         c=(f-32)/32;
         System.out.println(c);
         
       
    }
    
}
