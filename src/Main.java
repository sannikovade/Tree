import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person<>("Joe", "van Smuth", 60));
        people.add(new Person("Sacha", "Baron Cohen", 51));
        people.add(new Person("Arthur", "Elliot-Murray-Kynynmound", 25));
        people.add(new Person<>("John", "Smith", 55));
        System.out.println(people);
        Collections.sort(people, new WhoIsMoreNoble());
        System.out.println(people);
    }
}
