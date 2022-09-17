import java.util.Arrays;
import java.util.Iterator;

public class FusedBars {
	public static void main(String[] args) {
	    // Q1
		System.out.println(bestValueForFused(4, new int[] {}, new int[] {})); // 0
	    System.out.println(bestValueForFused(4, new int[] {4}, new int[] {1})); // 4
	    System.out.println(bestValueForFused(4, new int[] {4, 10, 2}, new int[] {3, 1, 5})); // 12
	    System.out.println(bestValueForFused(4, new int[] {4, 2, 2}, new int[] {3, 2, 5})); // 14
	    System.out.println(bestValueForFused(6, new int[] {4, 2, 1}, new int[] {3, 3, 5})); // 18
	    System.out.println(bestValueForFused(6, new int[] {4, 2, 1}, new int[] {3, 2, 9})); // 21 (3*4+9*1)
		System.out.println(bestValueForFused(3, new int[] {1, 2}, new int[] {10, 20})); //1*10 + 2*20 = 50 
		System.out.println(bestValueForFused(4, new int[] {4, 10, 2, 1}, new int[] {3, 1, 5, 10})); //20 see my piazza post: https://piazza.com/class/kjkot7wwgl53ya?cid=932
	    System.out.println(bestValueForFused(4, new int[] {3, 1, 5, 2, 1}, new int[] {7, 10, 3, 4, 5})); //31
	    System.out.println();

	    // Q2
//	    System.out.println(bestValueForFusedDP(4, new int[] {}, new int[] {})); // 0
//	    System.out.println(bestValueForFusedDP(4, new int[] {4}, new int[] {1})); // 4
//	    System.out.println(bestValueForFusedDP(4, new int[] {4, 10, 2}, new int[] {3, 1, 5})); // 12
//	    System.out.println(bestValueForFusedDP(4, new int[] {4, 2, 2}, new int[] {3, 2, 5})); // 14
//	    System.out.println(bestValueForFusedDP(6, new int[] {4, 2, 1}, new int[] {3, 3, 5})); // 18
//	    System.out.println(bestValueForFusedDP(6, new int[] {4, 2, 1}, new int[] {3, 2, 9})); // 21 (3*4+9*1)
//
//	    //other test cases for bestValueForFusedDP
//	    System.out.println(bestValueForFusedDP(3, new int[] {1, 2}, new int[] {10, 20})); //1*10 + 2*20 = 50 
//	    //System.out.println("4, new int[] {4, 10, 2, 1}, new int[] {3, 1, 5, 10})");
//	    System.out.println(bestValueForFusedDP(4, new int[] {4, 10, 2, 1}, new int[] {3, 1, 5, 10})); //20 see my piazza post: https://piazza.com/class/kjkot7wwgl53ya?cid=932
//	    System.out.println(bestValueForFusedDP(4, new int[] {3, 1, 5, 2, 1}, new int[] {7, 10, 3, 4, 5})); //31
//	    //System.out.println(bestValueForFusedDP(10, new int[] {4, 20, 2, 1, 2}, new int[] {3, 1, 5, 10, 6}));
//	    //System.out.println(bestValueForFusedDP(7, new int[] {4, 10, 2, 1}, new int[] {3, 1, 5, 10})); 
	    
	    
	    // testing 1D array DP implementation
//	    System.out.println(bestValueForFusedDP1D(4, new int[] {}, new int[] {})); // 0
//	    System.out.println(bestValueForFusedDP1D(4, new int[] {4}, new int[] {1})); // 4
//	    System.out.println(bestValueForFusedDP1D(4, new int[] {4, 10, 2}, new int[] {3, 1, 5})); // 12
//	    System.out.println(bestValueForFusedDP1D(4, new int[] {4, 2, 2}, new int[] {3, 2, 5})); // 14
//	    System.out.println(bestValueForFusedDP1D(6, new int[] {4, 2, 1}, new int[] {3, 3, 5})); // 18
//	    System.out.println(bestValueForFusedDP1D(6, new int[] {4, 2, 1}, new int[] {3, 2, 9})); // 21 (3*4+9*1)
//
////	    //other test cases for bestValueForFusedDP
//	    System.out.println(bestValueForFusedDP1D(3, new int[] {1, 2}, new int[] {10, 20})); //1*10 + 2*20 = 50 
////	    //System.out.println("4, new int[] {4, 10, 2, 1}, new int[] {3, 1, 5, 10})");
//	    System.out.println(bestValueForFusedDP1D(4, new int[] {4, 10, 2, 1}, new int[] {3, 1, 5, 10})); //20 see my piazza post: https://piazza.com/class/kjkot7wwgl53ya?cid=932
//	    System.out.println(bestValueForFusedDP1D(4, new int[] {3, 1, 5, 2, 1}, new int[] {7, 10, 3, 4, 5})); //31
//	    //System.out.println(bestValueForFusedDP(10, new int[] {4, 20, 2, 1, 2}, new int[] {3, 1, 5, 10, 6}));
//	    //System.out.println(bestValueForFusedDP(7, new int[] {4, 10, 2, 1}, new int[] {3, 1, 5, 10})); 
	    
	    
	    //my old original 1d solution
	    System.out.println(bestValueForFusedDPOld(4, new int[] {}, new int[] {})); // 0
	    System.out.println(bestValueForFusedDPOld(4, new int[] {4}, new int[] {1})); // 4
	    System.out.println(bestValueForFusedDPOld(4, new int[] {4, 10, 2}, new int[] {3, 1, 5})); // 12
	    System.out.println(bestValueForFusedDPOld(4, new int[] {4, 2, 2}, new int[] {3, 2, 5})); // 14
	    System.out.println(bestValueForFusedDPOld(6, new int[] {4, 2, 1}, new int[] {3, 3, 5})); // 18
	    System.out.println(bestValueForFusedDPOld(6, new int[] {4, 2, 1}, new int[] {3, 2, 9})); // 21 (3*4+9*1)

	    //other test cases for bestValueForFusedDP
	    System.out.println(bestValueForFusedDPOld(3, new int[] {1, 2}, new int[] {10, 20})); //1*10 + 2*20 = 50 
	    //System.out.println("4, new int[] {4, 10, 2, 1}, new int[] {3, 1, 5, 10})");
	    System.out.println(bestValueForFusedDPOld(4, new int[] {4, 10, 2, 1}, new int[] {3, 1, 5, 10})); //20 see my piazza post: https://piazza.com/class/kjkot7wwgl53ya?cid=932
	    System.out.println(bestValueForFusedDPOld(4, new int[] {3, 1, 5, 2, 1}, new int[] {7, 10, 3, 4, 5})); //31
	    //System.out.println(bestValueForFusedDP(10, new int[] {4, 20, 2, 1, 2}, new int[] {3, 1, 5, 10, 6}));
	    //System.out.println(bestValueForFusedDP(7, new int[] {4, 10, 2, 1}, new int[] {3, 1, 5, 10})); 
	}
	
