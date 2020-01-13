package esercizi;

public class Quadrato extends Rettangolo {

    @Override
    public void setLato(double lato) {         //Sarebbe il caso di non utilizzare SetBase, e u di utlizzare SetLato, ma per
        super.setLato(lato);
        super.setBase(lato);
    }

    @Override
    public double diagonale() {
       return getAltezza()*Math.sqrt(2);
    }
}
