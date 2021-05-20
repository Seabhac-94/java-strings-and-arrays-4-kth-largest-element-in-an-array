// Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
// You may assume k s always valid, 1 ≤ k ≤ array's length.

// Input: [3,2,1,5,6,4] and k = 2
// Output: 5

// Input: [3,2,3,1,2,4,5,5,6] and k = 4
// Output: 4

class KthLargestMElementInAnArray {
    public int findKthLargest(int[] numbers, int[] k) {
        

        make a heap 
        make a priority queue

        iterate through the inout array 
        place each number in array into a min heap

        if (heaps size is > k) {
            remove k
        }
        return the kth element 


    }
}

class Main {
    public static void main(String[] args) {
        
    }
}