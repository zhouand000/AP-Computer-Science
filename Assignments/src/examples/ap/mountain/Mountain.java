package examples.ap.mountain;

@SuppressWarnings("javadoc")
public class Mountain {
    
    public static void main (String[] args) {
	
	int[] array1 = {1,2,3,2,1};
	int[] array2 = {1,2,3,2,3,2,1};
	int[] array3 = {3,2,1,2};
	
	System.out.println(getPeakIndex(array1));
	System.out.println(getPeakIndex(array2));
	System.out.println(getPeakIndex(array3));
	System.out.println(isMountain(array1));
	System.out.println(isMountain(array2));
	System.out.println(isMountain(array3));
	
    }
    public static int getPeakIndex (int[] array) {
	if (array.length < 3) return -1;

	int index; 

	for (index = 1; index < array.length - 1; index++) {

	    if (array[index - 1] < array[index] && array[index] > array[index + 1])
		return index;

	}
	return -1;

    }

    public static boolean isMountain (int[] array) {

	if (array.length < 3) return false;

	int peak = -1;

	for (int i = 1; i < array.length; i++) {

	    if (array[i] < array[i - 1]) {
		peak = i;
		break;

	    }

	}

	if (peak == -1) return false;

	for (int i = peak + 1; i < array.length; i++) {

	    if (array[i] > array[i - 1]) return false;

	}

	return true;

    }
}
