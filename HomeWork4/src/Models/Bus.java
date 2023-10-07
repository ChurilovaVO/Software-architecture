package Models;

public class Bus {

    private String gosNumber;
    private int id;
    private int placesCap;
    private boolean isReady;

    public Bus(String gosNumber, int id, int placesCap) {
        this.gosNumber = gosNumber;
        this.id = id;
        this.placesCap = placesCap;
        this.isReady = true;
    }

    public String getGosNumber() {
        return gosNumber;
    }

    public int getId() {
        return id;
    }

    public int getPlacesCap() {
        return placesCap;
    }

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }
}
