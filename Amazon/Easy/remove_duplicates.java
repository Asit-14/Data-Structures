// remove duplicates from a sorted array
// Time Complexity: O(n)
// Space Complexity: O(1)

public class remove_duplicates {

	public static void main(String args[]) {

		int nums[] = new int[10];
		nums[0] = 0;
		nums[1] = 1;
		nums[2] = 1;
		nums[3] = 1;
		nums[4] = 2;
		nums[5] = 2;
		nums[6] = 3;
		nums[7] = 4;
		System.out.print(removedup(nums));
	}

	public static int removedup(int[] nums) {
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[i] < nums[j]) {
				int temp = nums[i + 1];
				nums[i + 1] = nums[j];
				nums[j] = temp;
				i++;
			}
		}
		return i + 1; // return the length of the array without duplicates
	}

}