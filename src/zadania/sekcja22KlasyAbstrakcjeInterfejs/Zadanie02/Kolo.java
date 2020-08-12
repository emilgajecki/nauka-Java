package zadania.sekcja22KlasyAbstrakcjeInterfejs.Zadanie02;

public class Kolo implements Figury{
    public double r;

    @Override
    public double obwod(){
        return (2*3.14*r);
    }

    @Override
    public double pole() {
        return 0;
    }

    public Kolo (double r){
        this.r = r;
    }
}
