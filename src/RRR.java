class RRR {
    public static void main(String[] args) {

        Double CEB000215[] = {172284.0, 52472.0, 101745.0, 172284.0, 172284.0, 172284.0, 172284.0,
                172284.0, 172284.0, 172284.0, 172284.0, 171406.0, 156600.0, 156600.0, 156610.0, 156600.0, 153959.0, 161101.0};
        Double CEB000213[] = {144734.4, 143072.78, 127676.5, 127262.94, 305584.83, 49811.0};
        Double Alldigits[] = {142372.07, 10229.31, 141199.04, 140380.1, 149747.16, 150845.84,
                131371.76, 132981.03, 158261.54, 139954.63, 137291.05, 93189.6, 44173.47};
        double sum = 2438386.73;
        Double[] resultArray = new Double[Alldigits.length];
        double sumCEB000215 = 0.0;
        double sumCEB000213 = 0.0;
        int i = 0;

        while (sumCEB000215 <= 1417649.00 && sumCEB000213 <= 498150.00 && i < Alldigits.length) {
            if (sum + CEB000215[i] <= 1417649.00) {
                resultArray[i] = CEB000215[i];
                sum += CEB000215[i];
                sumCEB000215 += CEB000215[i];
            } else if (sum + CEB000213[i] <= 498150.00) {
                resultArray[i] = CEB000213[i];
                sum += CEB000213[i];
                sumCEB000213 += CEB000213[i];
            } else {
                resultArray[i] = Alldigits[i];
                sum += Alldigits[i];
            }
            i++;
        }
        System.out.println(sum);
    }
}
