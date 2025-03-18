public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(find(new int[] {2,4,6,8,10}, 6));
		System.out.println(findLast(new String[] {"No","Oh","Fine"}, "Oh"));
		System.out.println(findSecond(new char[] {'a', 'b', 'c', 'd', 'c'}, 'c'));

	}

	//q1
	public static int find(int[] array1, int num) {
		int index = 0;
		for (int a = 0; a < array1.length; a++) {
			if (array1[a] == num) {
				index = a;
				return index;
			}
		}
		return -1;
	}

	//q2
	public static int findLast(String[] array2, String word) {
		int index2 = -1;
		for (int b = 0; b < array2.length; b++) {
			if (array2[b].equals(word)) {
				index2 = b;
			}
		}
		return index2;
	}

	//q3
	public static int findSecond(char[] array3, char character) {
		int index3 = -1;
		int count = 0;
		for (int c = 0; c < array3.length; c++) {
			if (array3[c] == character) {
				count++;
				index3 = c;
				if (count == 2) {
					return index3;
				}
			}
		}
		return index3;
	}

	

}
