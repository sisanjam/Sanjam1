package week4;

public class UnoCard {

	private int value;
	private String colors;
	private int attribute;

	public int getValue() {
		return this.value;
	}

	/**
	 * 
	 * @param value
	 */
	public void setValue(int value) {
		this.value = value;
	}

	public String getColors() {
		return this.colors;
	}

	/**
	 * 
	 * @param colors
	 */
	public void setColors(String colors) {
		this.colors = colors;
	}

	public void getAttribute() {
		// TODO - implement UnoCard.getAttribute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param attribute
	 */
	public void setAttribute(int attribute) {
		this.attribute = attribute;
	}

}