class Shape {
    private String name;

    Shape(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class Circle extends Shape {
    Circle() {
        super("Circle");
    }
}

class Square extends Shape {
    Square() {
        super("Square");
    }
}

class DrawingBoard {
    void draw(Shape shape) {
        System.out.println("Drawing a shape : " + shape.getName());

        String typeName = shape.getClass().getTypeName();
        String superClassType = shape.getClass().getSuperclass().getTypeName();

        System.out.println("TypeName: "+ typeName);
        System.out.println("SuperClass Type: " + superClassType);
    }
}

class DrawingBoardDemo {
    public static void main(String[] args) {
        DrawingBoard drawingBoard = new DrawingBoard();
        Circle circle = new Circle();
        Square square = new Square();

        drawingBoard.draw(circle);
        drawingBoard.draw(square);
    }
}
