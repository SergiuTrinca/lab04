import java.util.Scanner;
public class BarChart {
    public static void main(String[] args) {
        display1();
    }
    public static void display1()
    {
        int a,b,c,d,e;
        System.out.print("Cate puncte are Art");
        Scanner inputDevice = new Scanner(System.in);
        a= inputDevice.nextInt();
        System.out.print("Cate puncte are Bob");
        b=inputDevice.nextInt();
        System.out.print("Cate puncte are Cal");
        c=inputDevice.nextInt();
        System.out.print("Cate puncte are Dan");
        d=inputDevice.nextInt();
        System.out.print("Cate puncte are Eli");
        e=inputDevice.nextInt();
        stele(a);
        stele2(b);
        stele3(c);
        stele4(d);
        stele5(e);
    }
    public static void stele(int a2)
    {
        System.out.print("Punctele jocului  \n ");
        System.out.print("Art");
        for(int i=0;i<=a2;i++)
        {
            System.out.print("*");
        }
    }

    public static void stele2(int a2)
    {
        System.out.print(" \n Bob");
        for(int i=0;i<=a2;i++)
        {
            System.out.print("*");
        }
    }
    public static void stele3(int a2)
    {
        System.out.print("\n CAL");
        for(int i=0;i<=a2;i++)
        {
            System.out.print("*");
        }}
    public static void stele4(int a2)
    {
        System.out.print("\nDAN");
        for(int i=0;i<=a2;i++)
        {
            System.out.print("*");
        }
    }
    public static void stele5(int a2)
    {
        System.out.print("\n ELI");
        for(int i=0;i<=a2;i++)
        {
            System.out.print("*");
        }
    }

}