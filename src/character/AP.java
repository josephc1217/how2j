package character;

public interface AP {

    public static final int resistPhysic = 100;
    //reistMagic即使没有声明为public statis final, 但仍然模式是public static final.
    int resistMagic = 0;
    public void magicAttack();
}
