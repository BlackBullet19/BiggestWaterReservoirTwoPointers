public class BiggestWaterReservoir {

    public static void main(String[] args) {
        int[] heightOfColumns = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution(heightOfColumns));
    }

    private static int solution(int[] arr) {
        int biggestSquare = 0;
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int length = right - left;
            int leftHeight = arr[left];
            int rightHeight = arr[right];
            biggestSquare = Math.max(biggestSquare, Math.min(leftHeight, rightHeight) * length);
            if (leftHeight <= rightHeight) {
                left++;
            } else {
                right--;
            }
        }
        return biggestSquare;
    }
}
