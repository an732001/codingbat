public ArrayList<String> wordsWithout(String[] words, String target) {
  ArrayList<String> newArray = new ArrayList<String>();
  for (String x:words){
    if (x != target){
      newArray.add(x);
    }
  }
  return newArray;
}