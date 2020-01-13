package esercizi;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void aggiungiPunti() {
        Card card = new Card();
        card.aggiungiPunti(150);
        assertTrue(card.getPuntiAccumulati()==150 && card.getStatus()==0);
    }

    @Test
    void ErroreRitiraPremio() {
        Card card = new Card();
        card.aggiungiPunti(150);
        card.ritiraPremio(200);
        assertTrue(card.getPuntiAccumulati()==150 &&card.getStatus()==1);
    }



    @Test
    void ritiraPremio() {
        Card card = new Card();
        card.aggiungiPunti(150);
        card.ritiraPremio(80);
        assertTrue(card.getPuntiAccumulati()==70 && card.getStatus()==0);
    }

    @Test
    void statoCarta() {
        Card card = new Card();
        card.setBlacklist(true);
        assertTrue(card.statoCarta());
    }

    @Test
    void valida() {
        Card card = new Card();
        Date date = new Date(2021,21,01);
        card.setDataScadenza(date);
        assertTrue(card.valida()==true);
        // Aggiungere un test con la data dopo la scadenza
    }
}