package work1;

public class w04 {

    public static void main(String[] args) {
        // 定義圓周率常數
        final double PI = 3.1415;
        
        // 定義半徑
        double radius = 5;

        // 計算圓面積 (Area = π * r^2)
        double area = PI * radius * radius;

        // 計算圓周長 (Circumference = 2 * π * r)
        double circumference = 2 * PI * radius;

        // 輸出結果
        System.out.println("圓的半徑: " + radius);
        System.out.println("圓的面積: " + area);
        System.out.println("圓的圓周長: " + circumference);
    }
}