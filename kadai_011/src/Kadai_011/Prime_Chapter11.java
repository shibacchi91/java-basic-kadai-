package Kadai_011;

public class Prime_Chapter11 {
	public static void main(String[] args) {

		boolean[] PrimeNumber = new boolean[101];
		for(int i = 0; i < PrimeNumber.length ; i++) {
			PrimeNumber[i] = true;
		}

		int judge = 2;
		while(judge < PrimeNumber.length) {
			for(int i = judge + 1; i < PrimeNumber.length; ++i) {
				if(i % judge == 0) {
					PrimeNumber[i] = false;
					continue;
				}
			}
			
			judge++;
			
		}
		
		for(int i = 2; i < PrimeNumber.length; i++) {
			if(PrimeNumber[i]) {
				System.out.println(i);
			}
		}

	}

}
