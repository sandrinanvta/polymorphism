public class Main {
    public static void main(String[] args) {
        Handphone[] daftarPerangkat = new Handphone[2];

        daftarPerangkat[0] = new Smartphone("Iphone", "11 Pro");
        daftarPerangkat[1] = new Featuredphone("Samsung", "S11");

        for (Handphone perangkat : daftarPerangkat) {
            perangkat.nyalakan();
            perangkat.matikan();
            perangkat.kirimPesan("085174271126", "Hello, i;m Sandrina");
        }

    }
}
