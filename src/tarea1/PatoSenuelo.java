package tarea1;
public class PatoSenuelo extends Pato implements Volable, Cuaqueable{
    @Override
    public void mostrar(){
        System.out.println("\nYo soy Pato senuelo");
    }
    @Override
    public void volar(){
        System.out.println("INCAPAZ DE VOLAR");
    }
    @Override
    public void cuaquear(){
        System.out.println("<<Silencio>>");
    }
}
