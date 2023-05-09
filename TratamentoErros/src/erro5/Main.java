package erro5;

public class Main {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Numero fora de posicao");
        }
    }
}