	//recursive solution
	public static int bestValueForFused(int B, int[] counts, int values[]) {
		int[] total = new int[counts.length];
		for(int i = 0; i < total.length; i++) {
			total[i] = counts[i] * values[i];
		}
		
		return bestValueForFusedHelper(B, counts, total, 0);
	}
	public static int bestValueForFusedHelper(int B, int[] counts, int[] total, int index) {
		//base case. the array has been traversed so end the recursive call
		if(index == total.length) {
			return 0;
		}
		//if the current index bar can fit in the bag, return the max of either taking that bar(and subtracing from the bag capacity), or of not taking it and checking 
		//the rest of the bag.
		//more simply: if the bar fits, either put the bar in the bag, or don't
		if(B-counts[index] >= 0) {
			return Math.max(total[index] + bestValueForFusedHelper(B-counts[index], counts, total, index+1), bestValueForFusedHelper(B, counts, total, index+1));
		}
		//the current bar couldn't fit in the bag, so move on to the next bar.
		else {
			return bestValueForFusedHelper(B, counts, total, index+1);
		}
	}
	
	//I believe the reason for having a 2d array is to avoid accumulating the fused bar's value more than once. This must be avoided because there is only 
	//1 fused bar of a certain type. My 1d solution below this method overcomes this by iterating backwards in the inner for loop. 
	//This way when bestVTable[size-counts[barIndex]] is used, the lower indexed value cannot have a contribution from the current bar's value yet.
	//Since it iterates backwards, and never references forwards, the current bar's value can never be added more than once per index
	//originally this method directly below also iterated backwards in the inner for loop, but I can see that after changing it to iterate forwards,
	//it still works. this is because the previous index reference is always using bestVTable[bar-1][someweight], bar-1 means it is referencing the row above it.
	//the row above it was never affected by the current bar, so there is no possibility of accumulating a single bar's weight more than once.
	public static int bestValueForFusedDP(int B, int[] counts, int values[]) {
		int[] total = new int[counts.length];
		for(int i = 0; i < total.length; i++) {
			total[i] = counts[i] * values[i];
		}
		
		int numBars = counts.length;
		//no bars at all, so just return 0
		if(numBars == 0) {
			return 0;
		}
		//1 fused bar
		if(numBars == 1) {
			//if the bag can fit the fused bar, return its value
			if(counts[0] <= B) {
				return total[0];
			}
			return 0;
		}
		
		//+1 so that algorithm can work with first row, and when reaching the current bar weight
		//bestVTable[bar-1][weight] requires accessing the row above. For the first bar's row, there is no
		//bar before it. so having an all 0 row above makes it work with that
		//bestVTable[bar-1][weight-barWeight] requires accessing weight-barWeight column.When for loop hits
		//the barWeight, we get weight-barWeight = 0. this 0 weight should return 0, 
		//not the 1st bar's value(0th indexed bar in counts). so the first column is all 0's making algo work there
		//it just sets the cell in the array to current bar weight
		int[][] bestVTable = new int[numBars+1][B+1];
		for(int bar = 1; bar <= numBars; bar++) {
			
			int barWeight = counts[bar-1];
			int barValue = total[bar-1];
//			System.out.println("w: " + barWeight + "v: " + barValue);
			//fused bar cannot fit in bag, so just copy previous row
			if(barWeight > B) {
				for(int weight = 0; weight <= B; weight++) {
					bestVTable[bar][weight] = bestVTable[bar-1][weight];
				}
//				System.out.println("can't use bar");
//				print(bestVTable);
				continue;
			}
			//for each weight starting from the max weight, see if its value is greater than
			//the current bar weight's value + (weight-current bar weight)'s value.
			//choose the max.
//			for(int weight = B; weight >= barWeight; weight--) {
////				System.out.println("in for");
//				bestVTable[bar][weight] = Math.max(bestVTable[bar-1][weight], barValue + bestVTable[bar-1][weight-barWeight]);
//			}
			for(int weight = barWeight; weight <= B; weight++) {
				bestVTable[bar][weight] = Math.max(bestVTable[bar-1][weight], barValue + bestVTable[bar-1][weight-barWeight]);
			}
//			print(bestVTable);
		}
		
		//the bottom left cell should contain the final value
		return bestVTable[numBars][B];
	}
	
