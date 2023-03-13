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
            if (arr[left] <= arr[right]) {
                int square = arr[left] * (right - left);
                if (biggestSquare < square) {
                    biggestSquare = square;
                }
                left++;
            } else {
                int square = arr[right] * (right - left);
                if (biggestSquare < square) {
                    biggestSquare = square;
                }
                right--;
            }
        }
        return biggestSquare;
    }
}
