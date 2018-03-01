package GoogleHashCode2018;

public class Course implements Comparable {
	int id;
	PosTps debut, fin;
	
	/**
	 * Constructeur
	 * @param id
	 * @param debut
	 * @param fin
	 */
	public Course(int id, PosTps debut, PosTps fin) {
		this.id = id;
		this.debut = debut;
		this.fin = fin;
	}
	
	/**
	 * Constructeur depuis une ligne d'input
	 * @param str
	 */
	public Course(int id, String str) {
		String[] data = str.split(" ");
		this.id = id;
		this.debut = new PosTps(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2]));
		this.fin = new PosTps(Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]));		
	}
	
	public String toString() {
		return "--- Course n°"+id+" ---\nDebut en "+debut+"\nFin en "+fin;
	}

	@Override
	public int compareTo(Object arg0) {

		return 0;
	}
}
