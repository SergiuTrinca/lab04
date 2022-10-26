import java.util.Scanner;
public class IncreasedProduction {
    public static void main(String[] args) {
        display();
    }
    public static void display()
    {
        int muncitor,productie=4000;
        for(int i=1;i<=24;i++)
        {
            muncitor=(6*productie)/100;
            productie=muncitor+productie;
            if(productie == 7000)
            {
                System.out.print(" \n Productia a ajuns la 7000,cest lucru inseamna o marire  "+productie );
                System.out.print(" \n Luna  "+i );
            }
        }
    }
}