package practice_8.visitor;

interface Visitor {
    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);
}