	//using total array
//	public static int bestValueForFusedDP1D(int B, int[] counts, int values[]) {
//		int[] bestVTable = new int[B+1];
//		int[] total = new int[counts.length];
//		for(int i = 0; i < total.length; i++) {
//			total[i] = counts[i] * values[i];
//		}
//		
//		for(int barIndex = 0; barIndex < total.length; barIndex++) {
//			//going backwards to prevent a fused bar's value from accumulating with its own value. 
//			//this is because there is only 1 fused bar, there is no choosing 2 of the same fused bar.
//			for(int size = bestVTable.length-1; size >= 1; size--) {
//				if(size >= counts[barIndex]) {
//					bestVTable[size] = Math.max(bestVTable[size], total[barIndex] + bestVTable[size-counts[barIndex]]);
//				}
////				System.out.println(Arrays.toString(bestVTable));
//			}
//			
////			System.out.println("next fused bar");
//		}
//		
//		return bestVTable[bestVTable.length-1];
//	}
	
	
	public static int bestValueForFusedDP1D(int B, int[] counts, int values[]) {
		int[] bestVTable = new int[B+1];
		
		for(int barIndex = 0; barIndex < counts.length; barIndex++) {
			//going backwards to prevent a fused bar's value from accumulating with its own value. 
			//this is because there is only 1 fused bar, there is no choosing 2 of the same fused bar.
			for(int size = bestVTable.length-1; size >= 1; size--) {
				if(size >= counts[barIndex]) {
					bestVTable[size] = Math.max(bestVTable[size], counts[barIndex]*values[barIndex] + bestVTable[size-counts[barIndex]]);
				}
			}
		}
		
		return bestVTable[bestVTable.length-1];
	}
	
	
	//seems like this code keeps track of the best value of a bar/combination of bars at a certain combined size. This does not update all sizes greater in ValueAtSize
	//if there is a value other than 0 in the array, it was the exact weight of a bar/combination of bars
	public static int bestValueForFusedDPOld(int B, int[] counts, int[] values) {
	    //deals with case where length of counts and values is 0 or 1
	    if (counts.length == 0) {
	      return 0;
	    } else if (counts.length == 1) { 
	      if(counts[0] <= B){
	        return counts[0] * values[0];
	      }else { //
	        return 0;
	      }
	    }

	    int[] ValueAtSize = new int[B]; //gives max total value at that size so far. The size j of ValueAtSize[j] can be a size of multiple different bars too.
	    
	    for(int i = 0; i < counts.length; i++){ //goes through the bars in counts and values
	      
	      if(counts[i]>B){continue;}//bar too big, so skip
	      int fusedBarVal = counts[i]*values[i]; //value of fused bar

	      for(int j = B-1; j >=0; j--){ //j is a size(minus 1) 

	        int combinedSize = counts[i] + j; //combined size of current bar and size j 

	        //*new comment
	        //Checks to see if the current bar can be combined with another bar/previous combination of bars to have a greater value at ValueAtSize[combinedSize]
	        
	        //This if statement is to potentially combines bars values
	        //only if combined size will fit in bag. And the max value at size j so far cant be 0(meaning no bar size or combination of bar sizes has been j yet.)
	        if(combinedSize < B && ValueAtSize[j] != 0){
	          int combinedValue = fusedBarVal+ValueAtSize[j];//the combined value of the current bar and the value at size j in ValueAtSize array
	          if(combinedValue > ValueAtSize[combinedSize]){ //if the combinedValue is greater than the greatest value of the combined size so far
	            ValueAtSize[combinedSize] = combinedValue;
	          }
	        }

	        //*new comment
	        //This is where ValuesAtSize[size of current bar] is set to the current bar's value, if some combination of Different bars didn't have a greater value
	        //at this size
	        
	        //potentially replaces the value in ValueAtSize at this current fused bars size only(not combined with others)
	        //dont do it until j == counts[i]-1 so that this bar can potentially be combined above with a bar that had the same size already
	        if(j == counts[i]-1 && ValueAtSize[counts[i]-1] < fusedBarVal){
	          ValueAtSize[counts[i]-1] = fusedBarVal;
	        }
	      }
	    }
	  
	    //finds the max value from ValueAtSize. So it finds the largest value of any size combination possible
	    int max = 0;
	    for(int i = 0; i < B; i++){
	      if(ValueAtSize[i] > max){
	        max = ValueAtSize[i];
	      }
	    }
	    return max;
	} 
	
	
	
	public static void print(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}








