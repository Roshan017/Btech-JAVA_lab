public class Binary {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 62, 96, 10, 8, 65, 76};
        
        int key = 30;
        boolean flag = false;
        int temp;

        // Bubble Sort
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for(int i = 0;i<a.length;i++)
        {
            System.out.println(a[i]);
            
        }
        // Perform Binary Search
        int l = 0;
        int r = a.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;  // Improved way to calculate the midpoint
            if (key == a[mid]) {
                System.out.println("Key Found at index: " + mid);
                flag = true;
                break;
            } 
            if (key > a[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        if (!flag) {
            
            System.out.println("Key Not Found");
        }
    }
}
