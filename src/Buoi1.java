import java.util.Scanner;
import java.util.Arrays;


public class Buoi1 {
    public static void main(String[] agrs)
    {
//        for (int i = 10; i >=0 ; i--) {
//            System.out.println(i);
//        }

//        for (int i = 1; i <= 100; i++) {
//            if(i % 2 == 0) System.out.println(i);
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Mời bạn nhập số tự nhiên: ");
//        int number = scanner.nextInt();
//        if (isPrime(number)) {
//            System.out.println("Số " + number + " là số nguyên tố");
//        }
//        else {
//            System.out.println("Số " + number + " không phải là số nguyên tố");
//        }


//        int[] arrNumber = {2,3,4,5,6,10,1,20,30,15,16,17,18,21,22,23};
//        // Sắp xếp mảng theo thử tự tăng dần
//        Arrays.sort(arrNumber);
//        System.out.println("Mảng cars sau khi được sắp xếp:");
//        for (int num : arrNumber) {
//            System.out.println(num);
//        }
//        System.out.println("Số lớn nhất " + arrNumber[arrNumber.length - 1]);
//        for (int i = 0; i < arrNumber[arrNumber.length - 1]; i++) {
//            if(arrNumber[i] % 2 != 0)
//                System.out.println("Số nhỏ nhất " + arrNumber[i]);
//                return;
//        }

            int[] arrNumber = {2,3,4,5,6,10,1,20,30,15,16,17,18,21,22,23};
            int i = arrNumber.length - 1;

            while (i >= 0){
                System.out.println(arrNumber[i--]);
            }

    }
    public static boolean isPrime(int n) {
        if(n < 2) {
            return false;
        }
        if(n == 2) {
            return true;
        }
        for (int i = 2; i < n; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
    public  static  void examBMI() {
        //Tính BMI của một người
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập chiều cao: ");
        double height = scanner.nextDouble();
        System.out.print("Nhập cân nặng: ");
        System.out.println();
        double weight=  scanner.nextDouble();

        double bmi =  computeBmi(weight, height);

        String result;

        if (bmi <18.5)
        {
            result = "Phân loại: Gầy - Nguy cơ: Thấp";
        }
        else if ((bmi >= 18.5) && (bmi <= 24.9))
        {
            result = "Phân loại: Bình thường - Nguy cơ: Trung bình";
        }
        else if ((bmi >=25) && (bmi<=29.9))
        {
            result = "Phân loại: Hơi béo - Nguy cơ: Cao";

        }
        else if ((bmi >= 30) && (bmi <= 34.9))
        {
            result = "Phân loại: Béo phì cấp độ 1 - Nguy cơ: Cao";
        }
        else if ((bmi >= 35) && (bmi <= 39.9))
        {
            result = "Phân loại: Béo phì cấp độ 2 - Nguy cơ: Rất cao";
        }
        else
        {
            result = "Phân loại: Béo phì cấp độ 3 - Nguy cơ: Nguy hiểm";
        }

        System.out.println("Bạn " + name + " Có chỉ số BMI là: " + bmi);
        System.out.println(result);
    }
    public static double computeBmi(double weight, double height)
    {
        return weight/(height*height);
    }
}
