public boolean scores100(int[] scores) {
  int prev = 0;
  for(int i:scores){
    if(prev==i){
      return true;
    }
    prev = i;
  }
  return false;
}
