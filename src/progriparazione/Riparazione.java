package progriparazione;

import java.util.Date;

public abstract class Riparazione 
{
    Chiamata chiamata;
    Date riparazione;
    String nomeTecnico;
    String descrizione;
    String nomeProdotto;
    int costoMateriale;
    int tempoImpiegato;
    static int spesaFissa = 23;
    static int costoOrario = 5;

    public Riparazione(Chiamata chiamata, Date riparazione, String nomeTecnico, String descrizione, int costoMateriale, int tempoImpiegato) 
    {
        this.chiamata = chiamata;
        this.riparazione = riparazione;
        this.nomeTecnico = nomeTecnico;
        this.descrizione = descrizione;
        this.costoMateriale = costoMateriale;
        this.tempoImpiegato = tempoImpiegato;
    }    
    
     public abstract int Spesa();

    public Chiamata getChiamata() 
    {
        return chiamata;
    }

    public void setChiamata(Chiamata chiamata)
    {
        this.chiamata = chiamata;
    }

    public Date getRiparazione()
    {
        return riparazione;
    }

    public void setRiparazione(Date riparazione) 
    {
        this.riparazione = riparazione;
    }

    public String getNomeTecnico() {
        return nomeTecnico;
    }

    public void setNomeTecnico(String nomeTecnico)
    {
        this.nomeTecnico = nomeTecnico;
    }

    public String getDescrizione() 
    {
        return descrizione;
    }

    public void setDescrizione(String descrizione) 
    {
        this.descrizione = descrizione;
    }

    public String getNomeProdotto() {
        return nomeProdotto;
    }

    public void setNomeProdotto(String nomeProdotto) 
    {
        this.nomeProdotto = nomeProdotto;
    }

    public int getCostoMateriale()
    {
        return costoMateriale;
    }

    public void setCostoMateriale(int costoMateriale)
    {
        this.costoMateriale = costoMateriale;
    }

    public int getTempoImpiegato() 
    {
        return tempoImpiegato;
    }

    public void setTempoImpiegato(int tempoImpiegato) 
    {
        this.tempoImpiegato = tempoImpiegato;
    }

    public static int getSpesaFissa() 
    {
        return spesaFissa;
    }

    public static void setSpesaFissa(int spesaFissa) 
    {
        Riparazione.spesaFissa = spesaFissa;
    }

    public static int getCostoOrario()
    {
        return costoOrario;
    }

    public static void setCostoOrario(int costoOrario) 
    {
        Riparazione.costoOrario = costoOrario;
    }
     
    public String toString()
    {
        String s = "Intervento Fatto Da: " + nomeTecnico + " Nome Prodotto: " + nomeProdotto;
        
        return s;
    }
     
}
