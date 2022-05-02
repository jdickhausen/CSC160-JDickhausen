
public class ArrayKnowledge {
	public static void main(String[] args) {
		
	}
	public static boolean has22 (int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2 && nums[i+1] == 2) {
				return true;
			}
		}
		return false;
	}
	public static int [] zeroFront(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				nums[i] = nums[count];
				count++;
			}
		}
		return nums;
	}
}
