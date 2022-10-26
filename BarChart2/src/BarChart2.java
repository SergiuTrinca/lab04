import java.util.Scanner;
public class BarChart2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduceti scorul:");
        int score=sc.nextInt();
        int count=score/10;
        int i=1;
        while(i<=count)
        {
            System.out.print("*");
            i++;
        }

    }

}
