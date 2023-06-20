package restaurant;

public abstract class Minuman implements Comparable<Minuman> {
    private String nama;
    private String jenis;
    private double harga;

    public Minuman(String nama, String jenis, double harga) {
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
    public int compareTo(Minuman other) {
        return this.nama.compareTo(other.nama);
    }
}
