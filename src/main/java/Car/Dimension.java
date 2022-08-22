package Car;

public class Dimension {
    private int hightInCentimeters;
    private int widthInCentimeters;
    private int trankCapacityInLiters;

    public Dimension(int hightInCentimeters, int widthInCentimeters, int trankCapacityInLiters) {
        this.hightInCentimeters = hightInCentimeters;
        this.widthInCentimeters = widthInCentimeters;
        this.trankCapacityInLiters = trankCapacityInLiters;
    }

    public int getHightInCentimeters() {
        return hightInCentimeters;
    }

    public void setHightInCentimeters(int hightInCentimeters) {
        this.hightInCentimeters = hightInCentimeters;
    }

    public int getWidthInCentimeters() {
        return widthInCentimeters;
    }

    public void setWidthInCentimeters(int widthInCentimeters) {
        this.widthInCentimeters = widthInCentimeters;
    }

    public int getTrankCapacityInLiters() {
        return trankCapacityInLiters;
    }

    public void setTrankCapacityInLiters(int trankCapacityInLiters) {
        this.trankCapacityInLiters = trankCapacityInLiters;
    }
}
