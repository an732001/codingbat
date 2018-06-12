public int[] copyEndy(int[] nums, int count) {
    int[] newArr = new int[count];
  int c = 0;
  int x = 0;
  while (c != count){
    if (isEndy(nums[x])){
      newArr[c] = nums[x];
      c++;
    }
    x++;
  }
    return newArr;
}

public boolean isEndy(int n){
  if (n <= 10 || (n >= 90 && n <= 100)){
    return true;
  }
  else{
    return false;
  }
}