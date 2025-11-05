public class Main {
    public static void main(String[] args) {
        System.out.println("Bonjour"); // message ajouté

        int a = 2;
        int b = 3;

        // Calcul des opérations
        int resultMult = Operation.multiplication(a, b);
        int resultSub  = Operation.soustraction(a, b);
        int resultAdd  = Operation.addition(a, b);
        double resultDiv = Operation.division(a, b);

        // Affichage des résultats
        System.out.println(a + " * " + b + " = " + resultMult);
        System.out.println(a + " - " + b + " = " + resultSub);
        System.out.println(a + " + " + b + " = " + resultAdd);
        System.out.println(a + " / " + b + " = " + resultDiv);
        System.out.println("Au revoir"); // messa
        System.out.println("Bonsoir");    

    }
}

