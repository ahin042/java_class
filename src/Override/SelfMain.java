package Override;

public class SelfMain implements Self {
    private String mine;

    public SelfMain(String name) {
        this.mine = name;
    }

    @Override
    public void name() {
        System.out.println("제 이름은 " + mine + "입니다");
    }

    public static void main(String[] args) {
        Self me = new SelfMain("홍길동");
        me.name();
    }
}