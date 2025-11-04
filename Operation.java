public class Operation {

    // Méthode addition
    public static int addition(int a, int b) {
        return a + b;
    }

    // Méthode soustraction
    public static int soustraction(int a, int b) {
        return a - b;
    }

    // Méthode multiplication
    public static int multiplication(int a, int b) {
        return a * b;
    }

    // Méthode division
    public static double division(int a, int b) {
        if (b == 0) {
            System.out.println("Erreur : division par zéro !");
            return 0;
        }
        return (double) a / b;
    }
}
    
