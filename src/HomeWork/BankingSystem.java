package HomeWork;

public class BankingSystem {
    int id;
    String name;
    double amount;//10000

    public BankingSystem(int id, String name, double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    void addAmount (double amt){
        amount += amt;
    }

    void withDraw(double amt1){
        if (amount>amt1){
            amount -= amt1;
        }
        else {
            System.out.println("The amount is lower than your amount");
        }

    }

    public static void main(String[] args) {
        BankingSystem user1 = new BankingSystem(1,"Mg Mg",10000);

        System.out.println(user1.amount);
        user1.addAmount(40000);

        System.out.println(user1.amount);

        user1.withDraw(70000);
        System.out.println(user1.amount);

    }
}
