/*
 A string is simply an ordered collection of symbols selected from some alphabet and formed into a word;
 the length of a string is the number of symbols that it contains.
An example of a length 21 DNA string (whose alphabet contains the symbols 'A', 'C', 'G', and 'T') is "ATGCTTCAGAAAGGTCTTACG."

Given: A DNA string s of length at most 1000 nt.

Return: Four integers (separated by spaces) counting the respective number of times that the symbols 'A', 'C', 'G', and 'T' occur in s.

Sample Dataset

AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC

Sample Output

20 12 17 21
*/

package letter;

public class LetterCount {
	public static void FoundLetter(String s) {
		int a,c,g,t;
		a = c = g = t = 0;
		
		  for(int i = 0; i < s.length(); i++)
		  {
			  if(s.charAt(i) == 'A')
				  a++;
			  else if (s.charAt(i) == 'C')
				  c++;
			  else if (s.charAt(i) == 'G')
				  g++;
			  else if (s.charAt(i) == 'T')
				  t++;
		  }
		  System.out.println("A = "+ a +" " + "C = "+ c +" " + "G = "+ g +" " + "T = "+ t);
		  
		}

	  public static void main( String[] args ) {
		String s="AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC";
		FoundLetter(s);
	  }
	  }
