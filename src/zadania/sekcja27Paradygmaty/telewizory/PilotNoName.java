package zadania.sekcja27Paradygmaty.telewizory;

public class PilotNoName implements Pilot {

    private Telewizor telewizor;


    @Override
    public void nacisnijCzerwony() {
        telewizor.akcjaZailania();
    }

    @Override
    public void nasisnijPrzyciskJeden() {
        telewizor.zmienKanal(1);
    }

    @Override
    public void nacisnijPrzyciskDwa() {
        telewizor.zmienKanal(2);
    }

    @Override
    public void nacisnijPrzyciskTrzy() {
        telewizor.zmienKanal(3);
    }

    @Override
    public void sparujTelewizor(Telewizor telewizor) {
        this.telewizor = telewizor;
    }
}
