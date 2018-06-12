public int sumHeights(int[] heights, int start, int end) {
  int total = 0;
  for(int x = start; x < end; x++){
    total = total + Math.abs(heights[x] -heights[x+1]);
  }
  return total;
}