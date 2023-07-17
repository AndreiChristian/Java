public class Human {

    String name;
    Integer age;
    static Integer numOfFriends = 0;

    public Human(String name, Integer age) {
        this.name = name;
        this.age = age;
        numOfFriends ++;
    }

    public Human() {
        this.name = "Andrei";
        this.age = 23;
        numOfFriends ++;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
