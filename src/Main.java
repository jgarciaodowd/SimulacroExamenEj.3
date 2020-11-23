import java.util.Scanner;

public class Main {

    public static int contar = 0;

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un texto: ");
        String texto = sc.nextLine();

        Hilo1 h1= new Hilo1(texto);
        Hilo2 h2= new Hilo2(texto);
        Hilo3 h3= new Hilo3(texto);

        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);
        Thread t3 = new Thread(h3);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();

        System.out.println("La palabra tiene: " + contar + " caracteres");
        System.out.println("Se acabo el programa");
    }

}
