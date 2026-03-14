
package transformation.from.inch.to.cm;
import java.util.Scanner;

public class TransformationFromInchToCm {

  
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("entar the number in inch");
    double n=input.nextDouble();
    double cmvalue=n*2.54;
    System.out.println(cmvalue);
    
    }
    
}
