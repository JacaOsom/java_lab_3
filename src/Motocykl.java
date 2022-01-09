public class Motocykl extends Pojazd{
    private int pojemnosc;

    public Motocykl(){}

    public Motocykl(RodzajPojazduEnum rodzajPojazduEnum, String marka, String model, int rokProdukcji, int pojemnosc) {
        super(rodzajPojazduEnum, marka, model, rokProdukcji);
        this.pojemnosc = pojemnosc;
    }

    public int getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(int pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public static void porownajPojemnosc(Motocykl m1, Motocykl m2){
        if (m1.pojemnosc > m2.pojemnosc){
            System.out.println(m1.getMarka() + " " + m1.getModel() + " ma większą pojemność niż: " + m2.getMarka() + " " + m2.getModel());
        } else if(m1.pojemnosc == m2.pojemnosc){
            System.out.println("Pojemności są równe!");
        } else {
            System.out.println(m2.getMarka() + " " + m2.getModel() + " ma większą pojemność niż: " + m1.getMarka() + " " + m1.getModel());
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nPojemność silnika: " + pojemnosc;
    }
}
