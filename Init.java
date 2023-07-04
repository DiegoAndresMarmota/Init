
public class Init {
    public static void main(String[] args) {

        int dato1 = 20;
        int dato2 = 35;
        int aux1;

        System.out.println("Antes del intercambio");
        System.out.println("El valor de dato1 es: " + dato1);
        System.out.println("El valor de dato2 es: " + dato2);

        //0    //20
        aux1 = dato1;
        //20   //35
        dato1 = dato2;
        //35   //20
        dato2 = aux1;

        System.out.println("Despues del intercambio");
        System.out.println("El valor de dato1 es: " + dato1);
        System.out.println("El valor de dato2 es: " + dato2);
    }

}
