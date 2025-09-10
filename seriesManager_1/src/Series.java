/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Khanya's
 */
public class Series {
      private String code;
    private String title;
    private String genre;
    private int releaseYear;
    private double rating;

    public Series(String code, String title, String genre, int releaseYear, double rating) {
        this.code = code;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    // Getters
    public String getCode() { return code; }
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public int getReleaseYear() { return releaseYear; }
    public double getRating() { return rating; }

    // Setters
    public void setTitle(String title) { this.title = title; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setReleaseYear(int releaseYear) { this.releaseYear = releaseYear; }
    public void setRating(double rating) { this.rating = rating; }

    @Override
    public String toString() {
        return "Series Code: " + code +
               ", Title: " + title +
               ", Genre: " + genre +
               ", Release Year: " + releaseYear +
               ", Rating: " + rating;
    }
}

    

