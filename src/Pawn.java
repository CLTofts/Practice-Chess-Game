
public class Pawn extends Piece{

	private Location location;
	private Colour colour;
	private Player player;

	public Pawn(Location location, Colour colour, Player player) {
		super(location, colour);
		this.player = player;
	}

	@Override
	void move(String newLocation) {
		// TODO Auto-generated method stub

	}

	@Override
	Location getLocation() {
		return location;
		// TODO Auto-generated method stub

	}



	@Override
	void setLocation(Location newLocation) {
		this.location = newLocation;
		// TODO Auto-generated method stub

	}

	@Override
	void setColour(Colour newColour) {
		this.colour = newColour;
		// TODO Auto-generated method stub

	}

	@Override
	Colour getColour() {
		return colour;
		// TODO Auto-generated method stub

	}

}
