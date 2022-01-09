public class Pojazd {
    private RodzajPojazduEnum rodzajPojazduEnum;
    private String marka;
    private String model;
    private int rokProdukcji;

    public Pojazd() {
    }

    public Pojazd(RodzajPojazduEnum rodzajPojazduEnum, String marka, String model, int rokProdukcji) {
        this.rodzajPojazduEnum = rodzajPojazduEnum;
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
    }

    public RodzajPojazduEnum getRodzajPojazduEnum() {
        return rodzajPojazduEnum;
    }

    public void setRodzajPojazduEnum(RodzajPojazduEnum rodzajPojazduEnum) {
        this.rodzajPojazduEnum = rodzajPojazduEnum;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    protected boolean wlaczSilnik(){
        System.out.println("Włączono silnik");
        return true;
    }

    protected boolean wylaczSilnik(){
        System.out.println("Wyłączono silnik");
        return true;
    }

    @Override
    public String toString() {
        return "\nRodzaj pojazdu: " + rodzajPojazduEnum + "\nMarka: " + marka + "\nModel: " + model + "\nRok produkcji: " + rokProdukcji;
    }
}
