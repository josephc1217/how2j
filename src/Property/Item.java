package Property;

import javax.crypto.Mac;

public class Item {
    String name;
    int price;

    public void buy(){
        System.out.println("购买");
    }
    public void effect(){
        System.out.println("物品使用后，可以有效果");
    }

    @Override
    protected void finalize() throws Throwable {
        //super.finalize();
        System.out.println("当前对象正在被回收");
    }

    @Override
    public boolean equals(Object obj) {
        //return super.equals(obj);
        if(obj instanceof Item){
            Item i = (Item)obj;
            return(this.price == ((Item) obj).price);
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        //return super.toString();
        String s = this.name + this.price;
        System.out.println(s);
        return s;
    }

    public static void main(String[] args){
        Item i = new Item();
        //i.effect();

        LifePotion lp = new LifePotion();
        //lp.effect();

        MagicPotion mp = new MagicPotion();
        //mp.effect();

        Item i1  = new LifePotion();
        Item i2 = new MagicPotion();
        System.out.println("i1 是item类型，执行effect 打印");
        i1.effect();
        System.out.println("i2 是item类型，执行effect打印");
        i2.effect();
    }
}
