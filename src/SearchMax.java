public class SearchMax {
    private static int[] array = new int[]{3, 5, 9, 2, 4, 11, 78, 3, 89, 5, 7};

    public static void main(String[] args) {
        getMax(array);
    }

    public static int getMax(int[] array) {
        int maxValue = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                index = i;
            }
        }

        //System.out.println(maxValue + " : " + index);

        return index;
    }
}
