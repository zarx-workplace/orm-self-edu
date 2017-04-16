package space.zarx.ormedu.dto;

import java.math.BigDecimal;
import java.util.List;

public class Route {
    private int routeId;
    private List<RoutePoint> routePoints;
    private BigDecimal ticketCost;
    private BigDecimal avgRidePoints;
    private BigDecimal returnWayLength;

    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public List<RoutePoint> getRoutePoints() {
        return routePoints;
    }

    public void setRoutePoints(List<RoutePoint> routePoints) {
        this.routePoints = routePoints;
    }

    public BigDecimal getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(BigDecimal ticketCost) {
        this.ticketCost = ticketCost;
    }

    public BigDecimal getAvgRidePoints() {
        return avgRidePoints;
    }

    public void setAvgRidePoints(BigDecimal avgRidePoints) {
        this.avgRidePoints = avgRidePoints;
    }

    public BigDecimal getReturnWayLength() {
        return returnWayLength;
    }

    public void setReturnWayLength(BigDecimal returnWayLength) {
        this.returnWayLength = returnWayLength;
    }

    @Override
    public String toString() {
        return "Route{" +
                "routeId=" + routeId +
                ", routePoints=" + routePoints +
                ", ticketCost=" + ticketCost +
                ", avgRidePoints=" + avgRidePoints +
                ", returnWayLength=" + returnWayLength +
                '}';
    }
}
