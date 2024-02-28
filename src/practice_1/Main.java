package practice_1;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"abcde", "abbcccddd", "aabbcc"};
        MaxUniqueCharsStringConsumer consumer = MaxUniqueCharsStringConsumer.getInstance();
        consumer.accept(strings);
    }
}
