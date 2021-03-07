package progriparazione;

import java.util.Date;

public class InterventoInLaboratorio extends Riparazione
{
    Date dataRitiroCliente;

    public InterventoInLaboratorio(Date dataRitiroCliente, Chiamata chiamata, Date riparazione, String nomeTecnico, String descrizione, int costoMateriale, int tempoImpiegato) 
    {
        super(chiamata, riparazione, nomeTecnico, descrizione, costoMateriale, tempoImpiegato);
        this.dataRitiroCliente = dataRitiroCliente;
    }

    @Override
    public int Spesa() 
    {
        int costo = 0;
        
        costo = (tempoImpiegato * costoOrario) + costoMateriale + spesaFissa;
        
        return costo;
    }
    
    
}
