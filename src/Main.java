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

        Comparator<Person> whoIsMoreNoble = (o1,o2) -> {
            int surname1 = o1.getSurname().split("\\P{IsAlphabetic}+").length;
            int surname2 = o2.getSurname().split("\\P{IsAlphabetic}+").length;
            if (surname1 >= 4 && surname2 >= 4) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
            if (surname1 != surname2) {
                return Integer.compare(surname1, surname2);
            } else {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };


        Collections.sort(people, whoIsMoreNoble.reversed());
        System.out.println(people);
    }
}
