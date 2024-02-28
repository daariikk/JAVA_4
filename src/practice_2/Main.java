package practice_2;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Создаем список объектов Human
        List<Human> humans = List.of(
                new Human(30, "John", "Doe", LocalDate.of(1992, 5, 15), 70),
                new Human(25, "Alice", "Smith", LocalDate.of(1997, 8, 20), 65),
                new Human(40, "Bob", "Johnson", LocalDate.of(1982, 3, 10), 80),
                new Human(35, "Emma", "Brown", LocalDate.of(1987, 10, 5), 75),
                new Human(28, "Michael", "Wilson", LocalDate.of(1994, 12, 25), 85)
        );

        // Выводим список до сортировки
        System.out.println("Список до сортировки:");
        humans.forEach(System.out::println);
        System.out.println();

        // Сортировка по сумме веса и возраста
        List<Human> sortedHumans = humans.stream()
                .sorted((h1, h2) -> Integer.compare(h1.getAge() + h1.getWeight(), h2.getAge() + h2.getWeight()))
                .collect(Collectors.toList());

        // Выводим отсортированный список
        System.out.println("Список после сортировки:");
        sortedHumans.forEach(System.out::println);
        System.out.println();

        // Фильтрация по весу кратно 5
        List<Human> filteredHumans = sortedHumans.stream()
                .filter(human -> human.getWeight() % 5 == 0)
                .collect(Collectors.toList());

        // Выводим отфильтрованный список
        System.out.println("Список после фильтрации по весу кратно 5:");
        filteredHumans.forEach(System.out::println);
        System.out.println();

        // Выбор первых четырёх элементов
        List<Human> firstFourHumans = filteredHumans.stream()
                .limit(4)
                .collect(Collectors.toList());

        // Выводим первые четыре элемента
        System.out.println("Первые четыре элемента:");
        firstFourHumans.forEach(System.out::println);
        System.out.println();

        // Конкатенация имён через пробел
        String concatenatedNames = firstFourHumans.stream()
                .map(human -> human.getFirstName() + " " + human.getLastName())
                .collect(Collectors.joining(", "));

        // Выводим конкатенацию имён
        System.out.println("Конкатенация имён через пробел:");
        System.out.println(concatenatedNames);
    }
}

