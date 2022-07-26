package casting;

public class casting {
    public static void main(String[] args) {
        char tipoChar = 'J';
        String tipoString = "Hello world!";
        int tipoInt = 30;
       long tipoLong = 325978405L;
       float tipoFloat = 67.5F;
       double tipoDouble = 327.7D;

       int a = (int) tipoLong;
       int b = (int) tipoFloat;
       float c = (float) tipoDouble;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
