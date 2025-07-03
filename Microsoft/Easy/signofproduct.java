// sign  of  the  product
// 1  if  x  is  positive
// -1  if  x  is  negative
//  0  if  x  is  equal  to  0


//  ex =  nums  = [-1,-2,-3,-4,3,2,1]
                     //  2 -6 24 72 154 last  154  is  positive  so  op is  1 ;
//  op = 1;


public class signofproduct {
	public static   int arraysign(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				return 0;
			} else if (nums[i] < 0) {
				count++;

			}
		}
		if (count % 2 == 1) {
			return 1;
		} else {
			return -1;
		}
	}
	public static void main(String[] args) {
		int[] nums = {-1, -2, -3, -4, 3, 2, 1};
		int result = arraysign(nums);
		System.out.println("The sign of the product is: " + result);
		// Output: The sign of the product is: 1
	}

}
