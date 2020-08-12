package zadania.sekcja22KlasyAbstrakcjeInterfejs.Zadanie02;

public class Prostokat implements Figury{
   public double b;
   public double a;

    @Override
    public double obwod() {
        return 0;
    }

    @Override
    public double pole() {
        return (a*b);
    }

    public Prostokat(double a, double b){
        this.a=a;
        this.b=b;
    }
}
