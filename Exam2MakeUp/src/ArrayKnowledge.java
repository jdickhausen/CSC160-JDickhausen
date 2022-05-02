
public class ArrayKnowledge {
	public static void main(String[] args) {
		zeroFront();
	}
	public static boolean has22 (int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2 && nums[i+1] == 2) {
				return true;
			}
		}
		return false;
	}
	public static int [] zeroFront() {
		int[] nums= {1, 5, 0, 1, 2, 3, 1};
		int count = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				nums[count] = nums[i];
			}
			count++;
		}
		for (int j = 0; j < nums.length; j++) {
			System.out.println(nums[j]);
		}
		return nums;
	}
}
