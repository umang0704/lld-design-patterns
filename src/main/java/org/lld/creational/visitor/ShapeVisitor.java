package org.lld.creational.visitor;

public interface ShapeVisitor {
    void visit(Circle circle);
    void visit(Square square);
    void visit(Rectangle rectangle);
}
