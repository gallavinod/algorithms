package algorithms.array;

import java.util.Arrays;

public class Selection {

	public static int selection(int[] a, int start, int end) {
		if (start == end) {
			return a[start];
		}
		int medians[] = new int[((end - start + 1)/5)+1];
		int medianIndex = 0;
		for (int i=start; i<=end; i += 5) {
			if ((i+4) <= end) {
				Arrays.sort(a, i, i+5);
				medians[medianIndex++] = a[i+2];
			} else {
				Arrays.sort(a, i, end+1);
				medians[medianIndex++] = a[(i+end)/2];
			}
		}
		if (medianIndex == 0) {
			return -1;
		}
		return selection(medians, 0, medianIndex-1);
	}
	
	public static int partition(int[] a, int pivot, int start, int end) {
		while (start <= end) {
			while (a[start] <= pivot) {start++;};
			while (a[end] > pivot) {end--;};
			if (start < end) {
				swap(a, start, end);
				start++;
				end--;
			}
		}
		return end;
	}
	
	public static int kthLargest(int[] a, int k, int start, int end) {
		if (k <= end) {
			if ((end-start+1) <= 5) {
				Arrays.sort(a, start, end+1);
				return a[k];
			}
			int pivot = selection(a, start, end);
			System.out.println(Arrays.toString(a));
			int partitionIndex = partition(a, pivot, start, end);
			System.out.println(Arrays.toString(a));
			System.out.println("partitionIndex: " + partitionIndex);
			if (partitionIndex == k) {
				return pivot;
			} else if (partitionIndex < k) {
				return kthLargest(a, k, partitionIndex+1, end);
			} else {
				return kthLargest(a, k, start, partitionIndex);
			}
		}
		return -1;
	}
	
	public static void swap(int[] a, int x, int y) {
		a[x] = a[x]^a[y];
		a[y] = a[x]^a[y];
		a[x] = a[x]^a[y];
	}
	
	public static void main(String[] args) {
		int[] a = {8,5,3,9,7,4,6,1};
		int k = 2;
		System.out.println(kthLargest(a, k-1, 0, a.length-1));
	}

}
