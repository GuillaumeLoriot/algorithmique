import java.util.Scanner;

public class GrandPetit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int nombreMystere = (int)(Math.random() * 101);
        int proposition;
        int compteur = 0;
        System.out.println("Le nombre mystère à été choisi, essayez de le deviner");

        do {
            System.out.print("Votre proposition : ");
            proposition = scanner.nextInt();
            if (proposition < nombreMystere){
                System.out.println("ç'est plus grand");
            } else if (proposition > nombreMystere) {
                System.out.println("ç'est plus petit");
            } else {
                System.out.println("Bravo, trouvé en : " + compteur + " essais");
            }


        } while (proposition != nombreMystere);

        scanner.close();
    }
    
}





/*DEBUT

    CONSTANTE nombreMystere: ENTIER <- ALEATOIRE ENTRE 1 ET 100
    VARIABLE proposition: ENTIER
    VARIABLE compteur: ENTIER <- 0

    FAIRE

        ECRIRE("Votre proposition ?")
        LIRE(proposition)

        compteur <- compteur + 1

        SI proposition < nombreMystere
            ECRIRE("Plus grand !")
        SINON SI proposition > nombreMystere
            ECRIRE("Plus petit !")
        SINON
            ECRIRE("Bravo ! Trouvé en ", compteur, " essais")
        FIN SI

    TANT QUE proposition != nombreMystere

FIN*/
