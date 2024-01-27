public class Furniture {
    private String Name;
    private String Style;
    private String Material;
    private float Price;

    public Furniture(String Name,String Style,String Material,float price){
        this.Name = Name;
        this.Style = Style;
        this.Material = Material;
        this.Price = price;
    }
    public String getName() {
        return Name;
    }

    public String getStyle() {
        return Style;
    }

    public String getMaterial() {
        return Material;
    }

    public float getPrice() {
        return Price;
    }

}
