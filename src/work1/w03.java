package work1;

public class w03 {

    public static void main(String[] args) {
        // 定義總秒數
        int totalSeconds = 256559;

        // 計算天數
        int days = totalSeconds / (24 * 3600);
        // 計算剩餘秒數
        int remainingSecondsAfterDays = totalSeconds % (24 * 3600);

        // 計算小時數
        int hours = remainingSecondsAfterDays / 3600;
        // 計算剩餘秒數
        int remainingSecondsAfterHours = remainingSecondsAfterDays % 3600;

        // 計算分鐘數
        int minutes = remainingSecondsAfterHours / 60;
        // 計算剩餘秒數
        int seconds = remainingSecondsAfterHours % 60;

        // 輸出結果
        System.out.println(totalSeconds + " 秒等於 " + days + " 天 " + hours + " 小時 " + minutes + " 分 " + seconds + " 秒");
    }
}