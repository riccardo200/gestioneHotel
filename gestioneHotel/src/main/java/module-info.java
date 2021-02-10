
module GestioneHotel {     //nome modulo
    exports hotel;         //nome packages da esportare
    exports hotel.prenotazioni;
    
    requires java.base;         //librerie che serviranno x 
    requires java.sql;          //il funzionamento del programma 
    requires java.desktop;     //.base servirà sempre xkè contiene 
}                              //tutte le librerie principali
