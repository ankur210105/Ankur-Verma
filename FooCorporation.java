import java.util.Scanner;
public class FooCorporation {
    //pay is calculated
    /*Pay Dynamics
     * Minimum wage=$8/per hour
     * Overtime starts after 40 hours
     * Pay when employee is doing overtime=bas pay*1.5
     * Maximum hours employee can work in a week = 60 hours
     */
    public static void pay()
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the base pay(per hour)");
        double p=obj.nextDouble();
        double wage=0.0;
        if(p<8)
            System.out.println("Pay is less than minimum wage");
        else
        {
            System.out.println("Enter the number of hours worked");
            int h=obj.nextInt();
            if (h>40&&h<60) 
                wage=40*p+1.5*p*(h-40);
            else if(h>60)
                System.out.println("An employee can work a maximum of 60 hours in a week");
            else
                wage=h*p;
        }
        System.out.println("The pay of the employee is"+ wage);
        }
        //main invoked
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENter the name of the employee");
        String name=sc.nextLine();
        pay();
    }
}