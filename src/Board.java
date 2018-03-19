

public class Board {

	Piece[][] board;

	public Board() {
		board = new Piece[8][8];

	}

	public void setUpBoard() {

		//Setting up Black side of the game
		this.board[1][0] = new Pawn(new Location(1,0), new Colour(Colour.Type.Black), new Player());
		this.board[1][1] = new Pawn(new Location(1,1), new Colour(Colour.Type.Black), new Player());
		this.board[1][2] = new Pawn(new Location(1,2), new Colour(Colour.Type.Black), new Player());
		this.board[1][3] = new Pawn(new Location(1,3), new Colour(Colour.Type.Black), new Player());
		this.board[1][4] = new Pawn(new Location(1,4), new Colour(Colour.Type.Black), new Player());
		this.board[1][5] = new Pawn(new Location(1,5), new Colour(Colour.Type.Black), new Player());
		this.board[1][6] = new Pawn(new Location(1,6), new Colour(Colour.Type.Black), new Player());
		this.board[1][7] = new Pawn(new Location(1,7), new Colour(Colour.Type.Black), new Player());

		//Setting up white side of the game
		this.board[6][0] = new Pawn(new Location(6,0), new Colour(Colour.Type.White), new Player());
		this.board[6][1] = new Pawn(new Location(6,1), new Colour(Colour.Type.White), new Player());
		this.board[6][2] = new Pawn(new Location(6,2), new Colour(Colour.Type.White), new Player());
		this.board[6][3] = new Pawn(new Location(6,3), new Colour(Colour.Type.White), new Player());
		this.board[6][4] = new Pawn(new Location(6,4), new Colour(Colour.Type.White), new Player());
		this.board[6][5] = new Pawn(new Location(6,5), new Colour(Colour.Type.White), new Player());
		this.board[6][6] = new Pawn(new Location(6,6), new Colour(Colour.Type.White), new Player());
		this.board[6][7] = new Pawn(new Location(6,7), new Colour(Colour.Type.White), new Player());


	}

}
