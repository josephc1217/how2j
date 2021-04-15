package character;

public class Support extends Hero implements Healer {

    public Support(String name){
        super(name);
    }
    @Override
    public void heal() {
        System.out.println("进行治疗");
    }
}
