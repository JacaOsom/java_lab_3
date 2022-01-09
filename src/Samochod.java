public class Samochod extends Pojazd{
    private double vMax;
    private RodzajSamochoduEnum rodzajSamochoduEnum;

    public Samochod(){}

    public Samochod(RodzajPojazduEnum rodzajPojazduEnum, String marka, String model, int rokProdukcji, double vMax, RodzajSamochoduEnum rodzajSamochoduEnum) {
        super(rodzajPojazduEnum, marka, model, rokProdukcji);
        this.vMax = vMax;
        this.rodzajSamochoduEnum = rodzajSamochoduEnum;
    }

    public void jazdaAutem(){
        wlaczSilnik();
        System.out.println("Jedziemy z punktu A do punktu B.");
        wylaczSilnik();
    }


    @Override
    public String toString() {
        return super.toString() + "\nTyp pojazdu: " + rodzajSamochoduEnum + "\nPrędkość maksymalna: " + vMax;
    }
}
