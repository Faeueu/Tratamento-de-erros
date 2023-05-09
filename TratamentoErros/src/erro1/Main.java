package erro1;

public class Main {
    public static void main(String[] args) {

        try {
            Object obj = new Integer(10);
            String str = (String) obj;

        } catch (ClassCastException e) {
            System.err.println("Nao pode converter o objeto para String");
        }
    }
}


