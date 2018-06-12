public int scoresSpecial(int[] a, int[] b) {
  return (scorer(a) + scorer(b));
}

public int scorer(int[] x){
  int curr = 0;
  for(int i:x){
    if(i>curr && i%10 == 0){
      curr = i;
    }
  }
  return curr;
}