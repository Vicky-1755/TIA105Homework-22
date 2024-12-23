package work1;

public class w06 {

	public static void main(String[] args) {
		// 計算 5 + 5
		System.out.println(5 + 5); // 結果是 10，因為兩者都是整數，進行數值加法運算

		// 計算 5 + '5'
		System.out.println(5 + '5'); // 結果是 58，'5' 會被轉換為其 ASCII 值 53，再加上 5 變成 58

		// 計算 5 + "5"
		System.out.println(5 + "5"); // 結果是 "55"，因為數字 5 和字串 "5" 相加時，數字會被轉換為字串，進行字串串接
	}
}