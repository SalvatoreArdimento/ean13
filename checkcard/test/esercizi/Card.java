package esercizi;


import CardNumber.CardNumber;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Card {
    private CardNumber cardNumber = new CardNumber("");
    private int puntiAccumulati = 0;
    private Date dataScadenza;
    private boolean blacklist;
    private int status=0;

    public void setBlacklist(boolean blacklist) {
        this.blacklist = blacklist;
    }

    public void setDataScadenza(Date dataScadenza) {
        this.dataScadenza = dataScadenza;
    }

    public void aggiungiPunti(int punti){
        puntiAccumulati+=punti;

    }

    public Date getDataScadenza() {
        return dataScadenza;
    }

    public int getPuntiAccumulati() {
        return puntiAccumulati;
    }

    public void ritiraPremio(int prezzoPremio){
        if(prezzoPremio<=puntiAccumulati) {
            puntiAccumulati -= prezzoPremio;
            status=0;
        }
        else
              status = 1;


    }
    public boolean statoCarta(){
        return blacklist;
    }
    public boolean valida(){
        Date date = new Date();
     //  SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
    //    System.out.println(formatter.format(date));
        if (date.before(dataScadenza))
            return true;
        else
            return false;

    }

    public int getStatus() {
        return status;
    }
}
