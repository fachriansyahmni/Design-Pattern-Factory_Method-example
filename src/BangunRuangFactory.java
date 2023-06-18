public class BangunRuangFactory {
    public BangunRuang getBangunRuang(String namaBangunRuang) {
        if (namaBangunRuang == null) {
            return null;
        }
        if (namaBangunRuang.equalsIgnoreCase("balok")) {
            return new Balok();
        } else if (namaBangunRuang.equalsIgnoreCase("kubus")) {
            return new Kubus();
        }
        return null;
    }
}
