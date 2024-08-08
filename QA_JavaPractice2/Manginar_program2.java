public class Manginar_program2 {
    public static void main(String[] args){
        int[] number = {-4, 3, -9, 0, 4, 1};
        double[] result = countnumber(number);

        System.out.printf("positive count: " + result[0]);
        System.out.printf("negative count: " + result[1]);
        System.out.printf("0 count: " + result[2]);
    }

    public static double[] countnumber(int[] number){
        int positive = 0;
        int negative = 0;
        int zerocount = 0;
        int totalcount = number.length;

        for (int angka : number){
            if (angka > 0){
                positive++;
            } else if (angka < 0) {
                negative++;
            }else {
                zerocount++;
            }
        }
        double positive2 = (double) positive / totalcount;
        double negative2 = (double) negative / totalcount;
        double zero = (double) zerocount / totalcount;

        return new double[]{positive2, negative2, zero};
    }
}
