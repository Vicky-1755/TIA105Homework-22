package work1;

public class w05 {

	public static void main(String[] args) {
		// 定義初始本金、利率和時間
		double principal = 1500000; // 本金 150 萬
		double rate = 0.02; // 年利率 2%
		int years = 10; // 存款時間 10 年

		// 計算複利
		double amount = principal * Math.pow(1 + rate, years);

		// 輸出結果
		System.out.println("10 年後，本金加利息共有: " + amount);
	}
}
