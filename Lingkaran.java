package bangundatar;

public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran(double jari) {
        this.jari = jari;
    }

    public double luas() {
        return Math.PI * Math.pow(jari, 2);
    }

    public double keliling() {
        // Menghitung keliling lingkaran menggunakan rumus keliling lingkaran
        return 2 * Math.PI * jari;
    }

    public void getInfo() {
        System.out.println("Luas: " + luas());
        System.out.println("Keliling: " + keliling());
    }
}
