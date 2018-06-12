public int wordsCount(String[] words, int len) {
  int counter = 0;
  for (String i:words){
    if(i.length() == len){
      counter+=1;
    }
  }
  return counter;
}