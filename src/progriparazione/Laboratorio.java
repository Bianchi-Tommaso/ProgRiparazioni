package progriparazione;

import java.util.ArrayList;

public class Laboratorio 
{
    ArrayList<Chiamata> listaRichieste = new ArrayList<Chiamata>();
    ArrayList<Riparazione> listaInterventi = new ArrayList<Riparazione>();
    
    public void AggiungiRichiesta(Chiamata x)
    {
        listaRichieste.add(x);
    }
    
    public void AggiungiIntervento(Riparazione x)
    { 
        listaInterventi.add(x);
    }
    
    public void RimuoviRichiesta(Chiamata x)
    {
        listaRichieste.add(x);
    }
    
    public void RimuoviIntervento(Riparazione x)
    { 
        listaInterventi.add(x);
    }
    
    public void SpesaOrdinata()
    {
        int i = 0;
        InterventoInLaboratorio inil = new InterventoInLaboratorio(null, null, null, "", "", 0, 0);
        InterventoEsterno ine = new InterventoEsterno("", 0, null, null, "", "", 0, 0);
        ArrayList<Integer> spesa = new ArrayList<Integer>();
        ArrayList<Integer> v = new ArrayList<Integer>();
        
        for(i = 0; i < listaInterventi.size(); i++)
        {
            if(listaInterventi.get(i) instanceof InterventoInLaboratorio)
            {
                inil = (InterventoInLaboratorio) listaInterventi.get(i);
                spesa.add(inil.Spesa());
            }
            else
            {
                ine = (InterventoEsterno) listaInterventi.get(i);
                spesa.add(ine.Spesa());
            }
        }
        
        v = OrdinaVettore(spesa);
        
        for(i = 0; i < v.size(); i++)
        System.out.print("|" + v.get(i));
        System.out.println("|");
    }
    
    public void RiparazioniConInterventoEsterno()
    {
        int i = 0;
        InterventoEsterno ine = new InterventoEsterno("", 0, null, null, "", "", 0, 0);
        
        System.out.println("Riparazioni Esterno: ");
        
        for(i = 0; i < listaInterventi.size(); i++)
        {
            if(listaInterventi.get(i) instanceof InterventoEsterno)
            {
                ine = (InterventoEsterno) listaInterventi.get(i);
                System.out.print("|" + ine.toString());
            }
        }
        System.out.println("|");
    }
    
     public void RiparazioniConInterventoLaboratorio()
     {
         int i = 0;
         InterventoInLaboratorio inil = new InterventoInLaboratorio(null, null, null, "", "", 0, 0);
         
         System.out.println("Riparazioni Laboratorio:");
         
          for(i = 0; i < listaInterventi.size(); i++)
        {
            if(listaInterventi.get(i) instanceof InterventoInLaboratorio)
            {
                inil = (InterventoInLaboratorio) listaInterventi.get(i);
                System.out.print("|" + inil.toString());
            }
        }
        System.out.println("|");
     }
     
     public void RicavoEsterni()
     {
         int i = 0;
         InterventoEsterno ine = new InterventoEsterno("", 0, null, null, "", "", 0, 0);
         ArrayList<Integer> spesa = new ArrayList<Integer>();
        
        System.out.println("Solo Ricavo Esterni: ");
        
         for(i = 0; i < listaInterventi.size(); i++)
         {
            if(listaInterventi.get(i) instanceof InterventoEsterno)
            {
                ine = (InterventoEsterno) listaInterventi.get(i);
                System.out.print("|" + ine.Spesa());
            }
         }
         System.out.println("|");
     }
     
     public void ElencoRiparazioniEsterniDistanzaSede(int x)
     {
         int i = 0;
        
         InterventoEsterno ine = new InterventoEsterno("", 0, null, null, "", "", 0, 0);
         ArrayList<Integer> distanza = new ArrayList<Integer>();
         ArrayList<Integer> v = new ArrayList<Integer>();
        
         System.out.println("Distanza Sede: ");
         
          for(i = 0; i < listaInterventi.size(); i++)
          {
              if(listaInterventi.get(i) instanceof InterventoEsterno)
              {
                  ine = (InterventoEsterno) listaInterventi.get(i);
                  
                  if(ine.getDistanzaSede() > x)
                  {
                      distanza.add(ine.getDistanzaSede());
                  }
              }
          }
          
         v = OrdinaVettore(distanza);
          
        for(i = 0; i < v.size(); i++)
        System.out.print("|" + v.get(i));
        System.out.println("|");
     }
     
     public void RiparazionePiuCostosaLaboratorio()
     {
         int i = 0;
         InterventoInLaboratorio inil = new InterventoInLaboratorio(null, null, null, "", "", 0, 0);
         ArrayList<Integer> v1 = new ArrayList<Integer>();
         ArrayList<Integer> v2 = new ArrayList<Integer>();
         
         System.out.println("Riparazione Piu Costosa Laboratorio: ");
         
         for(i = 0; i < listaInterventi.size(); i++)
         {
              if(listaInterventi.get(i) instanceof InterventoInLaboratorio)
              {
                  inil = (InterventoInLaboratorio) listaInterventi.get(i);
                  v1.add(inil.Spesa());
              }
         }
         
         v2 = OrdinaVettore(v1);
          
        System.out.print("|" + v2.get(0));
        System.out.println("|");
     }
     
     public ArrayList<Integer> OrdinaVettore(ArrayList<Integer> x)
    {
        int i = 0;
        int j = 0;
        int min = 0;
        int temp = 0;
         
        for (i = 0; i < x.size(); i++)
          {
                 min = i;

             for (j = i + 1; j < x.size(); j++)
            {
                if (x.get(j) > x.get(min))
                {
                    min = j;
                }
            }
                temp = x.get(min);
                x.set(min, x.get(i)); 
                x.set(i, temp);
          }
        
        return x;
    }
}
