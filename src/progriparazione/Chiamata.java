package progriparazione;

import java.util.Date;

public class Chiamata 
{
    Date dataRichiesta;
    String Nome;
    String Cognome;
    String numeroTelefonico;

    public Chiamata(Date dataRichiesta, String Nome, String Cognome) 
    {
        this.dataRichiesta = dataRichiesta;
        this.Nome = Nome;
        this.Cognome = Cognome;
    }

    public Date getDataRichiesta() 
    {
        return dataRichiesta;
    }

    public void setDataRichiesta(Date dataRichiesta) 
    {
        this.dataRichiesta = dataRichiesta;
    }

    public String getNome() 
    {
        return Nome;
    }

    public void setNome(String Nome)
    {
        this.Nome = Nome;
    }

    public String getCognome()
    {
        return Cognome;
    }

    public void setCognome(String Cognome) 
    {
        this.Cognome = Cognome;
    }

    public String getNumeroTelefonico() 
    {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico)
    {
        this.numeroTelefonico = numeroTelefonico;
    }
}
