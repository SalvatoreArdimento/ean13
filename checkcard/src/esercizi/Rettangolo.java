package esercizi;

public class Rettangolo {
    private double base;
    private double altezza;

    public void setBase(double base) {
        this.base = base;
    }

    public void setLato(double lato) {
        this.altezza = lato;

    }
    public double calcolaPerimetro(){
        return (altezza *2)+(base*2);
    }
    public double calcolaArea(){
        return base* altezza;
    }

    private double getBase() {
        return base;
    }

    public double getAltezza() {
        return altezza;
    }

    public double calcolaDiagonale(){
        return Math.sqrt((getAltezza()* getAltezza())+(getBase()*getBase()));

    }
}
