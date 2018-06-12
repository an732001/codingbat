public int matchUp(String[] a, String[] b) {
  int c = 0;
  int y = 0;
  for (String x:a){
      if(x != "" && b[y] != ""){
        if(x.charAt(0) == b[y].charAt(0)){
          c++;
        }
      }
    y++;
  }
  return c;
}