package rentcar;

public class Avante implements Car {

    private final double tripDistance;

    public Avante(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    @Override
    public double getChargeQuantity() {
        return tripDistance / 15.0;
    }

    @Override
    public String getName() {
        return "rentcar.Avante";
    }
}
