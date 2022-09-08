package rentcar;

public class K5 implements Car {

    private final double tripDistance;

    public K5(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    @Override
    public String getName() {
        return "rentcar.K5";
    }

    @Override
    public double getChargeQuantity() {
        return tripDistance / 13.0;
    }
}
