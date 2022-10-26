import java.util.Random;
import java.util.Scanner;
public class RandomGuess2 {
    public static void main(String[] args) {
        Random rn = new Random();
        int numar = rn.nextInt(10) + 1;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Introduceti  nr  >>>");
        int answer = inputDevice.nextInt();
        if (answer == numar){
            System.out.println("Raspunsul este corect");
        }
        else if (answer > numar) {
            System.out.println("Numarul este mai mic");
        } else {
            System.out.println("Numarul este mai mare");
        }
    }
}