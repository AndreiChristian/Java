public class Main {
    public static void main(String[] args) {

        Human h1 = new Human();

        Human h2 = new Human(
                "Sane",
                23
        );

        System.out.println(h1.age + h1.name);
        System.out.println(h2.age + h2.name);

        System.out.println(h2.toString());

        System.out.println(Human.numOfFriends);
        System.out.println(Human.numOfFriends);
    }
}