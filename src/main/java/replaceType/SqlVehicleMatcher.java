package replaceType;

public class SqlVehicleMatcher implements VehicleMatcher {
    @Override
    public int countVehicles(NewVehicleQuery query) {
        return new VehicleRepository().find(new NewVehicleQuery(
                query.getBrandDescription().split(" ")[0],
                query.getBrandDescription().split(" ")[1]
        )).size();
    }
}
