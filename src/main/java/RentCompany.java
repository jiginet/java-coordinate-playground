import java.util.ArrayList;
import java.util.List;

public class RentCompany {

    private List<Car> cars = new ArrayList<>();

    private RentCompany() {
    }

    public static RentCompany create() {
        return new RentCompany();
    }

    public String generateReport() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Car car : cars) {
            stringBuilder.append(car.getName())
                .append(" : ")
                .append((int) car.getChargeQuantity())
                .append("리터")
                .append("\n");
        }
        return stringBuilder.toString();
    }

    public void addCar(Car car) {
        cars.add(car);
    }
}
