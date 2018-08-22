class P2_Sorted {
    public int isArrayInSortedOrder(int[] A, int index) {
        if (index == 1) { 
            return 1;
        }
        
        return (A[index-1] < A[index-2]) ? 0 : isArrayInSortedOrder(A, index - 1);
    }

    public static void main(String[] args) {
        P2_Sorted p = new P2_Sorted();
        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {1, 3, 2, 4};
        boolean result1 = p.isArrayInSortedOrder(a1, a1.length) == 1;
        boolean result2 = p.isArrayInSortedOrder(a2, a2.length) == 1;
        System.out.println("Array {1, 2, 3, 4} is sorted ? " + result1);
        System.out.println("Array {1, 3, 2, 4} is sorted ? " + result2);
    }
}
