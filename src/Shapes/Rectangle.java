package Shapes;

public class Rectangle {
    private double height;
    private double width;
    public Rectangle(double height,double width){
        this.height = height;
        this.width = width;
    }
    public double cal(){
        return height*width;
    }
}
