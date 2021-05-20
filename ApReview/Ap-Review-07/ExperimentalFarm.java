public class ExperimentalFarm {
    private Plot[][] farmPlots;

    public ExperimentalFarm(Plot[][] p) {
        /* implementation not shown */
    }

    // Part A
    public Plot getHighestYield(String c) {
        int mx = Integer.MIN_VALUE, r = -1, s = -1;
        for (int i = 0; i < farmPlots.length; i++) {
            for (int q = 0; q < farmPlots[i].length; q++) {
                if (farmPlots[i][q].getCropType().equals(c) && farmPlots[i][q].getCropYield() > mx) {
                    mx = farmPlots[i][q].getCropYield();
                    r = i; s = q;
                }
            }
        }
        if (r == -1 && s == -1) return null;
        else return farmPlots[r][s];
    }

    // Part B
    public boolean sameCrop(int col) {
        String c = farmPlots[0][c].getCropType();
        for (int i = 1; i < farmPlots.length; i++) {
            if (!farmPlots[i][c].getCropType().equals(c)) return false;
        }
        return true;
    }
}

public class Plot {
    private String cropType;
    private int cropYield;

    public Plot(String crop, int yield) {
        /* implementation not shown */
    }

    public String getCropType() {
        return cropType;
    }

    public int getCropYield() {
        return cropYield;
    }
}
