import java.util.PriorityQueue;

// Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
// You may assume k s always valid, 1 ≤ k ≤ array's length.

// Input: [3,2,1,5,6,4] and k = 2
// Output: 5

// Input: [3,2,3,1,2,4,5,5,6] and k = 4
// Output: 4

class KthLargestElementInAnArray {

    public int findKthLargest(int[] numbers, int k) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

        for (int number : numbers) {
            minHeap.add(number);

            if (minHeap.size() > k) {
                minHeap.remove();
            }
        }
        return minHeap.remove();
    }
}

class Main {
    public static void main(String[] args) {

        KthLargestElementInAnArray question = new KthLargestElementInAnArray();

        int[] array = {3,2,3,1,2,4,5,5,6};

        int answer = question.findKthLargest(array, 4);
        System.out.println(answer);


        int[] array1 = {3,5,2,1,6,7,8,9,4};

        int answer1 = question.findKthLargest(array1, 2);
        System.out.println(answer1);
        
    }
}