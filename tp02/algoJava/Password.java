import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String mdp;
        boolean longueurValide = false;
        boolean majuscule = false;
        boolean minuscule = false;
        boolean chiffre = false;
        char charactere;
        String[] section ={"Mot de passe  |  ", "Long ≥ 8  |  ", "Majuscule  |  ", "Minuscule  |  ", "Chiffre  |  ", "Valide ? "  };


        System.out.print("Tester votre mot de passe:");
        mdp = scanner.next();
        System.out.println(mdp);

        longueurValide = mdp.length() >= 8;

        for (int i = 1; i < mdp.length(); i++){

            charactere = mdp.charAt(i);

            if (charactere >= 'A' && charactere <= 'Z'){
                majuscule = true;
            }
            if (charactere >= 'a' && charactere <= 'z'){
                minuscule = true;
            }
            if (charactere >= '0' && charactere <= '9'){
                chiffre = true;
            }
        }

        for (int j = 0; j < section.length; j++){
            System.out.print(section[j]);
        }

        System.out.println("_");
        System.out.println("-------------------------------------------------------------------------------");

        System.out.print(mdp + "             ");

        String symbol = longueurValide ? "✓             " : "✗             ";
        System.out.print(symbol);
        symbol = majuscule ? "✓             " : "✗             ";
        System.out.print(symbol);
        symbol = minuscule ? "✓             " : "✗             ";
        System.out.print(symbol);
        symbol = chiffre ? "✓          " : "✗          ";
        System.out.print(symbol);
        if (longueurValide && majuscule && minuscule && chiffre){
            symbol = "✓ ";
            System.out.print(symbol);
        } else {
            symbol = "✗ ";
            System.out.println(symbol);
        }



    }
}



/*DEBUT

CONSTANTE motDePasse: CHAINE
VARIABLE longueurValide: BOOLEEN <- FAUX
VARIABLE majuscule: BOOLEEN <- FAUX
VARIABLE minuscule: BOOLEEN <- FAUX
VARIABLE chiffre: BOOLEEN <- FAUX
VARIABLE i: ENTIER
VARIABLE caractere: CARACTERE

ECRIRE("Mot de passe ?")
LIRE(motDePasse)

longueurValide <- LONGUEUR(motDePasse) >= 8

POUR i <- 0 A LONGUEUR(motDePasse) - 1

    caractere <- motDePasse[i]

    SI caractere >= "A" ET caractere <= "Z"
        majuscule <- VRAI
    FIN SI

    SI caractere >= "a" ET caractere <= "z"
        minuscule <- VRAI
    FIN SI

    SI caractere >= "0" ET caractere <= "9"
        chiffre <- VRAI
    FIN SI

FIN POUR

SI longueurValide
    ECRIRE("Longueur >= 8 : ✓")
SINON
    ECRIRE("Longueur >= 8 : ✗")
FIN SI

SI majuscule
    ECRIRE("Majuscule : ✓")
SINON
    ECRIRE("Majuscule : ✗")
FIN SI

SI minuscule
    ECRIRE("Minuscule : ✓")
SINON
    ECRIRE("Minuscule : ✗")
FIN SI

SI chiffre
    ECRIRE("Chiffre : ✓")
SINON
    ECRIRE("Chiffre : ✗")
FIN SI

SI longueurValide ET majuscule ET minuscule ET chiffre
    ECRIRE("Valide")
SINON
    ECRIRE("Invalide")
FIN SI

FIN*/
