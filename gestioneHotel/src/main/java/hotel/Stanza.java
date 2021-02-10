package hotel;

public class Stanza implements Comparable<Stanza>{
       
    private int numero;
    private DettagliStanza tipo;
    private double costo;
    
    public Stanza(int numero,DettagliStanza tipo,double costo){      //costruttore parametrizzato
        
        this.numero=numero;
        this.tipo=tipo;
        this.costo=costo;
    }
    
    public void setNumero(int numero){
    
        this.numero=numero;
    }
    
    public void setTipo(DettagliStanza tipo){
    
        this.tipo=tipo;
    }
    
    public void setCosto(double costo){
    
        this.costo=costo;
    }
    
    public int getNumero(){
    
        return this.numero;
    }
    
    public DettagliStanza getTipo(){
    
        return this.tipo;
    }
    
    public double getCosto(){
    
        return this.costo;  
    }
    
    @Override
    public String toString(){
    
        return "Stanza numero " + numero + " Tipo di camera >" + tipo.name() + "< Costo per notte € " + costo;
    }
    
    @Override
    public int compareTo(Stanza stanza) {
        
        return this.getNumero() - stanza.getNumero();
    }
}
