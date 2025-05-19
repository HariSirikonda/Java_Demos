public class Demo3 {
    void checkLength(int[] nums, int x) {
        int l = nums.length;
        if (x <= l) {
            System.out.println("Length is valid");
        } else {
            System.out.println("Length exceeded");
        }
    }

    int maxElement(int[] nums) {
        int max = 0;
        for (int x : nums) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        Demo3 obj = new Demo3();
        obj.checkLength(arr, 10);
        int res = obj.maxElement(arr);
        System.out.println("max ELement : " + res);
    }
}
