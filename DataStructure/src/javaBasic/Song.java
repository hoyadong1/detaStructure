package javaBasic;

public class Song {
    String title;
    String artist;
    int year;
    String country;

    public Song() {};

    public Song(String title, String artist, int year, String country) {
        this.title = title;
        this.country = country;
        this.artist = artist;
        this.year = year;
    }

    public void show() {
        System.out.printf("%d년 %s 국적의 %s가 부른 %s/n", year, country, artist, title);
    }

}
