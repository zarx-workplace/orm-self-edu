package space.zarx.ormedu.dto;

import org.joda.time.DateTime;

public class DepotLog {
    private long runId;
    private DateTime start;
    private DateTime end;
    private Bus bus;
    private Driver driver;
    private Route route;

    public long getRunId() {
        return runId;
    }

    public void setRunId(long runId) {
        this.runId = runId;
    }

    public DateTime getStart() {
        return start;
    }

    public void setStart(DateTime start) {
        this.start = start;
    }

    public DateTime getEnd() {
        return end;
    }

    public void setEnd(DateTime end) {
        this.end = end;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }


    @Override
    public String toString() {
        return "DepotLog{" +
                "runId=" + runId +
                ", start=" + start +
                ", end=" + end +
                ", bus=" + bus +
                ", driver=" + driver +
                ", route=" + route +
                '}';
    }
}
