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
        System.out.printf("%s에서 만든 %d년형 %d인치 TV/n",brand,year,inch);
    }
}
