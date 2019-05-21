package shapes;

public class Rectangle {
    protected int height;
    protected int width;
    protected int perimeter;
    protected int area;

    public Rectangle(){
        this.height = 0;
        this.height = 0;
    }

    public Rectangle(int H,int W){
        this.height = H;
        this.width = W;
        this.perimeter = (2*H)+(2*W);
        this.area = H * W;
    }


    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getPerimeter() {
        perimeter = (width * 2)+(height * 2);
        return perimeter;
    }

    public int getArea() {
        area = width * height;
        return area;
    }

}
