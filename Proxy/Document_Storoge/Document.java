
package project.com;

public class Document {
    private String id;
    private String title;

    public Document(String title, String id) {
        this.title = title;
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public boolean matches(String query) {
        return this.title.equals(query);
    }
}