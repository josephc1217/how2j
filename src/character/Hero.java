package character;

import Property.Item;
import Property.LifePotion;
import Property.MagicPotion;

public class Hero extends Object{
    public static final int itemTotalNumber = 6;  //常亮
    String name; //姓名
    float hp; //血量
    float armor; //护甲
    int moveSpeed; //移动速度


    public Hero(){
        //System.out.println("Hero 的无参构造方法");
    }

    public Hero(String name){
        System.out.println("Hero 的有一个参数的构造方法");
        this.name = name;
    }

    public static void battleWin(){
        System.out.println("Hero battle win");
    }

    public void useLifePotion(LifePotion lp){
        lp.effect();
    }

    public void useMagicPotion(MagicPotion mp){
        mp.effect();
    }

    public void useItem(Item i){
        System.out.println("hero use item");
        i.effect();
    }

    public void kill(Mortal m){
        m.die();
    }

    public void finalize(){
        System.out.println("这个英雄正在被回收");
    }

    @Override
    public boolean equals(Object obj) {
        //return super.equals(obj);
        if (obj instanceof Hero){
            Hero h = (Hero)obj;
            return this.hp == h.hp;
        }
        return false;
    }

    public static void main(String[] args){
        Hero garen = new Hero("盖伦");
        //garen.name="盖伦";
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed = 350;

        Hero h1 = new Hero();
        h1.hp = 200;
        Hero h2 = new Hero();
        h2.hp = 400;
        Hero h3 = new Hero();
        h3.hp = 200;

        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(h3));

        final Hero fh;
        fh = new Hero();
        fh.hp = 100;
    }
}
