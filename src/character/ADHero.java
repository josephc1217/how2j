package character;

import Property.Item;
import Property.LifePotion;

public class ADHero extends Hero implements AD,Mortal {

    int moveSpeed = 400;

    /*
    public ADHero(){
        System.out.println("AD Hero 的构造方法");
    }

     */

    public ADHero(String name){
        super(name);
        System.out.println("AD hero 的有一个参数的构造方法");
    }

    public int getMoveSpeed(){
        return this.moveSpeed;
    }

    public int getMoveSpeed2(){
        return super.moveSpeed;
    }

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    @Override
    public void die() {
        System.out.println("ADHero will die");
    }

    public static void battleWin(){
        System.out.println("ad hero battle win");
    }

    @Override
    public void useItem(Item i) {
        System.out.println("adhero use item");
        super.useItem(i);
    }

    public static void main(String[] args){
        ADHero h = new ADHero("德莱文");
        System.out.println( h.getMoveSpeed());
        System.out.println(h.getMoveSpeed2());

        LifePotion lp = new LifePotion();
        h.useItem(lp);
    }
}
