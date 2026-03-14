
package projec.of.degree.pkg2;
import java.util.Scanner;

public class ProjecOfDegree2 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("entar the number of degree in celsius");
        double f=input.nextDouble();
        
        double c=(f-32)/1.8;
         System.out.println(c);
    }
    
}
