package GoogleHashCode2018;

public class Voiture {
	Course course_courante;
	int dispo;
	String course_effectuee;
	
	/** Constructeur
	 * 
	 */
	public Voiture() {
		this.course_courante=null;
		this.dispo=0;
	}
	
	/** ajoute une nouvelle course à la voiture
	 * 
	 * @param course
	 */
	public void newCourse(Course course) {
		int start=this.dispo+Math.abs(course.debut.x-this.course_courante.fin.x)+Math.abs(course.debut.y-this.course_courante.fin.y);
		this.course_courante=course;
		this.dispo=start+Math.abs(course.fin.x-course.debut.x)+Math.abs(course.fin.y-course.debut.y);		
		if (this.dispo<=course.fin.t) {
			course_effectuee=course_effectuee+course.id+"\n";
		}
	}
	

}
