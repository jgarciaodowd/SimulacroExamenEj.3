public class Hilo1 implements Runnable {

    public String frase;

    public Hilo1(String frase) {
        this.frase = frase;
    }

    public void run(){
        int mayusculas = 0;
        for(int x = 0;x < frase.length();x ++){
            if(Character.isUpperCase(frase.charAt(x))){
                mayusculas ++;
                Main.contar ++;
            }
        }
        System.out.println("Tiene: " + mayusculas + " mayusculas");
    }

}
