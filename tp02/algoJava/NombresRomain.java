import java.util.HashMap;
import java.util.Scanner;

public class NombresRomain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> valeurNbRomain = new HashMap<>();
        valeurNbRomain.put("I",1);
        valeurNbRomain.put("V",5);
        valeurNbRomain.put("X",10);
        valeurNbRomain.put("L",50);
        valeurNbRomain.put("C",100);
        valeurNbRomain.put("D",500);
        valeurNbRomain.put("M",1000);

        System.out.print("Entrez un nombre romain: ");
        final String nbRomain = scanner.next();


    }
}
