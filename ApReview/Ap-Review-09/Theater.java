public class Seat {
    private boolean available;
    private int tier;

    public Seat(boolean isAvail, int tierNum) {
        available = isAvail;
        tier = tierNum;
    }

    public boolean isAvailable() {  return available;  }

    public int getTier() {  return tier;  }

    public void setAvailability(boolean isAvail) {  available = isAvail;  }
}

public class Theater {
    private Seat[][] theaterSeats;

    // Part A
    public Theater(int seatsPerRow, int tier1Rows, int tier2Rows) {
        int n = tier1Rows+tier2Rows;
        theaterSeats = new Seat[n][seatsPerRow];
        for (int i = 0; i < n; i++) {
            for (int q = 0; q < seatsPerRow; q++) {
                if (i < tier1Rows) theaterSeats[i][q] = new Seat(true, 1);
                else theaterSeats[i][q] = new Seat(true, 2);
            }
        }
    }

    // Part B
    public boolean reassignSeat(int fromRow, int fromCol, int toRow, int toCol) {
        Seat a = theaterSeats[fromRow][fromCol];
        Seat b = theaterSeats[toRow][toCol];
        if (b.isAvailable() && b.getTier() >= a.getTier()) {
            b.setAvailability(false);
            a.setAvailability(true);
            return true;
        }
        return false;
    }

}
