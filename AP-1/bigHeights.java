public int bigHeights(int[] heights, int start, int end) {
    int total = 0;
  for(int x = start; x < end; x++){
    if(Math.abs(heights[x+1] - heights[x]) >= 5){
      total++;
    }

  }
  return total;
}