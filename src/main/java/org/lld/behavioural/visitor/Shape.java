package org.lld.behavioural.visitor;

public interface Shape {
    void accept(ShapeVisitor visitor);
}