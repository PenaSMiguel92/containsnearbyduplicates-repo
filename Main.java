public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.containsNearbyDuplicate(new int[] { 1, 2, 3, 1 }, 3));
        System.out.println(sol.containsNearbyDuplicate(new int[] { 1, 0, 1, 1 }, 1));
        System.out.println(sol.containsNearbyDuplicate(new int[] {1, 2, 3, 1, 2, 3}, 2));
    } 
} 
