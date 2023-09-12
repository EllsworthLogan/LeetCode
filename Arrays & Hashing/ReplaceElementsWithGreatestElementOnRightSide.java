class Solution {
    public int[] replaceElements(int[] arr) {

        int lastIndex = arr.length - 1;
        int[] sol = new int[arr.length];
        int greatest = arr[lastIndex];

        sol[lastIndex] = -1;
        for (int i = lastIndex - 1; i >= 0; i--) {
            if (arr[i+1] > greatest) {
                greatest = arr[i+1];
            }
            sol[i] = greatest;
        }

        return sol;
    }
}
