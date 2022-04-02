// this code implements (Refactoring 1-5)
// 1. creation method
// 2. extraction method
// 3. understandable variables
// 4. fields
// 5. subclass

public class Shapes{
    private int width = 0;
    private int length = 0;
    private int radius = 0;
    private int circumference = 0;

    public Shapes(int width, int length, int radius, int circumference){
        this.width = width;
        this.length = length;
        this.radius = radius;
        this.circumference = circumference;
    }

    public Shapes(){
    }

    public int getWidth(){ return width; }
    public int getLength(){ return length; }
    public int getRadius(){ return radius; }
    public int getCircumference(){ return circumference; }

    public static Shapes createCircle(int radius, int circumference){
        return new Shapes(0,0,radius, circumference);
    }

    public static Shapes createRectangle(int width, int length){
        return new Shapes(width, length, 0, 0);
    }

    public void getAll(){
        System.out.println("Width: " + this.width);
        System.out.println("Length: " + this.length);
        System.out.println("Radius: " + this.radius);
        System.out.println("Circumference: " + this.circumference);
    }

    public void printShapeInfo(){
        getAll();
    }

    public void getType(){
        final boolean isCircle = (width == 0 || length == 0);
        final boolean isRectangle = (radius == 0 || circumference == 0);

        if(isCircle){
            System.out.println("Shape is a Circle."); 
        } else if(isRectangle){
            System.out.println("Shape is a Rectangle."); 
        } else {
            System.out.println("Unknown Shape."); 
        }
    }
    public static void main(String[] args){
        Shapes myCircle = Shapes.createCircle(5, 25);
        System.out.println("Radius: " + myCircle.getRadius());
        myCircle.printShapeInfo();
        myCircle.getType();
    }
}

class Circle extends Shapes{
    public void getArea(){
        System.out.println("Area of Circle: ");
    }
}