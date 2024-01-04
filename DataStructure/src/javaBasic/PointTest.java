package javaBasic;

class Point {
    private int x, y;
    
    public Point() {};

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}


class ColorPoint extends Point {
    String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    void setXY(int x, int y) {
        super.move(x, y);
    }

    void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color + "색의 (" + getX() + "," + getY() + ")의 점";
    }

}


class PositivePoint extends Point {
    public PositivePoint(int x, int y) {
        super(x, y);
        if (x < 0 || y < 0)
            move(0, 0);
    }

    public PositivePoint() {
        // TODO Auto-generated constructor stub
    }

    protected void move(int x, int y) {
        if(x<0 || y<0) return;
        super.move(x, y);
    }
    
    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ")의 점";
    }   
}


public class PointTest {
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
        cp.setXY(10, 20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str + "입니다. ");
        
        PositivePoint p = new PositivePoint();
        p.move(10, 10);
        System.out.println(p.toString()+"입니다.");
        p.move(-5,5); // 객체 p는 음수 공간으로 이동되지 않음
        System.out.println(p.toString()+"입니다.");
        PositivePoint p2 = new PositivePoint(-10, -10);
        System.out.println(p2.toString()+"입니다.");

    }

}
