package data;

/**
 *  
 * @author Lo&iuml;c Tramis
 * @version 1.0
 *
 */
public class Bond {
	private String type;
	private Boolean state;
	
	public Bond(String type, Boolean state) {
		this.type = type;
		this.state = state;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the state
	 */
	public Boolean getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(Boolean state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Bond type : " + type + ", state : " + state;
	}
	
	
}