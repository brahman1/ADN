package data;

/**
 * Unit of construction uses for the messenger RNA, the DNA strand and the amino acid.
 * There is 4 different types of nucleotide (5 in total): Adenine, Cytosine, Guanine, Thymine
 * and the special Uracil (for RNA)
 * 
 * @author Lo&iuml;c Tramis
 * @version 1.0
 *
 */
public abstract class Nucleotide implements Molecule{
	private Molecule name;
	private Molecule complementaryBasis;
	private char letter;
	private Bond bond;
	
	/**
	 * Initialize the object. By default, the bond is null.
	 * 
	 * @param name the name of the nucleotide
	 * @param letter the letter of the nucleotide
	 * @param complementaryBasis the complementary of the nucleotide
	 */
	public Nucleotide(Molecule name, Molecule complementaryBasis, char letter) {
		this.name = name;
		this.letter = letter;
		this.complementaryBasis = complementaryBasis;
		this.bond = null;
	}

	/**
	 * @return the name
	 */
	// Concrete method
	public Molecule getName() {
		return name;
	}
	
	/**
	 * @return the complementaryBasis
	 */
	// Concrete method
	public Molecule getComplementaryBasis() {
		return complementaryBasis;
	}	

	/**
	 * @return the letter
	 */
	public char getLetter() {
		return letter;
	}
	
	/**
	 * @return the bond
	 */
	public Bond getBond() {
		return bond;
	}

	/**
	 * @param bond the bond to set
	 */
	public void setBond(Bond bond) {
		this.bond = bond;
	}

	// Hook method
	@Override
	public String toString() {
		return name + ", lettre : " + letter + ", complémentaire" + complementaryBasis + ", lien :" + bond;
	}	
}