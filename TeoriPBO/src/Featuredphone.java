public class Featuredphone extends Handphone {
    public Featuredphone(String merk, String model) {
       super(merk, model);
    }

    @Override
    public void nyalakan() {
        System.out.println("Feature phone dengan merk " + merk + " dan model " + model + " sedang dinyalakan");
    }

    @Override
    public void matikan() {
        System.out.println("Feature phone dengan merk " + merk + " dan model " + model + " sedang dimatikan");
    }

    public void mainGameSnake() {
        System.out.println("Feature phone sedang memainkan game ular");
    }
}
