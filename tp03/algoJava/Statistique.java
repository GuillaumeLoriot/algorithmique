public class Statistique {

    static int findMin(int[] haystack){
        int min = haystack[0];
        for (int i = 1; i < haystack.length; i++){
            if (haystack[i] < min){
                min = haystack[i];
            }
        }
        return min;
    }

    static int findMax(int[] haystack){
        int max = haystack[0];
        for (int i = 1; i < haystack.length; i++){
            if (max < haystack[i]){
                max = haystack[i];
            }
        }
        return max;
    }

    static double findAverage(int[] haystack){
        int total = 0;

        for (int i = 0; i < haystack.length; i++){
            total = total + haystack[i];
        }
        return (double) total/ haystack.length;
    }

    //mesurer l'éloignement entre les valeurs d’un ensemble et leur moyenne
    //calculer la moyenne, mesuree l'écart de chaque valeur avec cette moyenne,
    //mettre ces écarts au carré pour suprimer les négatifs, faire la moyenne, faire la racine carrée pour revenir aux bon resultat.

    static double findEcartType(int[] tab) {
        double average = findAverage(tab);
        double total = 0;

        for (int i = 0; i < tab.length; i++) {
        }
            total = total + Math.pow(tab[i] - average, 2);
        return Math.sqrt(total / tab.length);
    }


    static double showStats

    public static void main(String[] args){

        int[] tab = {10, 10, 10};

        System.out.print("Le plus petit nombre est: ");
        System.out.println(findMin(tab));
        System.out.print("Le plus grand nombre est: ");
        System.out.println(findMax(tab));
        System.out.print("La moyenne est: ");
        System.out.println(findAverage(tab));
        System.out.print("L'écart type' est: ");
        System.out.println(findEcartType(tab));





    }
}
