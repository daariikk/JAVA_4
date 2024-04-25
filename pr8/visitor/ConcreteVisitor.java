package practice_8.visitor;

class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ConcreteElementA element) {
        element.operationA();
    }

    @Override
    public void visit(ConcreteElementB element) {
        element.operationB();
    }
}