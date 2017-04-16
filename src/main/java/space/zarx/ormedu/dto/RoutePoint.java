package space.zarx.ormedu.dto;

import java.math.BigDecimal;

public class RoutePoint {
    private int rpointId;
    private String name;
    private BigDecimal xCoord;
    private BigDecimal yCoord;
    private BigDecimal passengerDemand;
    private BigDecimal passengerDemandGrowth;

    public int getRpointId() {
        return rpointId;
    }

    public void setRpointId(int rpointId) {
        this.rpointId = rpointId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getxCoord() {
        return xCoord;
    }

    public void setxCoord(BigDecimal xCoord) {
        this.xCoord = xCoord;
    }

    public BigDecimal getyCoord() {
        return yCoord;
    }

    public void setyCoord(BigDecimal yCoord) {
        this.yCoord = yCoord;
    }

    public BigDecimal getPassengerDemand() {
        return passengerDemand;
    }

    public void setPassengerDemand(BigDecimal passengerDemand) {
        this.passengerDemand = passengerDemand;
    }

    public BigDecimal getPassengerDemandGrowth() {
        return passengerDemandGrowth;
    }

    public void setPassengerDemandGrowth(BigDecimal passengerDemandGrowth) {
        this.passengerDemandGrowth = passengerDemandGrowth;
    }

    @Override
    public String toString() {
        return "RoutePoint{" +
                "rpointId=" + rpointId +
                ", name='" + name + '\'' +
                ", xCoord=" + xCoord +
                ", yCoord=" + yCoord +
                ", passengerDemand=" + passengerDemand +
                ", passengerDemandGrowth=" + passengerDemandGrowth +
                '}';
    }
}
