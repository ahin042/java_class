package GetterSetter;

public class Info {
    private int money = 0;

    public int getMoney() {
        return money;
    }

    public void setMoney(int add) {
        if (add > 0) {
            money += add;
        }
    }
}
