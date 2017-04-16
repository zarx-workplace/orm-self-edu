package space.zarx.ormedu.dto;

import java.math.BigDecimal;

public class BusProto {
    private String model;
    private int passengerCapacity;
    private FuelType fuelType;
    private BigDecimal fuelUsage;
    private long projectedMileageResource;
    private BigDecimal avgRouteVelocity;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public BigDecimal getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(BigDecimal fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public long getProjectedMileageResource() {
        return projectedMileageResource;
    }

    public void setProjectedMileageResource(long projectedMileageResource) {
        this.projectedMileageResource = projectedMileageResource;
    }

    public BigDecimal getAvgRouteVelocity() {
        return avgRouteVelocity;
    }

    public void setAvgRouteVelocity(BigDecimal avgRouteVelocity) {
        this.avgRouteVelocity = avgRouteVelocity;
    }

    @Override
    public String toString() {
        return "BusProto{" +
                "model='" + model + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                ", fuelType=" + fuelType +
                ", fuelUsage=" + fuelUsage +
                ", projectedMileageResource=" + projectedMileageResource +
                ", avgRouteVelocity=" + avgRouteVelocity +
                '}';
    }
}
