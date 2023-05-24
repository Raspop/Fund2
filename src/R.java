import java.math.BigDecimal;
import java.util.ArrayList;

    class Test {
        public static void main(String[] args) {
            Double CEB000215 [] = {172284.0, 52472.0, 101745.0, 172284.0, 172284.0, 172284.0, 172284.0,
                    172284.0, 172284.0, 172284.0, 172284.0, 171406.0, 156600.0, 156600.0, 156610.0, 156600.0, 153959.0, 161101.0};
            Double CEB000213 [] = {144734.4, 143072.78, 127676.5, 127262.94, 305584.83, 49811.0};
            Double[] arr = {142372.07, 10229.31, 141199.04, 140380.1, 149747.16, 150845.84,
                    131371.76, 132981.03, 158261.54, 139954.63, 137291.05, 93189.6, 44173.47, 144734.4,
                    143072.78, 127676.5, 127262.94, 305584.83, 49811.0, 172284.0, 52472.0, 101745.0, 172284.0, 172284.0, 172284.0,
                    172284.0, 172284.0, 172284.0, 172284.0, 172284.0, 171406.0, 156600.0, 156600.0, 156610.0, 156600.0, 153959.0, 161101.0};

            ArrayList<Double> result = new ArrayList<>();
            combinations(arr, 0, 0.0, result);
            for (double x : result){
                System.out.println(x);
            }

        }

        public static void combinations(Double[] arr, int index, Double sum, ArrayList<Double> result) {
            if (index == arr.length) {
                if (!result.contains(sum)) {
                    result.add(sum);
                    return;
                }
            }
            combinations(arr, index + 1, sum + arr[index], result); // добавляем текущее число
            combinations(arr, index + 1, sum, result); // пропускаем текущее число
        }
    }
