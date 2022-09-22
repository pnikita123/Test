package junit;

public class JUniteEx1 {
	public int square(int a) {
		return a*a;
	}
	
	public int countA(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='i'||str.charAt(i)=='I') {
				count++;
			}
		}
		return count;
	}

}
