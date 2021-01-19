import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaiTest {

	public static void main(String[] args) {
//		Bài test 1
		int n = 3;
		Integer[] arr = { 11, 2, 8, 10, 5, 99, 1, 8, 9 };
		List<Integer> list = Arrays.asList(arr);
		List<Integer> listNew = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			for (int x = i; x < 3 * n; x = x + n) {
				listNew.add(list.get(x));
			}
		}
		System.out.println("Bài test 1");
		System.out.println(listNew);

//		Bài test 2
		int n2 = 8;
		int a[] = { 0, 100, -4, 8, 143, 5, 99, 100 };
//		for(int i = 0; i < n; i++) cin >> a[i];
		int max = a[0];
		for (int i = 0; i < n2 - 1; i++) {
			for (int j = i + 1; j < n2; j++) {
				if (a[i] + a[j] > max) {
					max = a[i] + a[j];
				}
			}
		}
		System.out.println("Bài test 2");
		System.out.println(max);

//		Bài test 3
		int n3 = 11;
		int a3[] = { 1, 5, 4, 7, 9, 0, -10, 13, 93, 14, 15 };
		int min3 = Math.abs(a3[0] - a3[1]);

		for (int i = 0; i < n3 - 1; i++) {
			for (int j = i + 1; j < n3; j++) {
				if (Math.abs(a3[i] - a3[j]) < min3) {
					min3 = Math.abs(a3[i] - a3[j]);
				}
			}
		}

		for (int i = 0; i < n3 - 1; i++) {
			for (int j = i + 1; j < n3; j++) {
				if (Math.abs(a3[i] - a3[j]) == min3) {
					if (a3[i] > a3[j]) {
						System.out.println("Bài test 3");
						System.out.println(a3[j] + " " + a3[i]);
					} else {
						System.out.println("Bài test 3");
						System.out.println(a3[i] + " " + a3[j]);
					}
				}
			}
		}
	}
}
