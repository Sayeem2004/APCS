// Part A
public boolean record(int score) {
    for (int i = 0; i < scoreList.size(); i++) {
        if (scoreList.get(i).getScore() == score) {
            scoreList.get(i).increment();
            return false;
        }
        if (scoreList.get(i).getScore() > score) {
            scoreList.add(i,new ScoreInfo(score);
            return true;
        }
    }
    scoreList.add(new ScoreInfo(score);
    return true;
}

// Part B
public void recordScore(int[] stuScores) {
    for (int x : stuScores) {
        record(x);
    }
}
