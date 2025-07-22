public class Program {
    public static void main(String[] args) {
        int nums[];
        int[] nums_;

        int[] nums1 = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(nums1[0]);
        // Equal
        int[] nums2 = { 1, 2, 3, 4, 5 };
        System.out.println(nums2[0]);
        
        nums1[0] = 2;
        System.out.println(nums1[0]);
    }
}
