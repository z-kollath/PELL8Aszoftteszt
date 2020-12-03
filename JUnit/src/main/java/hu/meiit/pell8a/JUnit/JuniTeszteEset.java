package hu.meiit.pell8a.JUnit;

public class JuniTeszteEset {
	
	
	public int negyzet (int x) {
		return x*x;
		
	}		
	
	public int szamolA(String word) {
		int szamolas = 0;
		for(int i = 0; i < word.length(); i++) {
			 	if(word.charAt(i)=='a' || word.charAt(i)=='A') {
			 		szamolas++;
			 	}
			 	
		}
		return szamolas;	
	}
}