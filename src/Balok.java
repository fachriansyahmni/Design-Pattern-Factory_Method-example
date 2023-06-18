public class Balok implements BangunRuang {
    private double sisi;

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void gambarBangun() {
        System.out.println("Menggambar balok");
    }

}
