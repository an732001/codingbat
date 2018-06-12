public int scoresAverage(int[] scores) {
  int first = average(scores, 0, scores.length/2);
  int second = average(scores, (scores.length/2), scores.length);
  if(first > second){
    return first;
  }
  else{
    return second;
  }
}

public int average(int[] scores, int start, int end){
  int total = 0;
  for(int i = start; i < end; i++){
    total = total + scores[i];
  }
  return (total/(end-start));
}
