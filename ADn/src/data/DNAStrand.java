package data;

import java.util.ArrayList;

/**
 * 
 * @author Lo&iuml;c Tramis
 * @version 1.0
 *
 */
public class DNAStrand implements Molecule {
	private ArrayList<Molecule> nucleotides;

	public DNAStrand() {
		nucleotides = new ArrayList<Molecule>();
	}
	
	public Molecule getName() {
		return null;
	}
	
	public Molecule getComplementaryBasis() {
		// TBD here
		return null;
	}

	/**
	 * @return the variable that refers to the ArrayList object
	 */
	public ArrayList<Molecule> getDNAStrand() {
		return nucleotides;
	}
	
	
}