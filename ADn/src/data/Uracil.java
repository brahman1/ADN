package data;

/**
 * 
 * @author Lo&iuml;c Tramis
 * @version 1.0
 *
 */
public class Uracil extends Nucleotide {

	public Uracil(Molecule name, Molecule complementaryBasis, char letter, Bond bond) {
		super(name, complementaryBasis, letter);
		setBond(bond);
	}

}