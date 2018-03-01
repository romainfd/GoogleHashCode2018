package GoogleHashCode2018;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Instance {
	String file;
	int row, col, f, nbCourses, bonus, steps;
	PriorityQueue<Course> courses;
	
	/**
	 * Constructeur � partir d'un fichier d'input d'une instance du challenge
	 * @param file
	 */
	public Instance(String file) {
		try {
		BufferedReader br = new BufferedReader(new FileReader("src/GoogleHashCode2018/data/"+file));
		this.file = file;
		try {
			String ligne1;
		    String line = br.readLine();
		    
		    // Lecture de la premi�re ligne
		    String[] data = line.split(" ");
		    this.row = Integer.parseInt(data[0]);
		    this.col = Integer.parseInt(data[1]);
		    this.f = Integer.parseInt(data[2]);
		    this.nbCourses = Integer.parseInt(data[3]);
		    this.bonus = Integer.parseInt(data[4]);
		    this.steps = Integer.parseInt(data[5]);
		    
		    // on cr�e les listes des courses
		    PriorityQueue<Course> courses = new PriorityQueue<Course>();
		    
		    // on passe aux lignes suivantes
		    line = br.readLine();
		    int index = 0;
		    while (line != null) {
		    	// On trie nos courses globalement
		    	courses.add(new Course(index, line));
		    	
		    	// Passer � la ligne suivante
		        line = br.readLine();
		        index++;
		    }
		    // on affecte les courses
		    this.courses = courses;
		} finally {
		    br.close();
		}
		} catch (Exception e){
			System.out.println("Erreur de lecture d'input");
		}
	}
	
	@Override
	public String toString() {
		String str = "-------- Instance "+file+" --------\n";
		Iterator<Course> it = this.courses.iterator();
		while (it.hasNext()) {
			str += it.next()+"\n";
		}
		return str;
	}
	
	public static void main(String[] args) {
		Instance ins = new Instance("a_example.in");
		System.out.println(ins);
	}
}
