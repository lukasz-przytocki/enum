package zad1;

public class TireParam {
    private Type seazon;
    private String Vehicle;
    private int size;

    public TireParam(Type seazon, String vehicle, int size) {
        this.seazon = seazon;
        Vehicle = vehicle;
        this.size = size;
    }

    public Type getSeazon() {
        return seazon;
    }

    public void setSeazon(Type seazon) {
        this.seazon = seazon;
    }

    public String getVehicle() {
        return Vehicle;
    }

    public void setVehicle(String vehicle) {
        Vehicle = vehicle;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "zad1.TireParam{" +
                "seazon=" + seazon +
                ", Vehicle='" + Vehicle + '\'' +
                ", size=" + size +
                '}';
    }
}
