package space.zarx.ormedu.dto;

import org.joda.time.DateTime;

public class RoutePointLog {
    private long rplIdp;
    private long runId;
    private DateTime stopDate;
    private int passengersBoarded;
    private int passengersArrived;

    public long getRplIdp() {
        return rplIdp;
    }

    public void setRplIdp(long rplIdp) {
        this.rplIdp = rplIdp;
    }

    public long getRunId() {
        return runId;
    }

    public void setRunId(long runId) {
        this.runId = runId;
    }

    public DateTime getStopDate() {
        return stopDate;
    }

    public void setStopDate(DateTime stopDate) {
        this.stopDate = stopDate;
    }

    public int getPassengersBoarded() {
        return passengersBoarded;
    }

    public void setPassengersBoarded(int passengersBoarded) {
        this.passengersBoarded = passengersBoarded;
    }

    public int getPassengersArrived() {
        return passengersArrived;
    }

    public void setPassengersArrived(int passengersArrived) {
        this.passengersArrived = passengersArrived;
    }

    @Override
    public String toString() {
        return "RoutePointLog{" +
                "rplIdp=" + rplIdp +
                ", runId=" + runId +
                ", stopDate=" + stopDate +
                ", passengersBoarded=" + passengersBoarded +
                ", passengersArrived=" + passengersArrived +
                '}';
    }
}
