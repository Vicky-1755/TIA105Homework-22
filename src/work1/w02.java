package work1;

public class w02 {
	
    public static void main(String[] args) {
        // 定義總蛋數和每打的數量
        int totalEggs = 200;
        int eggsPerDozen = 12;

        // 計算有幾打
        int dozens = totalEggs / eggsPerDozen;
        // 計算剩下幾顆
        int remainingEggs = totalEggs % eggsPerDozen;

        // 輸出結果
        System.out.println(totalEggs + " 顆蛋共是 " + dozens + " 打 " + remainingEggs + " 顆");
    }
}