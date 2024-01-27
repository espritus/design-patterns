public class ModernWoodFactory extends FurnitureFactory{

    @Override
    public Chair createChair() {
        return new ModernChair("Chair", "Modern","Wood", 15000);
    }

    @Override
    public Table createTable() {
        return new ModernTable("Table","Modern", "Wood", 30000);
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa("Sofa", "Modern","Wood", 220000);
    };
    }
class TraditionalMetalFactory extends FurnitureFactory{
    @Override
    public Chair createChair() {
        return new TraditionalChair("Chair", "Traditional","Metal", 9000);
    }

    @Override
    public Table createTable() {
        return new TraditionalTable("Table", "Traditional","Metal", 15500);
    }

    @Override
    public Sofa createSofa() {
        return new TraditionalSofa("Sofa", "Traditional","Metal", 150000);
    }
}
class IndustrialGlassFactory extends FurnitureFactory{
    @Override
    public Chair createChair() {
        return new IndustrialChair("Chair", "Industrial","Glass", 40000);
    }

    @Override
    public Table createTable() {
        return new IndustrialTable("Table", "Industrial","Glass", 80000);
    }

    @Override
    public Sofa createSofa() {
        return new IndustrialSofa("Sofa", "Industrial","Glass", 350000);
    }
}