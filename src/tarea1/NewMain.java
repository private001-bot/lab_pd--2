package tarea1;
public class NewMain {
    public static void main(String[] args){
        //PATO REAL
        PatoReal pl = new PatoReal();
        pl.mostrar();
        pl.cuaquear();
        pl.volar();
        pl.nadar();
        
        //PATO DE GOMA
        PatoDeGoma pg = new PatoDeGoma();
        pg.mostrar();
        pg.cuaquear();
        pg.volar();
        pg.nadar();
        
        //PATO SEÑUELO
        PatoSenuelo ps = new PatoSenuelo();
        ps.mostrar();
        ps.cuaquear();
        ps.volar();
        ps.nadar();
        
        //PATO CABEZA ROJA
        PatoCabezaRoja pcr = new PatoCabezaRoja();
        pcr.mostrar();
        pcr.cuaquear();
        pcr.volar();
        pcr.nadar();
    }
    
}
