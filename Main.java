public class Main {
    public static void main(String[] args) {
        System.out.println("Bonjour"); // message ajouté

        int a = 2;
        int b = 3;

        int resultMult = Operation.multiplication(a, b);
        int resultSub  = Operation.soustraction(a, b);
        int resultAdd  = Operation.addition(a, b);
        double resultDiv = Operation.division(a, b);

        System.out.println(a + " * " + b + " = " + resultMult);
        System.out.println(a + " - " + b + " = " + resultSub);
        System.out.println(a + " + " + b + " = " + resultAdd);
        System.out.println(a + " / " + b + " = " + resultDiv);
    }
}

