public class Hilo3 implements  Runnable{

    public String frase;

    public Hilo3(String frase) {

        this.frase=frase;

    }

    public void run(){
        int numeros = 0;
        for(int x = 0;x < frase.length();x ++){
            if(Character.isDigit(frase.charAt(x))){
                numeros ++;
                Main.contar ++;
            }
        }
        System.out.println("Tiene: " + numeros + " numeros");
    }
}
