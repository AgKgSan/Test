package OOP;

public class AggregationEx {
    String name;
    int age;
    Location location;

    public AggregationEx(String name, int age, Location location1) {
        this.name = name;
        this.age = age;
        this.location = location1;
    }


    void showData(){
        System.out.println("Name is" + name + "\nAge is "+ age+"Location is " +location.city+"/t" + location.state+"/t"+location.country);
    }

    public static void main(String[] args) {
        Location location1 = new Location("Yangon" , "Yangon","Myanmar");
        AggregationEx student1 = new AggregationEx("Aung Kaung San", 22,location1) ;
        student1.showData();
    }
}
