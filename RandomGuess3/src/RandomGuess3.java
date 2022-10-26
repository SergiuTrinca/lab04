import java.util.Random;
import java.util.Scanner;
public class RandomGuess3 {
    public static void main(String[] args) {
        int i=0;
        Random rn = new Random();
        int numar = rn.nextInt(10) + 1;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Introduceti  nr  >>>");
        int answer = inputDevice.nextInt();
        while(answer != numar ){
            i++;
        }
          System.out.println("Numarul de incercari a fost de "+ i);
        }
}


