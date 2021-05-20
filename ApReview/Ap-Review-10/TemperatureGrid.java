// Part A
public double computeTemp(int row, int col) {
    if (row == 0 || col == 0 || row = temps.length-1 || col = temps[0].length-1) return temps[row][col];
    return (temps[row+1][col] + temps[row-1][col] + temps[row][col-1] + temps[row[col+1]) / 4;
}

// Part B
public boolean updateAllTemps(double tolerance) {
    int n = temps.length, m = temps[0].length;
    double[][] temp = new double[n][m];
    boolean ret = true;
    for (int i = 0; i < n; i++) {
        for (int q = 0; q < m; q++) {
            temp[i][q] = computeTemp[i][q];
            if (Math.abs(temp[i][q] - temps[i][q]) > tolerance) ret = false;
        }
    }
    temps = temp;
    return ret;
}
