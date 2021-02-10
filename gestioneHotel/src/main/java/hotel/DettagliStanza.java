package hotel;

public enum DettagliStanza{
       
    SINGOLA,
    DOPPIA,
    TRIPLA,
    QUADRUPLA;  
    
    private int numero;
    private double costo;
    private DettagliStanza(){
    }    
    
/*    DettagliStanza(int numero,double costo){          //Costruttore enum
    
        setNumero(numero);
        setCosto(costo);
    }*/
    public DettagliStanza setStanza(int numero, double costo,DettagliStanza tipo){  //set non convenzionale
        
        return this;
    }
    public DettagliStanza setNumero(int numero){
    
        this.numero=numero; 
        
        return this;
    }
    
    public int getNumero(){
    
        return this.numero;
    }
    
    public void setCosto(double costo){
    
        this.costo=costo;
    }
    
    public double getCosto(){
    
        return this.costo;
    }
}
    
    
