package character;

public class ADAPHero extends Hero implements AD,AP,Mortal{
    public ADAPHero(String name){
        super(name);
    }

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }

    @Override
    public void die() {
        System.out.println("ADAPHero will die");
    }

    @Override
    public void attack() {
        System.out.println("ad ap hero attack");
    }
}
