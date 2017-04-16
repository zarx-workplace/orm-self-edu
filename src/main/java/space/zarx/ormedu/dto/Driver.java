package space.zarx.ormedu.dto;

import java.math.BigDecimal;

public class Driver {
    private int driverId;
    private String name;
    private int workingDayDuration;
    private BigDecimal wageRate;

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkingDayDuration() {
        return workingDayDuration;
    }

    public void setWorkingDayDuration(int workingDayDuration) {
        this.workingDayDuration = workingDayDuration;
    }

    public BigDecimal getWageRate() {
        return wageRate;
    }

    public void setWageRate(BigDecimal wageRate) {
        this.wageRate = wageRate;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverId=" + driverId +
                ", name='" + name + '\'' +
                ", workingDayDuration=" + workingDayDuration +
                ", wageRate=" + wageRate +
                '}';
    }
}
