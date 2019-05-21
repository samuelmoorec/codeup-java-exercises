package shapes;

public class Square extends Rectangle {
    protected int side;



    protected Square(int Side){
        this.side = Side;
        this.height = Side;
        this.width = Side;
    }


    public int getPerimeter() {
        perimeter = 4 * side;
        return perimeter;
    }


    public int getArea() {
        area = side * side;
        return area;
    }
}
