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
        System.out.printf("%d�� %s ������ %s�� �θ� %s/n", year, country, artist, title);
    }

}
