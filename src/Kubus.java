public class Kubus implements BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public void gambarBangun() {
        System.out.println("Menggambar kubus");
    }

}
