package OOP;
interface A{
    abstract void eat();
}
class Re implements A{

    @Override
    public void eat() {
        System.out.println("They area eating");
    }
}
public class Recap implements A{
    public static void main(String[] args) {
        Recap recap = new Recap();
        recap.eat();

        Re re = new Re();
        re.eat();
    }

    @Override
    public void eat() {
        System.out.println("I am eating");
    }
}
