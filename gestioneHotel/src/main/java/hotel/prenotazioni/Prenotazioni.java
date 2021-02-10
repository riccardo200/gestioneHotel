package hotel.prenotazioni;

import hotel.DettagliStanza;
import hotel.Hotel;
import hotel.Stanza;
import java.util.*;

public class Prenotazioni {
    
    Hotel hotel = new Hotel("",0);
    
    TreeMap<Stanza,Boolean> stanze = new TreeMap<>();
    
    Scanner input = new Scanner(System.in);
    
    String risp = "";
    
    Stanza stanza;
        
    public Boolean prenota(){
               
    do{
                                             
        try{
            
               System.out.println("Benvenuto quale tipo di stanza vuoi prenotare?\nSINGOLA DOPPIA TRIPLA QUADRUPLA?");
            
            if(risp.equalsIgnoreCase("si")||risp.equalsIgnoreCase("s"));
                
            else if(risp.endsWith("no")||risp.endsWith("n"))break;           
            
                risp = input.nextLine().toLowerCase().trim();
            
                boolean flag = false;
            
            switch(risp){
                
                case "singola":
                    
                    for(Map.Entry<Stanza, Boolean> e: stanze.entrySet()){
                        Stanza s = e.getKey();
                        Boolean v = e.getValue();
                        
                        switch(s.getTipo()){
                            
                            case SINGOLA:
                                if(!v){
                                    stanze.put(s, true);
                                    
                                    flag = true;
                                }
                                
                                System.out.println("Prenotata SINGOLA");
                                
                                break;                                                            
                        }
                        
                        if(flag) break;      //Condizione di uscita                        
                    }
                    stanze.entrySet().forEach(i -> {                    
                    });
                    break;
                    
                case "doppia":
                    
                    for(Map.Entry<Stanza, Boolean> e: stanze.entrySet()){
                        Stanza s = e.getKey();
                        Boolean v = e.getValue();
                        
                        switch(s.getTipo()){
                            
                            case DOPPIA:
                                if(!v){
                                    stanze.put(s, true);
                                    
                                    flag = true;
                                }
                                
                                System.out.println("Prenotata DOPPIA");
                                
                                break;                                                            
                        }
                        
                        if(flag) break;      //Condizione di uscita
                    }
                    stanze.entrySet().forEach(i -> {                   
                    });
                    
                    break;
                    
                case "tripla":
                    
                    for(Map.Entry<Stanza, Boolean> e: stanze.entrySet()){
                        Stanza s = e.getKey();
                        Boolean v = e.getValue();
                        
                        switch(s.getTipo()){
                            
                            case TRIPLA:
                                if(!v){
                                    stanze.put(s, true);
                                    
                                    flag = true;
                                }
                                
                                System.out.println("Prenotata TRIPLA");
                                
                                break;                                                            
                        }
                        
                        if(flag) break;      //Condizione di uscita
                    }
                    stanze.entrySet().forEach(i -> {                   
                    });
                    
                    break;
                    
                case "quadrupla":
                    
                    for(Map.Entry<Stanza, Boolean> e: stanze.entrySet()){
                        Stanza s = e.getKey();
                        Boolean v = e.getValue();
                        
                        switch(s.getTipo()){
                            
                            case QUADRUPLA:
                                if(!v){
                                    stanze.put(s, true);
                                    
                                    flag = true;
                                }
                                
                                System.out.println("Prenotata QUADRUPLA");
                                
                                break;                                                             
                        }                       
                        if(flag) break;      //Condizione di uscita
                    }
                    stanze.entrySet().forEach(i -> {                    
                    });
                    
                    break;
            }
            
                   }catch(Exception e){}
                   
    }while(risp.equalsIgnoreCase("si")||risp.equalsIgnoreCase("s"));
    
        return true;
    }
    
    public void mostra(){                            
        
        stanze.entrySet().forEach(entry -> {
            
            System.out.println("Le stanze: "+ entry);
        }); 
    }
    
    public Boolean inserisci(Stanza stanza){
    
        return stanze.put(stanza,Boolean.FALSE);
    }  
        
        public Boolean preno(){                  
        
        stanze.entrySet().forEach(entry -> {                   //ESPRESSIONI LAMBDA
            Stanza key = entry.getKey();
            
            Boolean value = entry.getValue();

            if(value.booleanValue()==true){
                
                System.out.println(stanze.get(value));
            }else System.out.println("Stanze occupate");
        });
    
    return null;
    }
}


