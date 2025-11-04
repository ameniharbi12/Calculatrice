public class Operation {

    // Multiplication
    public static int multiplication(int x, int y) {
        System.out.println("Bonjour");
        return x * y;
    }

    // Soustraction
    public static int soustraction(int a, int b) {
        return a - b;
    }

    // Addition
    public static int addition(int a, int b) {
        return a + b;
    }
    public double division(int a, int b) {
        if (b == 0) {
            System.out.println("Erreur : division par zéro !");
            return 0;
        }
        return (double) a / b;
    }
}



