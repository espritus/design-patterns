public abstract class Chair {
    private String name;
    private String material;
    private float price;
    private String style;

    public Chair(String name,String style, String material, float price) {
        this.name = name;
        this.material = material;
        this.price = price;
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public float getPrice() {
        return price;
    }
    public  String getStyle(){
        return style;
    }
}
abstract class  Table{
    private String name;
    private String material;
    private float price;
    private String style;

    public Table(String name, String style,String material, float price) {
        this.name = name;
        this.material = material;
        this.price = price;
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }
    public float getPrice() {
        return price;
    }

    public  String getStyle(){
        return style;
    }
}
abstract class Sofa{
    private String name;
    private String material;
    private float price;
    private String style;

    public Sofa(String name,String style, String material, float price) {
        this.name = name;
        this.material = material;
        this.price = price;
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public float getPrice() {
        return price;
    }
    public  String getStyle(){
        return style;
    }

}
