package com.stepik_course.figure;

public class Circle extends Figure{
    public int r;       //Радиус окружности

    public Circle(String name, int r) {
        super(name);
        this.r = r;
    }


    @Override
    public String toString() {
        return super.toString() + "{" +
                "radius=" + r +
                '}';
    }

}
