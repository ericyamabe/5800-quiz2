package prototype.library;

import java.util.ArrayList;

public class BookShallowCopy implements Cloneable {
    private String title;
    private String author;
    private ArrayList<String>chapters = new ArrayList<>();

    public BookShallowCopy(String title, String author, ArrayList<String> chapters) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setChapters(chapters);
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ArrayList<String> getChapters() {
        return this.chapters;
    }

    public void setChapters(ArrayList<String> chapters) {
        this.chapters = chapters;
    }

    @Override
    public BookShallowCopy clone(){
        try {
            return (BookShallowCopy) super.clone();
        }  catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Title: " + this.getTitle() + ", Author: " + this.getAuthor() + ", Chapters: " + this.getChapters();
    }
}
