package ShapesCalculator;

/*
Create a shapes calculator with different entities/classes such as
ShapesCalculator.Shape, ShapesCalculator.Circle, ShapesCalculator.Rectangle, square, triangle
*/

import java.util.Scanner;

public class ShapesCalculator {

    public static void main(String[] args) {
//        Perimeter perimeter = new Perimeter();
//        Area area = new Area();

        System.out.println("This calculator calculates area and perimeter of the shape.\nPlease insert shape type: \noval, circle, rectangle, parallelogram, diamond, square, triangle");
        Scanner scan = new Scanner(System.in);
        String shapeType = scan.nextLine();

        switch (shapeType) {
            case "oval":
                Oval oval = new Oval();
                System.out.println("For oval insert radius1 and radius2\nInsert radius1:");
                double radius1 = scan.nextDouble();
                System.out.println("Insert radius2:");
                double radius2 = scan.nextDouble();
                oval.ovalCalculator(radius1, radius2);
                break;

            case "circle":
                Circle circle = new Circle();
                System.out.println("For circle insert radius\nInsert r:");
                double radius = scan.nextDouble();
                circle.circleCalculator(radius);
                break;

            case "parallelogram":
                Parallelogram parallelogram = new Parallelogram();
                System.out.println("For parallelogram insert baseLength, sideLength and height\nInsert baseLength:");
                double baseLength = scan.nextDouble();
                System.out.println("Insert sideLength:");
                double sideLength = scan.nextDouble();
                System.out.println("Insert height:");
                double height = scan.nextDouble();
                parallelogram.parallelogramCalculator(baseLength, sideLength, height);
                break;

            case "rectangle":
                Rectangle rectangle = new Rectangle();
                System.out.println("For rectangle insert baseLength, sideLength\nInsert baseLength:");
                baseLength = scan.nextDouble();
                System.out.println("Insert sideLength:");
                sideLength = scan.nextDouble();
                rectangle.rectangleCalculator(baseLength, sideLength);
                break;
//
//            case "diamond":
//                diamond diamond = new diamond();
//                System.out.println("For diamond insert radius1 and radius2\nInsert r1:");
//                double r1 = scan.nextDouble();
//                System.out.println("Insert r2:");
//                double r2 = scan.nextDouble();
//                diamond.diamondCalculator(r1, r2);
//                break;
//
//            case "square":
//                square square = new square();
//                System.out.println("For square insert radius1 and radius2\nInsert r1:");
//                double r1 = scan.nextDouble();
//                System.out.println("Insert r2:");
//                double r2 = scan.nextDouble();
//                square.squareCalculator(r1, r2);
//                break;
//
//            case "triangle":
//                triangle triangle = new triangle();
//                System.out.println("For triangle insert radius1 and radius2\nInsert r1:");
//                double r1 = scan.nextDouble();
//                System.out.println("Insert r2:");
//                double r2 = scan.nextDouble();
//                triangle.triangleCalculator(r1, r2);
//                break;

            default:
                System.out.println("This is not a shape OR this shape is not supported");
        }


    }

}

class Shape {
    int anglesSum;
    double area;
    double perimeter;

}

class Oval extends Shape {
    double radius1;
    double radius2;

//    void ovalSetter(double radius1, double radius2) {
//        this.radius1 = radius1;
//        this.radius2 = radius2;
//    }
    void  ovalCalculator(double radius1, double radius2) {

        area = Math.PI * radius1 * radius2;

        double height = (Math.pow((radius1 - radius2), 2)) / (Math.pow((radius1 + radius2), 2));

        perimeter = Math.PI * (radius1 + radius2) * (1 + ((3 * height) / (10 + (Math.sqrt(4 - 3 * height)))));

        System.out.println("The area of the oval is: " + area);
        System.out.println("The perimeter of the oval is: " + perimeter);
    }
}

class Circle extends Oval {
    double radius;

    void  circleCalculator(double radius) {
        area = Math.PI * Math.pow(radius, 2);
        perimeter = 2 * Math.PI * radius;

        System.out.println("The area of the circle is: " + area);
        System.out.println("The perimeter of the circle is: " + perimeter);
    }
}

class Parallelogram extends Shape {
    double baseLength;
    double sideLength;
    double height;

    void parallelogramCalculator(double baseLength, double sideLength, double height) {
        area = baseLength * height;
        perimeter = 2 * (baseLength + sideLength);

        System.out.println("The area of the parallelogram is: " + area);
        System.out.println("The perimeter of the parallelogram is: " + perimeter);
    }
}

class Rectangle extends Parallelogram {

    void rectangleCalculator(double baseLength, double sideLength) {
        area = baseLength * sideLength;
        perimeter = 2 * (baseLength + sideLength);

        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
}







//
//class Diamond extends Parallelogram {
//    length of the side
//    diagonal1
//            diagonal2
//    Area = (diagonal1 * diagonal2) / 2
//    Perimeter = 4 * length
//}
//

//
//class Square extends Rectangle {
//
//}
//
//class Triangle extends Shape {
//
//}
//
//
//class Area {
//
//
//}
//
//class Perimeter {
//
//}