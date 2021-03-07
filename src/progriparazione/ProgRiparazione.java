
package progriparazione;

import java.util.Date;

public class ProgRiparazione {

    public static void main(String[] args)
    {
        Laboratorio l1 = new Laboratorio();
        Date d = null;
        
        Chiamata Chiamata1 = new Chiamata(d, "Tommaso", "Bianchi");
        Chiamata Chiamata2 = new Chiamata(d, "Alan", "Turing");
        
        InterventoEsterno ine = new InterventoEsterno("Via Masaccio", 9, Chiamata1, d, "Bianchi Tommaso", "Nessuna", 34, 2);
        InterventoInLaboratorio inel = new InterventoInLaboratorio(d, Chiamata2, d, "Bianchi Tommaso", "Nessuna", 23, 2);
        InterventoEsterno ine2 = new InterventoEsterno("Via Masaccio", 15, Chiamata1, d, "Bianchi Tommaso", "Nessuna", 12, 5);
        InterventoInLaboratorio ine3 = new InterventoInLaboratorio(d, Chiamata2, d, "Bianchi Tommaso", "Nessuna", 56, 9);
        InterventoEsterno ine4 = new InterventoEsterno("Via Masaccio", 2, Chiamata1, d, "Bianchi Tommaso", "Nessuna", 78, 14);
        InterventoInLaboratorio ine5 = new InterventoInLaboratorio(d, Chiamata2, d, "Bianchi Tommaso", "Nessuna", 132, 48);
        
        l1.AggiungiIntervento(ine);
        l1.AggiungiIntervento(inel);
        l1.AggiungiIntervento(ine2);
        l1.AggiungiIntervento(ine3);
        l1.AggiungiIntervento(ine4);
        l1.AggiungiIntervento(ine5);
        l1.SpesaOrdinata();
        l1.RiparazioniConInterventoEsterno();
        l1.RiparazioniConInterventoLaboratorio();
        l1.RicavoEsterni();
        l1.ElencoRiparazioniEsterniDistanzaSede(5);
        l1.RiparazionePiuCostosaLaboratorio();
    }
    
}
