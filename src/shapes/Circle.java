package shapes;

public class Circle {
    private double radius;
    private double area;
    private double circumference;

    public void Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius){

    }
    public double getArea() {
            this.area = Math.PI*(this.radius*this.radius);
            return this.area;
    }
    public double getCircumference(){
        this.circumference = 2*Math.PI*this.radius;
        return this.circumference;
    }

    public double getRadius() {
        return radius;
    }
}
