package erro2;

public class Main {
    public static void main(String[] args) {

        try {
            int num1 = 10;
            int num2 = 0;
            int resultado = num1 / num2;
            System.out.println("O resultado é: " + resultado);

        }catch (ArithmeticException e){
            System.err.println("Nao pode dividir por 0");
        }
    }
}


