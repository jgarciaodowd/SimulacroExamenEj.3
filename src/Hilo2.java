public class Hilo2 implements Runnable{

    public String frase;

    public Hilo2(String frase) {

        this.frase=frase;

    }

    public void run(){
        int minisculas = 0;
        for(int x = 0;x < frase.length();x ++){
            if(Character.isLowerCase(frase.charAt(x))){
                minisculas ++;
                Main.contar ++;
            }
        }
        System.out.println("Tiene: " + minisculas + " minisculas");
    }
}
