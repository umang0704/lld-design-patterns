package org.lld.creational.visitor;

public interface Shape {
    void accept(ShapeVisitor visitor);
}