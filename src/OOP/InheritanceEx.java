package OOP;


class BCD {
    int f = 90 ;

    

    BCD (){
        System.out.println("BCB class's COn");
    }

    void niceJob(){
        System.out.println("Software");
    }
}


public class InheritanceEx extends BCD{

    int g = 80 ;

    InheritanceEx(){
        System.out.println("InEx");
    }
    void lowPrice(){
        System.out.println("low Price");
    }
    public static void main(String[] args) {
        InheritanceEx childObj = new InheritanceEx();
        System.out.println(childObj.g);
        System.out.println(childObj.f);
        childObj.lowPrice();
        childObj.niceJob();

    }
}
