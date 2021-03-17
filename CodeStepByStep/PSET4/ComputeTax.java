public double computeTax(double salary) {
    if (salary <= 7150) {
        return 0 + (salary-0)*.10;
    } else if (salary <= 29050) {
        return 715 + (salary-7150)*.15;
    } else if (salary <= 70250) {
        return 4000 + (salary-29050)*.25;
    } else {
        return 14325 + (salary-70350)*.28;
    }
}
