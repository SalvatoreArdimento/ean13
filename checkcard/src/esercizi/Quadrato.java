package esercizi;

public class Quadrato extends Rettangolo {

    @Override
    public void setAltezza(double altezza) {         //Sarebbe il caso di non utilizzare SetBase, e u di utlizzare SetLato, ma per
        super.setAltezza(altezza);
        super.setBase(altezza);
    }

    @Override
    public double diagonale() {
       return getAltezza()*Math.sqrt(2);
    }
}
