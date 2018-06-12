public int sumHeights2(int[] heights, int start, int end) {
  int total = 0;
  for(int x = start; x < end; x++){
    if((heights[x] - heights[x+1])<0){
      total = total + Math.abs(2*(heights[x] - heights[x+1]));
    }
    else {
      total = total + Math.abs((heights[x] - heights[x+1]));
    }
  }
  return total;
}