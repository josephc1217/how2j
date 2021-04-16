package character;

public class APHero extends Hero  implements AP,Mortal {
    public APHero(String name) {
        super(name);
    }

    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }

    @Override
    public void die() {
        System.out.println("APHero will die");
    }
}
