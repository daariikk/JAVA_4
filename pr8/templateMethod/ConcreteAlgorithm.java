package practice_8.templateMethod;

class ConcreteAlgorithm extends AbstractAlgorithm {
    @Override
    protected void stepOne() {
        System.out.println("Выполняется шаг первый");
    }

    @Override
    protected void stepTwo() {
        System.out.println("Выполняется шаг второй");
    }

    // Переопределяем метод третьего шага по умолчанию
    @Override
    protected void stepThree() {
        System.out.println("Выполняется переопределенный шаг третий");
    }
}
