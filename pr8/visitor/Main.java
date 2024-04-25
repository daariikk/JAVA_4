package practice_8.visitor;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты элементов
        ConcreteElementA elementA = new ConcreteElementA();
        ConcreteElementB elementB = new ConcreteElementB();

        // Создаем посетителя
        Visitor visitor = new ConcreteVisitor();

        // Принимаем посетителя элементами
        elementA.accept(visitor);
        elementB.accept(visitor);
    }
}