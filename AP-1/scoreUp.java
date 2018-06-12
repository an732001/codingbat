public int scoreUp(String[] key, String[] answers) {
  int score = 0;
  for(int x = 0; x <key.length; x++){
    String currK = key[x];
    String currA = answers[x];
    if(currA == "?"){
      score = score + 0;
    }
    else if (currK == currA){
      score = score +4;
    }
    else {
      score = score -1;
    }
  }
  return score;
}