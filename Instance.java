package GoogleHashCode2018;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Instance {
	String file;
	int row, col, f, nbCourses, bonus, steps;
	PriorityQueue<Course> courses;
	
	/**
	 * Constructeur à partir d'un fichier d'input d'une instance du challenge
	 * @param file
	 */
	public Instance(String file) {
		try {
		BufferedReader br = new BufferedReader(new FileReader("src/GoogleHashCode2018/data/"+file));
		this.file = file;
		try {
		    String line = br.readLine();
		    
		    // Lecture de la première ligne
		    String[] data = line.split(" ");
		    this.row = Integer.parseInt(data[0]);
		    this.col = Integer.parseInt(data[1]);
		    this.f = Integer.parseInt(data[2]);
		    this.nbCourses = Integer.parseInt(data[3]);
		    this.bonus = Integer.parseInt(data[4]);
		    this.steps = Integer.parseInt(data[5]);
		    
		    // on crée les listes des courses
		    PriorityQueue<Course> courses = new PriorityQueue<Course>();
		    
		    // on passe aux lignes suivantes
		    line = br.readLine();
		    int index = 0;
		    while (line != null) {
		    	// On trie nos courses globalement
		    	courses.add(new Course(index, line));
		    	
		    	// Passer à la ligne suivante
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
	
	/**
	 * Ecrit l'output correspondant aux courses effectuées
	 * @param tas des voitures
	 */
	public void output(PriorityQueue<Voiture> voitures, String outputfile) {
		PrintWriter writer;
		try {
			writer = new PrintWriter("src/GoogleHashCode2018/data/output/"+outputfile, "UTF-8");
			Iterator<Voiture> it = voitures.iterator();
			while (it.hasNext()) {
				Voiture voit = it.next();
				writer.println(voit.nbreCourses+" "+voit.coursesEffectuees);
			}
			writer.close();
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
