import java.util.*;

public class MyStore {
    public static void main(String[] args) {
        FurnitureFactory factory;

        FurnitureCreator creator = new FurnitureCreator();
        System.out.println("Please choose one!");
        catalog();

        Scanner in = new Scanner(System.in);

        int s = in.nextInt();

        switch (s) {
            case 0:
                factory = new IndustrialGlassFactory();
                creator.setFactory(factory);
                break;
            case 1:
                factory = new ModernWoodFactory();
                creator.setFactory(factory);
            case 2:
                factory = new TraditionalMetalFactory();
                creator.setFactory(factory);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + 1);
        }

        Chair industrialChair = factory.createChair();

        System.out.println("Material: " + industrialChair.getMaterial() + ", Type: " + industrialChair.getStyle() + ", Price: $" + industrialChair.getPrice());
    }

    public static void catalog() {
        ArrayList<String> catalog = new ArrayList<>();
        catalog.add("Industrial Glass");
        catalog.add("Modern Wood");
        catalog.add("Traditional Metal");

        for (int i = 0; i < catalog.size(); i++) {
            System.out.println(i + " " + catalog.get(i));
        }
    }
}
