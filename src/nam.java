import java.util.Scanner;

public class nam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;

        System.out.println("Enter a year: ");
        year = sc.nextInt();

        if (year % 4 == 0){
            if (year % 100 == 0){
               if (year % 400 == 0){
                   System.out.printf("%d là năm nhuận", year);
               }else {
                   System.out.printf("%d không phải là năm nhuận", year);
               }
            }else {
                System.out.printf("% là năm nhuận");
            }
        }
        else {
            System.out.printf("%d không phải là năm nhuận", year);
        }
    }
}
