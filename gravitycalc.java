import java.util.Scanner;
public class gravitycalc
{
    //function that calculates the position of falling object
    /*x(f) = 0.5 * at^2 + v(i) + x(i)
      a = acceleration(m/s^2)
      t = time(in seconds)
      v(i) = initial velocity
      x(i) = initial position */
    static double position()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the acceleration");
        double a=obj.nextDouble();
        System.out.println("Enter the time( in seconds )");
        int t=obj.nextInt();
        System.out.println("Enter the initial velocity");
        double v=obj.nextDouble();
        System.out.println("Enter the initial position");
        double p=obj.nextDouble();
        return 0.5*(a*t*t)+(v*t)+p; //returns the final position
    }
    //main invoking
    public static void main(String[] args) 
    {
        double pos=position();
        System.out.println("The final position of the body is"+pos);    
        //final position of the body is printed
    }
}