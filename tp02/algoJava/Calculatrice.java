import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double resultat;

        System.out.print("Premier nombre ? ");
        double nb1 = scanner.nextDouble();

        System.out.print("Opération ? (+, -, *, /)");
        String operateur = scanner.next();

        System.out.print("Deuxième nombre ? ");
        double nb2 = scanner.nextDouble();

        switch (operateur) {

    case "+":
        resultat = nb1 + nb2;
        System.out.println("Le résultat de votre addition est : " + resultat);
        break;
    case "-":
        resultat = nb1 - nb2;
        System.out.println("Le résultat de votre soustraction est : " + resultat);
        break;
    case "*":
        resultat = nb1 * nb2;
        System.out.println("Le résultat de votre multiplication est : " + resultat);
        break;
    case "/":
        if (nb2 == 0) {
            System.out.println("Erreur : division par zero");
        break;
        }
        resultat = nb1 / nb2;
        System.out.println("Le résultat de votre division est : " + resultat);
        break;
    default:
        System.out.println("Erreur : operateur inconnu");
}
       
        scanner.close();
    }
}















/*DEBUT

    CONSTANTE nb1: REEL
    CONSTANTE nb2: REEL
    CONSTANTE operateur: CARACTERE
    VARIABLE resultat: REEL

    ECRIRE("Premier nombre ?")
    LIRE(nb1)

    ECRIRE("Operateur ?")
    LIRE(operateur)

    ECRIRE("Deuxième nombre ?")
    LIRE(nb2)

    SELON operateur

        CAS "+"
            resultat <- nb1 + nb2
            ECRIRE("Résultat: ", resultat)

        CAS "-"
            resultat <- nb1 - nb2
            ECRIRE("Résultat: ", resultat)

        CAS "*"
            resultat <- nb1 * nb2
            ECRIRE("Résultat: ", resultat)

        CAS "/"
            SI nb2 = 0
                ECRIRE("Erreur : division par zéro")
            SINON
                resultat <- nombre1 / nombre2
                ECRIRE("Résultat: ", resultat)
            FIN SI

        DEFAUT
            ECRIRE("Erreur : opérateur inconnu")

    FIN SELON

FIN*/
