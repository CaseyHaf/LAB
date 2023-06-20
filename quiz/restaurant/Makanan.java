package restaurant;

public abstract class Makanan implements Comparable<Makanan> {
    private String nama;
    private String jenis;
    private double harga;

    public Makanan(String nama, String jenis, double harga) {
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public double getHarga() {
        return harga;
    }

    @Override
    public int compareTo(Makanan other) {
        return this.nama.compareTo(other.nama);
    }
}
