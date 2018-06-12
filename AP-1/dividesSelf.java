public boolean dividesSelf(int n) {
  int c = 0;
  int x = n;
  while(n != 0){
    if(n%10 == 0){
      return false;
    }
    if(x%(n%10) == 0){
      c=c+1;
    }
    n = n/10;
  }
  if(c==String.valueOf(x).length()){
    return true;
  }
  return false;
}