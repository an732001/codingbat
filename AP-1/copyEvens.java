public int[] copyEvens(int[] nums, int count) {
  int[] newArr = new int[count];
  int c = 0;
  int x = 0;
  while (c != count){
    if (nums[x] % 2 == 0){
      newArr[c] = nums[x];
      c++;
    }
    x++;
  }
    return newArr;
}