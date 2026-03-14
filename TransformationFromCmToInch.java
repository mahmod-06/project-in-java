
package transformation.from.cm.to.inch;
import java.util.Scanner;

public class TransformationFromCmToInch {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
    System.out.println("entar the number in cm");
    double n=input.nextDouble();
    double inchvalue=n/2.54;
    System.out.println(inchvalue);
    }
    
}
