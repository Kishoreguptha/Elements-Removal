import java.util.Arrays;

public class ElementsRemoval {

    public static int minimumCostToRemoveElements(int[] A) {
        Arrays.sort(A);

        int n = A.length;
        int cost = 0;
        int sum = 0;

        for (int i = n - 1; i >= 0; i--) {
            sum += A[i];
            cost += sum;
        }
        return cost;
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 1};
        int[] arr2 = {5};
        System.out.println("Minimum cost to remove all elements in arr1: " + minimumCostToRemoveElements(arr1));
        System.out.println("Minimum cost to remove all elements in arr2: " + minimumCostToRemoveElements(arr2));
}
}