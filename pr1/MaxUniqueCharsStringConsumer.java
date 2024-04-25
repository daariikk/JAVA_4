package practice_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

@FunctionalInterface
interface MaxUniqueCharsStringConsumer {
    void accept(String[] strings);

    static MaxUniqueCharsStringConsumer getInstance() {
        return strings -> {
            if (strings == null || strings.length == 0) {
                System.out.println("Массив строк пуст.");
                return;
            }

            String maxUniqueCharsString = Arrays.stream(strings)
                    .max(Comparator.comparingInt(str -> (int) str.chars().distinct().count()))
                    .orElse(null);

            System.out.println("Строка с наибольшим количеством уникальных символов: " + maxUniqueCharsString);
        };
    }
}
