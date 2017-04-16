package space.zarx.ormedu.dto;

public class Bus {
    private BusProto proto;
    private String vin;
    private long mileage = 0;
    private double amortization = 1.0d;

    public BusProto getProto() {
        return proto;
    }

    public void setProto(BusProto proto) {
        this.proto = proto;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }

    public double getAmortization() {
        return amortization;
    }

    public void setAmortization(double amortization) {
        this.amortization = amortization;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "proto=" + proto +
                ", vin='" + vin + '\'' +
                ", mileage=" + mileage +
                ", amortization=" + amortization +
                '}';
    }
}
