package tarea1;
public class PatoDeGoma extends Pato implements Cuaqueable, Volable{
    @Override
    public void mostrar(){
        System.out.println("\nYo soy un Patito de goma");
    }

    @Override
    public void cuaquear(){
        System.out.println("Chirr Chirr");
    }
    @Override
    public void volar(){
        System.out.println("INCAPAZ DE VOLAR");
    }
}
