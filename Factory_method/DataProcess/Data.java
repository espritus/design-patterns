package project.com;

public class Data {
    private Object content;
    private String type;

    public Data(Object content,String type) {
        this.content = content;
        this.type = type;
    }

    public Object getContent() {
        return content;
    }

    public String getType() {
        return type;
    }
}
