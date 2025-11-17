package ru.pliev.labs.lab5.gasStation;

public class GasolineInfo {
    private int minPrice;
    private int stationCount;

    GasolineInfo(int minPrice, int stationCount) {
        this.minPrice = minPrice;
        this.stationCount = stationCount;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getStationCount() {
        return stationCount;
    }

    public void setStationCount(int stationCount) {
        this.stationCount = stationCount;
    }

    public void StationCountPlus1() {
        stationCount++;
    }

    @Override
    public String toString() {
        return "GasolineInfo{" +
                "minPrice=" + minPrice +
                ", stationCount=" + stationCount +
                '}';
    }
}
