package GoogleHashCode2018;

public class PosTps {
	int x, y, t;

	/**
	 * Constructeur
	 */
	public PosTps(int x, int y, int t) {
		this.x = x;
		this.y = y;
		this.t = t;
	}
	
	public String toString() {
		return "Point ("+x+";"+y+") au temps "+t;
	}
}
