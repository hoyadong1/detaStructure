package javaBasic;

public class Grade {
    int math;
    int sci;
    int eng;

    public Grade(int math, int sci, int eng) {
        this.math = math;
        this.sci = sci;
        this.eng = eng;
    }

    public int average() {
        return (math + sci + eng) / 3;
    }

}
