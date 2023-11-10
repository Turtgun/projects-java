package ji;

public class FrogHopper {
    private double minQJ;
    private double totalJDist;
    private int numJ;
    private int numQJs;

    public FrogHopper(double minQJ) {
        this.minQJ = minQJ;
    }

    public void addJumpDistance(double jDist) {
        totalJDist += jDist;
        numJ++;
        if (jDist>=minQJ) {numQJs++;}
    }

    public int qualifyingJumps() {
        return numQJs;
    }
    public double averageDistance() {
        return (numJ==0) ? 0 : totalJDist/numJ;
    }
}
