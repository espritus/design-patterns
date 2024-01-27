public class FurnitureCreator {

    FurnitureFactory f;

    public void setFactory(FurnitureFactory f){
        this.f =f;
    }

    public Furniture createChair() {
        return new Furniture(f.createChair().getName(), f.createTable().getStyle(),f.createChair().getMaterial(),
                f.createChair().getPrice());
    }

    public Furniture createTable() {
        return new Furniture(f.createTable().getName(), f.createTable().getStyle(),f.createTable().getMaterial(),
                f.createTable().getPrice());
    }

    public Furniture createSofa() {
        return new Furniture(f.createSofa().getName(), f.createTable().getStyle(),f.createSofa().getMaterial(),
                f.createSofa().getPrice());
    }
}
