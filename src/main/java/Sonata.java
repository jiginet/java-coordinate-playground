public class Sonata implements Car {

    private final double tripDistance;

    public Sonata(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    @Override
    public double getChargeQuantity() {
        return tripDistance / 10.0;
    }

    @Override
    public String getName() {
        return "Sonata";
    }
}
