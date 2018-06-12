public String[] mergeTwo(String[] a, String[] b, int n) {
  String[] arr = new String[n];
  int x = 0;

  int aIndex = 0;
  int bIndex = 0;
  while(x < n){
    String aCurr = a[aIndex];
    String bCurr = b[bIndex];
    if(aCurr.compareTo(bCurr) < 0){
      arr[x] = a[aIndex];
      aIndex++;
    }
    else if (a[aIndex].compareTo(b[bIndex]) > 0){
      arr[x] = b[bIndex];
      bIndex++;
    }
    else {
      arr[x] = a[aIndex];
      aIndex++;
      bIndex++;
    }
    x++;
  }
  return arr;
}