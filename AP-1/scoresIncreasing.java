public boolean scoresIncreasing(int[] scores) {
  int prev = scores[0];
  boolean trues = true;
  for (int x = 1; x <= scores.length-1; x++){
    if (scores[x] >= prev) {
      trues = true;
    }
    else {
      trues = false;
      return false;
    }
    prev = scores[x];
  }
  return trues;
}
