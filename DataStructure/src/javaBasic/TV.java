package javaBasic;

public class TV {
    String brand;
    int year;
    int inch;
    
    public TV(String brand, int year, int inch){
        this.brand = brand;
        this.year = year;
        this.inch = inch;
    }
    
    public void show() {
        System.out.printf("%s���� ���� %d���� %d��ġ TV/n",brand,year,inch);
    }
}
