
public abstract class Piece {

	public Location location;
	public Colour colour;
	public


	/**
	 *
	 * @param location   the location of the piece on the board, stores the x and y coordinates
	 * @param colour	 the colour of the piece showing what team it is on
	 */

	 Piece(Location location, Colour colour) {
		this.location = location;
		this.colour = colour;
	}

	abstract void move(String newLocation);

	abstract void setLocation(Location newLocation);

	abstract Location getLocation();

	abstract void setColour(Colour newColour);

	abstract Colour getColour();
}
