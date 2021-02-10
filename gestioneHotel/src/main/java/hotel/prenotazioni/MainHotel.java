package hotel.prenotazioni;

import hotel.DettagliStanza;
import hotel.Hotel;
import hotel.Stanza;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class MainHotel {
    
    public static void main(String[] args)throws ClassCastException{
        
        TreeMap<Stanza,Boolean> stanze = new TreeMap<>();
        
        Hotel hotel = new Hotel("Hotel Cervo",5);
        Prenotazioni prenotazioni = new Prenotazioni();
        
        DettagliStanza dSa1 = DettagliStanza.SINGOLA;      // .setNumero();
        DettagliStanza dSa2 = DettagliStanza.SINGOLA;   
        DettagliStanza dSa3 = DettagliStanza.DOPPIA;
        DettagliStanza dSa4 = DettagliStanza.DOPPIA;
        DettagliStanza dSa5 = DettagliStanza.TRIPLA;
        DettagliStanza dSa6 = DettagliStanza.TRIPLA;
        DettagliStanza dSa7 = DettagliStanza.QUADRUPLA;
        DettagliStanza dSa8 = DettagliStanza.QUADRUPLA;
      
        Stanza s1 = new Stanza(1,dSa1,50d);
        Stanza s2 = new Stanza(2,dSa2,50d);
        Stanza s3 = new Stanza(3,dSa3,100d);
        Stanza s4 = new Stanza(4,dSa4,100d);
        Stanza s5 = new Stanza(5,dSa5,150d);
        Stanza s6 = new Stanza(6,dSa6,150d);
        Stanza s7 = new Stanza(7,dSa7,200d);
        Stanza s8 = new Stanza(8,dSa8,200d);
    //  Stanza s2 = new Stanza(2,DettagliStanza.SINGOLA,50d);    //si puoò creare l oggetto anche così   
    
        prenotazioni.inserisci(s1);
        prenotazioni.inserisci(s2);
        prenotazioni.inserisci(s3);
        prenotazioni.inserisci(s4);
        prenotazioni.inserisci(s5);
        prenotazioni.inserisci(s6);
        prenotazioni.inserisci(s7);
        prenotazioni.inserisci(s8);
                
        Scanner input = new Scanner(System.in);
        String risp = "";
        
        LocalDateTime dataOra = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM);

        System.out.println(dataOra.format(formatter)+"\n================================================"+
                        "\nBENVENUTO NEL SISTEMA PRENOTAZIONI " +hotel.getNomeH()+" "+hotel.getStelle()+"\n"
                        + "================================================");  
        do{ 
            try{
                
                System.out.println("Digita 1 per vedere le stanze \nDigita 2 per poter prenotare");
                
                if(risp.equalsIgnoreCase("si")||risp.equalsIgnoreCase("s"));
                
                else if(risp.endsWith("no")||risp.endsWith("n"))break;
                
                int scelta = input.nextInt();
                
                switch(scelta){
                    
                    case 1:
                        
                        System.out.println("Elenco delle camere dell' hotel:\n ");
                        prenotazioni.mostra();
                        System.out.println("Vuoi proseguire? SI/NO");
                        input.nextLine();
                        risp=input.nextLine();
                                               
                        break;
                        
                    case 2:
                        
                        prenotazioni.prenota();
                        System.out.println("Vuoi proseguire? SI/NO");
                        input.nextLine();
                        risp=input.nextLine();
                        
                        break;
                        
                    default:
                        
                        System.out.println("ATTENZIONE puoi digitare solo '1' oppure '2'\n"
                                + "Vuoi continuare SI/NO?");                        
                        input.nextLine();
                        risp=input.nextLine();
                }
            
            }catch(Exception e){}
               
        }while(risp.equalsIgnoreCase("si")||risp.equalsIgnoreCase("s"));
        
               System.out.println("GRAZIE ARRIVEDERCI");
    }   
}
