import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class Pract2ChatGPT {
    public static void main(String[] args) {
        double[] arr = new double[]{142372.07, 10229.31, 141199.04, 140380.1};
//                , 149747.16, 150845.84,
//                131371.76, 132981.03, 158261.54, 139954.63, 137291.05, 93189.6, 44173.47, 144734.4,
//                143072.78, 127676.5, 127262.94, 305584.83, 49811.0, 172284.0, 52472.0, 101745.0, 172284.0, 172284.0, 172284.0,
//                172284.0, 172284.0, 172284.0, 172284.0, 172284.0, 171406.0, 156600.0, 156600.0, 156610.0, 156600.0, 153959.0, 161101.0};
        List<Double> sums = getSumCombinations(arr);
        System.out.println(sums);
    }

        Double CEB000215 [] = {172284.0, 52472.0, 101745.0, 172284.0, 172284.0, 172284.0, 172284.0,
                172284.0, 172284.0, 172284.0, 172284.0, 171406.0, 156600.0, 156600.0, 156610.0, 156600.0, 153959.0, 161101.0};
        Double CEB000213 [] = {144734.4, 143072.78, 127676.5, 127262.94, 305584.83, 49811.0};
        Double Alldigits [] = {142372.07, 10229.31, 141199.04, 140380.1, 149747.16, 150845.84,
                131371.76, 132981.03, 158261.54, 139954.63, 137291.05, 93189.6, 44173.47, 144734.4,
                143072.78, 127676.5, 127262.94, 305584.83, 49811.0, 172284.0, 52472.0, 101745.0, 172284.0, 172284.0, 172284.0,
                172284.0, 172284.0, 172284.0, 172284.0, 172284.0, 171406.0, 156600.0, 156600.0, 156610.0, 156600.0, 153959.0, 161101.0};

        public static double getArraySum(double[] arr) {
            double sum = 0;
            for (double i : arr) {
                sum += i;
            }
            return sum;
        }

        public static List<Double> getSumCombinations(double[] arr) {
           double goalSum = 2438386.73;
            List<Double> sums = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                double rez [] = getSubArray(arr, i);
//                if (getArraySum(rez) == goalSum){
//                    System.out.println(rez);
//                    break;
//                }
                List<Double> subSums = getSumCombinations(rez);
                for (int j = 0; j < subSums.size(); j++) {
                    double sum = subSums.get(j) + arr[i];
                    if (!sums.contains(sum)) {
                        sums.add(sum);

                    }
                }
            }
            sums.add(getArraySum(arr));
            return sums;
        }

        public static double[] getSubArray(double[] arr, int index) {
            double[] subArray = new double[arr.length - 1];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i != index) {
                    subArray[j] = arr[i];
                    j++;
                }
            }
            return subArray;
        }

    }







