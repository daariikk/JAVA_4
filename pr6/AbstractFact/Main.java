package practice_6.AbstractFact;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory();
        AbstractProductA productA = factory.createProductA();
        AbstractProductB productB = factory.createProductB();
        productA.operationA();
        productB.operationB();
    }
}