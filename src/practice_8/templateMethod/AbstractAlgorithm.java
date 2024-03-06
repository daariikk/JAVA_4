package practice_8.templateMethod;

abstract class AbstractAlgorithm {
    // Шаблонный метод, определяющий последовательность шагов алгоритма
    public void templateMethod() {
        stepOne();
        stepTwo();
        stepThree();
    }

    // Абстрактные методы, которые должны быть реализованы в подклассах
    protected abstract void stepOne();
    protected abstract void stepTwo();

    // Метод по умолчанию, который можно переопределить в подклассах
    protected void stepThree() {
        System.out.println("Выполняется шаг третий по умолчанию");
    }
}
