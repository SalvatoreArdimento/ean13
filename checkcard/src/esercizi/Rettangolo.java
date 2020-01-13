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
    public double perimetro(){
        return (altezza *2)+(base*2);
    }
    public double area(){
        return base* altezza;
    }

    private double getBase() {
        return base;
    }

    public double getAltezza() {
        return altezza;
    }

    public double diagonale(){
        return Math.sqrt((getAltezza()* getAltezza())+(getBase()*getBase()));

    }
}
