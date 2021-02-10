package hotel;

import java.util.TreeMap;

public class Hotel {
    
    private final String nomeH;
    private final int stelle;
    
    TreeMap<Stanza,Boolean> stanze = new TreeMap<>();
    
    public Hotel(String nomeH,int stelle){
        
        this.nomeH=nomeH;
        this.stelle=stelle;    
    }
    
    public void setNomeH(String nomeH){}     //con variabili final nn devo aggiungere this.nomeH
    
    public void setStelle(int stelle){}
    
    public String getNomeH(){
    
        return this.nomeH;
    }
    
    public int getStelle(){
    
        return  this.stelle;
        
    }
    
}
