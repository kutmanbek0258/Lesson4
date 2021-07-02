package com.smanov;

import com.smanov.homework.*;

public class Main {

    public static void main(String[] args) {

        //Lesson
        /*Circle circle = new Circle(15);

        //System.out.println(circle.calculatePerimeter());

        Triangle triangle = new Triangle(12, 20, 15);

        //System.out.println(triangle.calculatePerimeter());

        Square square = new Square(20);

        //System.out.println(square.calculatePerimeter());

        Rectangle rectangle = new Rectangle(10, 20);

        //System.out.println(rectangle.calculatePerimeter());

        Dog dog = new Dog("Layka");

        Figure[] figures = {circle, triangle, square, rectangle};

        for (Figure figure : figures) {
            System.out.println(figure.calculatePerimeter());
            figure.draw();
        }

        Drawable[] drawables = {circle, triangle, square, rectangle, dog};

        for (Drawable drawable : drawables){
            if( drawable instanceof Figure){
                System.out.println(((Figure)drawable).calculatePerimeter());
            }
            if (drawable instanceof SoundProducable){
                ((SoundProducable)drawable).cllSound();
            }
            drawable.draw();
        }*/

        Computer pc = createObject("PC");
        Computer laptop = createObject("Laptop");
        Computer phone = createObject("Phone");

        Printable[] pComputer = {(Printable) pc, (Printable) laptop, (Phone) phone};

        for(Printable printable : pComputer){
            printable.print();
        }

    }

    private static Computer createObject(String className){
        Computer computer = new PC(ProcessorArchitecture.X86,
                2300,
                RAMType.DDR4,
                8000,
                MemoryType.HDD,
                500000,
                "Intel Core i5 1100K",
                "HP",
                120,
                240,
                50);
        switch (className) {
            case "PC" -> {
                PC pc = new PC(ProcessorArchitecture.X86,
                        2300,
                        RAMType.DDR4,
                        8000,
                        MemoryType.HDD,
                        500000,
                        "Intel Core i5 1100K",
                        "HP",
                        120,
                        240,
                        50);
                computer = (Computer) pc;
            }
            case "Laptop" -> {
                Laptop laptop = new Laptop(ProcessorArchitecture.ARM,
                        2300,
                        RAMType.DDR4,
                        8000,
                        MemoryType.HDD,
                        500000,
                        "Mediatek Helio P20",
                        "Xiaomi",
                        "Xiaomi Mi Play",
                        5,
                        1920,
                        1480,
                        200,
                        1);
                computer = (Computer) laptop;
            }
            case "Phone" -> {
                Phone phone = new Phone(ProcessorArchitecture.X86,
                        2300,
                        RAMType.DDR4,
                        8000,
                        MemoryType.HDD,
                        500000,
                        "Intel Core i5 1100K",
                        "Dell",
                        "Inspiron N5110",
                        17,
                        1920,
                        1480,
                        7500,
                        7,
                        CellularGeneration.G5,
                        true);
                computer = (Computer) phone;
            }
        }

        return computer;

    }
}
