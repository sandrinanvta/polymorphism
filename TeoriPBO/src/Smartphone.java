public class Smartphone extends Handphone {
    public Smartphone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void nyalakan() {
        System.out.println("Smartphone dengan merk " + merk + " dan model " + model + " sedang proses booting");
    }

    @Override
    public void matikan() {
        System.out.println("Smartphone dengan merk " + merk + " dan model " + model + " sedang proses shutdown");
    }

    @Override
    public void kirimPesan(String nomorTujuan, String pesan) {
        System.out.println("Mengirim pesan whatsapp ke nomor " + nomorTujuan + " dengan pesan : " + pesan);
    }

    public void kirimPesan(String emailTujuan, String subjek, String pesan) {
        System.out.println("Mengirim pesan email : " + pesan + " dengan subjek " + subjek + " ke " + emailTujuan);
    }

    public void aksesInternet() {
        System.out.println("Smartphone dengan merk " + merk + " dan model " + model + " sedang mengakses internet");
    }

}
