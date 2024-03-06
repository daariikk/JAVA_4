package practice_8.templateMethod;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр конкретного алгоритма и вызываем его шаблонный метод
        AbstractAlgorithm algorithm = new ConcreteAlgorithm();
        algorithm.templateMethod();
    }
}
