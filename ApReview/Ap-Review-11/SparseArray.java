// Part A
public int getValueAt(int row, int col) {
    for (SparseArrayEntry x : entries) {
        if (x.getRow() == row && x.getCol() ==  col) return x.getValue();
    }
    return 0;
}

// Part B
public void removeColumn(int col) {
    numCols--;
    for (int i = 0; i < entries.size(); i++) {
        if (entries.get(i).getCol() == col) entries.remove(i);
        else if (entries.get(i).getCol() > col) entries.set(new SparseArrayEntry(entries.get(i).getRow(), entries.get(i).getCol()-1, entries.get(i).getValue()));
    }
}
