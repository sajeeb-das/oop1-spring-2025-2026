package librarymanagementsystem.entity;

public class Book {

    private String id;
    private String title;
    private String authorName;
    private String category;

    public Book(String id, String title, String authorName, String category) {
        this.id = id;
        this.title = title;
        this.authorName = authorName;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getCategory() {
        return category;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String toLine() {
        return id + "," + title + "," + authorName + "," + category;
    }

    public static Book fromLine(String line) {
        if (line == null)
            return null;

        String[] data = line.split(",", -1);

        if (data.length != 4)
            return null;

        return new Book(data[0], data[1], data[2], data[3]);
    }

    public Object[] toRow() {
        return new Object[] { id, title, authorName, category };
    }
}