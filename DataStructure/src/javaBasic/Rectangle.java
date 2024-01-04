package javaBasic;

public class Rectangle {
    int x, y;
    int width, height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int square() {
        return width * height;
    }

    public void show() {
        System.out.printf("(%d, %d)���� ũ�Ⱑ %dx%d�� �簢��", x, y, width, height);
    }

    public Boolean contains(Rectangle r) {
        if (x > r.x || y > r.y)
            return false;
        else if (width < r.width || height < r.height)
            return false;
        return true;
    }
}
