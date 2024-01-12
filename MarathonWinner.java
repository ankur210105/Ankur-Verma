import java.util.Scanner;

public class MarathonWinner 
{

    public static void Winner()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of participants");
        int participants= sc.nextInt();
        String name[] =new String[participants];
        for(int l=0;l<participants;l++)
        {
            System.out.println("Enter the name of the runner");
            name[l]=sc.nextLine();
        }
        double ar[] =new double[participants];
        for(int i=0;i<participants;i++)
        {
            System.out.println("Enter the time " + name[i] + " took to complete the marathon");
            ar[i]=sc.nextDouble();
        }
        double pos1,pos2,calc=0.0;
        int j,k,n1=0,n2=0;
        for(j=0;j<participants;j++)
        {
            if (ar[j]>calc)
            {
                calc=ar[j];
                n1=j;
            }
        }
        pos1=calc;
        System.out.println("Best timing is"+pos1+"and it belongs to"+name[n1]);
        calc=0.0;
        for(k=0;k<participants;k++)
        {
            if(ar[k]>calc&&ar[k]<pos1)
                {
                    calc=ar[k];
                    n2=k;
                }
        }
        pos2=calc;
        System.out.println("Runner up's timing is"+pos2+"and it belongs to"+name[n2]);
    }
    public static void main(String args[])
    {   
        Winner();
    }
}