import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int n;

        System.out.print("Choisir un nombre maximum : ");
        n = scanner.nextInt();

        for (int i = 1; i < n; i++){
            String resultat = "";
            if (i % 3 == 0){
                resultat = resultat + "Fizz";
            }
            if (i % 5 == 0){
                resultat = resultat + "Buzz";
            }
            if (i % 7 == 0){
                resultat = resultat + "Wazz";
            }
            if (resultat.equals("")){
                System.out.print(i);
            } else{
                System.out.print(resultat);
            }
        }

        scanner.close();
    }
}






/*DEBUT

    CONSTANTE n: ENTIER
    VARIABLE i: ENTIER
    VARIABLE resultat: CHAINE

    ECRIRE("Nombre maximum ?")
    LIRE(n)

    POUR i <- 1 A n

        resultat <- ""

        SI i % 3 = 0
            resultat <- resultat + "Fizz"
        FIN SI

        SI i % 5 = 0
            resultat <- resultat + "Buzz"
        FIN SI

        SI i % 7 = 0
            resultat <- resultat + "Wazz"
        FIN SI

        SI resultat = ""
            ECRIRE(i)
        SINON
            ECRIRE(resultat)
        FIN SI

    FIN POUR

FIN*/
