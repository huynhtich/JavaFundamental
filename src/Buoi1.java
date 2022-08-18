import java.util.Scanner;

public class Buoi1 {
    public static void main(String[] agrs)
    {
        //Tính BMI của một người
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập chiều cao: ");
        double height = scanner.nextDouble();
        System.out.print("Nhập cân nặng: ");
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
