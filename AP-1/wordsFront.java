public String[] wordsFront(String[] words, int n) {
  String[] newArr = new String[n];
  for(int i=0; i < n; i++){
    newArr[i] = words[i];
  }
  return newArr;
}