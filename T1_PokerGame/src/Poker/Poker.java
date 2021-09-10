package Poker;

public class Poker {
	// Precondition: A hand of n cards have been sorted by card number.
	public boolean isFullHouse(String cards[], int n) {
		return isThreeOfaKind(cards, n) && isTwoPairs(cards, n);
	}

	// Precondition: A hand of n cards have been sorted by card number.
	public boolean isThreeOfaKind(String cards[], int n) {
		Boolean b=false;
		for(int i=0;i<n;i++) {
			char c=cards[i].charAt(1);
			int count=0;
			for(int j=0;j<n;j++) {
				if(cards[j].charAt(1)==c) {
					count++;
				}
			}
			if(count==3) {
				b=true;
			}
		}
		return b;
	}

	// Precondition: A hand of n cards have been sorted by card number.
	public boolean isTwoPairs(String cards[], int n) {
		int count = 0;
		for (int i=0; i<n-1; i++) {
			if (cards[i].charAt(1) == cards[i+1].charAt(1)) {
				count++;
				i++;
			}
		}
		if (count == 2)
			return true;
		else
			return false;
	}
	
	public static void main(String args[]) {
		System.out.println(new Poker().isFullHouse(
			new String[] {"C2", "D2", "H2", "S3", "D3"}, 5));
	}
}
// end of Poker.java
