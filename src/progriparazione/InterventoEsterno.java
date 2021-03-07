package progriparazione;

import java.util.Date;

public class InterventoEsterno extends Riparazione
{
    String indirizzoRiparazione;
    int distanzaSede;
    static int costoChilometro = 7;

    public InterventoEsterno(String indirizzoRiparazione, int distanzaSede, Chiamata chiamata, Date riparazione, String nomeTecnico, String descrizione, int costoMateriale, int tempoImpiegato) {
        super(chiamata, riparazione, nomeTecnico, descrizione, costoMateriale, tempoImpiegato);
        this.indirizzoRiparazione = indirizzoRiparazione;
        this.distanzaSede = distanzaSede;
    } 

    public int getDistanzaSede() 
    {
        return distanzaSede;
    }    
    
    @Override
    public int Spesa() 
    {
         int costo = 0;
        
        costo = (tempoImpiegato * costoOrario) + (distanzaSede * costoChilometro)+ costoMateriale + spesaFissa;
        
        return costo;
    }
}
