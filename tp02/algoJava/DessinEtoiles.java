import java.util.Scanner;

//-------------------Exercice 6 Partie A : Triangle-------------------

public class DessinEtoiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        /*System.out.println("Taille triangle ? ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++){

            for (int j = 0; j < i; j++){
                System.out.print("*");
            }

            System.out.println("");
        }




        //-------------------Exercice 6 Partie B : Triangle inverse-------------------

        System.out.println("Taille triangle inversé ? ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++){

            for (int j = n; j >= i; j--){
                System.out.print("*");
            }

            System.out.println("");
        }


        //-------------------Exercice 6 Partie C : Pyramide centrée-------------------
        //ici je remplace les nom classique i, j etc par des nom plus parlant por mieux représenter les espaces et étoiles nécéssaire


        System.out.println("Taille pyramide ? ");
        n = scanner.nextInt();

        for (int ligne = 1; ligne <= n; ligne++) {

            for (int espace = 1; espace <= n - ligne; espace++) {
                System.out.print(" ");
            }

            for (int etoile = 1; etoile <= 2 * ligne - 1; etoile++) {
                System.out.print("*");
            }

            System.out.println("");
        }*/






        //-------------------Exercice 6 Partie D : Losange-------------------


        System.out.println("Taille losange ? ");
        n = scanner.nextInt();

        for (int ligne = 1; ligne <= n; ligne++) {

            for (int espace = 1; espace <= n - ligne; espace++) {
                System.out.print(" ");
            }

            for (int etoile = 1; etoile <= 2 * ligne - 1; etoile++) {
                System.out.print("*");
            }

            System.out.println("");
        }

        for (int ligne = n - 1; ligne >= 1; ligne--) {

            for (int espace = 1; espace <= n - ligne; espace++) {
                System.out.print(" ");
            }

            for (int etoile = 1; etoile <= 2 * ligne - 1; etoile++) {
                System.out.print("*");
            }

            System.out.println();
        }





    }
}




/*
-------------------Exercice 6 Partie A : Triangle-------------------

DEBUT

CONSTANTE n: ENTIER
VARIABLE ligne: ENTIER
VARIABLE etoile: ENTIER

ECRIRE("Taille ?")
LIRE(n)

POUR ligne <- 1 A n

    POUR etoile <- 1 A ligne
        ECRIRE_SANS_RETOUR("*")
    FIN POUR

    ECRIRE("")

FIN POUR

FIN


-------------------Exercice 6 Partie B : Triangle inverse-------------------

DEBUT

CONSTANTE n: ENTIER
VARIABLE ligne: ENTIER
VARIABLE etoile: ENTIER

ECRIRE("Taille ?")
LIRE(n)

POUR ligne <- n A 1

    POUR etoile <- 1 A ligne
        ECRIRE_SANS_RETOUR("*")
    FIN POUR

    ECRIRE("")

FIN POUR

FIN


-------------------Exercice 6 Partie C : Pyramide centrée-------------------

DEBUT

CONSTANTE n: ENTIER
VARIABLE ligne: ENTIER
VARIABLE espace: ENTIER
VARIABLE etoile: ENTIER

ECRIRE("Taille ?")
LIRE(n)

POUR ligne <- 1 A n

    POUR espace <- 1 A n - ligne
        ECRIRE_SANS_RETOUR(" ")
    FIN POUR

    POUR etoile <- 1 A (2 * ligne - 1)
        ECRIRE_SANS_RETOUR("*")
    FIN POUR

    ECRIRE("")

FIN POUR

FIN


-------------------Exercice 6 Partie D : Losange-------------------

DEBUT

CONSTANTE n: ENTIER
VARIABLE ligne: ENTIER
VARIABLE espace: ENTIER
VARIABLE etoile: ENTIER

ECRIRE("Taille ?")
LIRE(n)

POUR ligne <- 1 A n

    POUR espace <- 1 A n - ligne
        ECRIRE_SANS_RETOUR(" ")
    FIN POUR

    POUR etoile <- 1 A (2 * ligne - 1)
        ECRIRE_SANS_RETOUR("*")
    FIN POUR

    ECRIRE("")

FIN POUR

POUR ligne <- n - 1 A 1

    POUR espace <- 1 A n - ligne
        ECRIRE_SANS_RETOUR(" ")
    FIN POUR

    POUR etoile <- 1 A (2 * ligne - 1)
        ECRIRE_SANS_RETOUR("*")
    FIN POUR

    ECRIRE("")

FIN POUR

FIN*/
