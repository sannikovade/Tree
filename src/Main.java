import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person<>("Joe", "van Smuth", 60));
        people.add(new Person("Sacha", "Baron Cohen", 51));
        people.add(new Person("Arthur", "Elliot-Murray-Kynynmound", 25));
        people.add(new Person<>("Jane", "Smith", 55));
        people.add(new Person("Alice", "van Albert-Lynn-Alice", 33));
        people.add(new Person("Andrew", "Persival junior the third", 40));
        System.out.println(people);
        Collections.sort(people, new WhoIsMoreNoble(4).reversed());
        System.out.println(people);
    }
}
