public class StringClass {
	
	// 1.way to how to do it
	public static boolean isPalindrom(String str) {
		int i=0;
		int j=str.length()-1;
		
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
		}
	
	// 2.way to how to do it
	public static boolean isPalindrom2(String str) {
		
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--) {
			reverse =reverse+str.charAt(i);
		}
		
		
		return str.equals(reverse);
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 System.out.println(isPalindrom("one"));
		
	System.out.println(isPalindrom2("121"));	
		
		
	}

}
