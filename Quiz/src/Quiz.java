import java.util.Scanner;

import static java.lang.System.*;

public class Quiz {
    public static void main(String[] args) {
        int corect=0;
        int gresit=0;
        int alegeri;
        int cantec1;
        int cantec2;
        int cantec3;
        int cantec4;
        int cantec5;
        Scanner scan = new Scanner(System.in);
        System.out.println("Cine interpreteaza piesa 'Locked Away':");
        System.out.println("Alege 1 pentru R. City & Adam Levine. \nAlege 2 pentru Justin Bieber.  \nAlege 3 pentru Selena Gomez. \nAlege 4 pentru Katy Perry.");
        cantec1 = scan.nextInt();
        if (cantec1 != 1) {
            System.out.println("Gresit.  R. City & Adam Levine e raspunsul corect .");
            gresit++;
        }

        {
            while (cantec1 == 1) {
                System.out.println("Felicitari!Raspuns corect!");

                cantec1++;
                corect++;
            }
            System.out.println();
        }


        System.out.println("Cine interpreteaza acest cantec 'Beauty and the beast':");
        System.out.println("Alege 1 pentru R. City & Adam Levine's. \nAlege 2 pentru Justin Bieber.  \nAlege 3 pentru Selena Gomez. \nAlege 4 pentru Katy Perry.");
        cantec2 = scan.nextInt();


        if (cantec2 != 2) {
            System.out.println("Gresit.  Justin Bieber e raspunsul corect.");
            gresit++;
        }

        {
            while (cantec2 == 2) {
                System.out.println("Felicitari!Raspuns corect! ");
                cantec2++;
                corect++;
            }
            System.out.println();
        }
        System.out.println("Cine canta 'Heal the world':");
        System.out.println("Alege 1 pentru R. City & Adam Levine's. \nAlege 2 pentru Micheal Jackson.  \nAlege 3 pentru Selena Gomez. \nAlege 4 pentru Katy Perry.");
        cantec4 = scan.nextInt();


        if (cantec4 != 2) {
            System.out.println("Gresit.  Micheal Jackson e raspunsul corect.");
            gresit++;
        }

        {
            while (cantec4 == 2) {
                System.out.println("Raspunsul este corect");
                cantec4++;
                corect++;
            }
            System.out.println();
        }

        System.out.println("Cine canta 'Roar':");

        System.out.println("Alege 1 pentru R. City & Adam Levine's. \nAlege 2 pentru Justin Bieber.  \nAlege 3 pentru Selena Gomez. \nAlege 4 pentru Katy Perry.");
        cantec3 = scan.nextInt();


        if (cantec3 != 4) {

            System.out.println("Gresit.  Katy Perry este corect.");
            gresit++;
        }

        {
            while (cantec3 == 4) {
                System.out.println("Felicitari1Raspuns corect!");
                cantec3++;
                corect++;
            }
            System.out.println();
        }
        System.out.println("Cine canta 'The Heart Wants What It Wants ':");

        System.out.println("Alege 1 pentru R. City & Adam Levine's. \nAlege 2 pentru Justin Bieber.  \nAlege 3 pentru Selena Gomez. \nAlege 4 pentru Katy Perry.");
        cantec5 = scan.nextInt();
        if (cantec5 != 3) {
            System.out.println("Gresit  Selena Gomez este corect.");
            gresit++;
        }
        {
            while (cantec5 == 3) {
                System.out.println("Felicitari!E corect1");
                cantec5++;
                corect++;
            }
            System.out.println();
        }
        System.out.println("Numar raspunsuri corecte = "+ corect+ "\n si Numar raspunsuri gresite = "+ gresit);
    }}