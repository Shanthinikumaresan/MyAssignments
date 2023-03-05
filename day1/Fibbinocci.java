package week1.day1;

public class Fibbinocci {
		public static void main(String[] args) {
			int n=11;
			int firstnum=0;
			int secondnum=1;
			int sum=0;
					
			for (int i=1; i<=n; i++) {
				System.out.println(firstnum);
				sum=firstnum+secondnum;
				firstnum=secondnum;
				secondnum=sum;
					
				
			}
		}
}
