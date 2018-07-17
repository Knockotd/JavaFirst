package test2;

public class TestInstance {
public void findcodon(String acgtSequence, String codon) {
	char[]acgt=new char[acgtSequence.length()];
	char[]cod=new char[codon.length()];
	
	for(int i=0; i<acgtSequence.length(); i=i+1) {
		acgt[i]=acgtSequence.charAt(i);
		cod[i]=codon.charAt(i);
	}
	String sum=null;
	for(int i=0; i<acgtSequence.length(); i=i+1) {
	if(acgt[i] == cod[i%codon.length()]) {
		for(int j=0; j<codon.length(); j++ ) {
		sum = sum + acgt[j];
		
		}
		if(sum == codon) {
			System.out.println(i);
		}
		i=i+codon.length();
	}
	}
	}
}
