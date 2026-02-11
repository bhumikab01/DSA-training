public class revarray {
    public int[] reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return arr;
    }
    public static void main(String[] args) {
        revarray obj = new revarray();
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversedArr = obj.reverseArray(arr);
        System.out.print("Reversed Array: ");
        for (int num : reversedArr) {
            System.out.print(num + " ");
        }
    }
}

    
