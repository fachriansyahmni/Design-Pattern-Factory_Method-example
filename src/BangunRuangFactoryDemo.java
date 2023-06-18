public class BangunRuangFactoryDemo {
    public static void main(String[] args) {
        BangunRuangFactory bangunRuangFactory = new BangunRuangFactory();
        BangunRuang balok = bangunRuangFactory.getBangunRuang("balok");
        balok.gambarBangun();
        BangunRuang kubus = bangunRuangFactory.getBangunRuang("kubus");
        kubus.gambarBangun();
    }
}
