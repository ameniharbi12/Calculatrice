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

    // Méthode division avec vérification
    public static double division(int a, int b) {
        if (b != 0) {  // vérifie que b est différent de 0
            return (double) a / b;
        } else {
            System.out.println("Erreur : division par zéro !");
            return 0;
        }
    }
}
    
