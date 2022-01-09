public class Ciężarówka extends Pojazd{

    private int przebieg;

    public Ciężarówka(){}

    public Ciężarówka(RodzajPojazduEnum rodzajPojazduEnum, String marka, String model, int rokProdukcji, int przebieg) {
        super(rodzajPojazduEnum, marka, model, rokProdukcji);
        this.przebieg = przebieg;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public void jedzTIR(){
        przylaczNaczepe();
        System.out.println("W trasie... aż dojedzie na miejsce.");
        odlaczNaczepe();
    }

    protected boolean przylaczNaczepe(){
        System.out.println("Przyłączono naczepę do ciągnika siodłowego.");
        return true;
    }
    protected boolean odlaczNaczepe(){
        System.out.println("Odłączono naczepę od ciężarówki");
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPrzebieg ciężarówki: " + przebieg + " km";
    }
}
