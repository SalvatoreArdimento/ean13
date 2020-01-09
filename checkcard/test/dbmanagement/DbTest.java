package dbmanagement;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class DbTest {

    @Test
    void t01_connect() {
        Db db = new Db();
        db.connect();
        assertTrue(db.getStatus().equals(0L));
        db.close();
    }

    @Test
    void t10_readfirst() {
        Db db = new Db();
        Card card = new Card();

        db.connect();
        assertTrue(db.getStatus().equals(0L));
        db.openResultSet();
        assertTrue(db.getStatus().equals(0L));
        card = db.readFirst();
        assertTrue(db.getStatus().equals(0L));
        assertNotNull(card);
        db.closeResultSet();
        db.close();
    }

    @Test
    void provaFind() {
        Db db = new Db();
        Card card = new Card();
        db.connect();
        card=db.find(2);
        System.out.println(db.getStatusMsg());
        db.closeResultSet();
        db.close();
        assertTrue(card.getId()==2);




    }


    @Test
    void updateTest(){
        Db db = new Db();
        Card card = new Card();
        db.connect();
        db.update(2,"101010101016");



    }
    @Test
    void deleteTest(){
        Db db = new Db();
        db.connect();
        db.delete(2);
        db.close();
    }
    }

/*
    @Test
    void getStatusMsg() {
    }

    @Test
    void getStatus() {
    }

    @org.junit.jupiter.api.Test
    void close() {
    }


    @org.junit.jupiter.api.Test
    void readFirst() {
    }

    @org.junit.jupiter.api.Test
    void readLast() {
    }

    @org.junit.jupiter.api.Test
    void readNext() {
    }

    @org.junit.jupiter.api.Test
    void testRead() {
    }

    @org.junit.jupiter.api.Test
    void openResultSet() {
    }

    @org.junit.jupiter.api.Test
    void closeResultSet() {
    }

    @org.junit.jupiter.api.Test
    void isLast() {
    }

    @org.junit.jupiter.api.Test
    void isFirst() {
*/
