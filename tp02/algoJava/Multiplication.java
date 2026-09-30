import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int n;
        int ligne;
        int colonne;
        int resultat;

        System.out.print("Taille de la table ? ");
        n = scanner.nextInt();
        System.out.println(n);

        System.out.print("  |  ");
        for (int i = 1; i <= n; i++){
            colonne = i;
            System.out.print(colonne + "   ");
        };
        System.out.println(" ");
        System.out.println("--|----------------------------------------- ");
        for (int i = 1; i <= n; i++){
            ligne = i;
            System.out.print(ligne + " |");

            for (int j = 1; j <= n; j++){
                colonne = j;
                resultat = ligne * colonne;
                System.out.print("  " + resultat + " ");
            }
            System.out.println(" ");

        };


    }
}



/*DEBUT

CONSTANTE n: ENTIER
VARIABLE ligne: ENTIER
VARIABLE colonne: ENTIER
VARIABLE resultat: ENTIER

ECRIRE("Taille de la table ?")
LIRE(n)

POUR colonne <- 1 A n
    ECRIRE_SANS_RETOUR(colonne, " ")
FIN POUR

ECRIRE("")

POUR ligne <- 1 A n

    ECRIRE_SANS_RETOUR(ligne, " | ")

    POUR colonne <- 1 A n

        resultat <- ligne * colonne
        ECRIRE_SANS_RETOUR(resultat, " ")

    FIN POUR

    ECRIRE("")

FIN POUR

FIN*/
