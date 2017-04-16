package space.zarx.ormedu.dto;

import java.math.BigDecimal;

public class FuelType {
    private int fuelId;
    private String name;
    private BigDecimal cost;

    public int getFuelId() {
        return fuelId;
    }

    public void setFuelId(int fuelId) {
        this.fuelId = fuelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "FuelType{" +
                "fuelId=" + fuelId +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
