package GoogleHashCode2018;

public class Voiture implements Comparable {
	Course courseCourante;
	int dispo;
	String coursesEffectuees;
	int nbreCourses;
	
	/** Constructeur
	 * 
	 */
	public Voiture() {
		this.courseCourante=null;
		this.dispo=0;
	}
	
	/** ajoute une nouvelle course à la voiture
	 * 
	 * @param course
	 */
	public void newCourse(Course course) {
		int start=this.dispo+Math.abs(course.debut.x-this.courseCourante.fin.x)+Math.abs(course.debut.y-this.courseCourante.fin.y);
		this.courseCourante=course;
		this.dispo=start+Math.abs(course.fin.x-course.debut.x)+Math.abs(course.fin.y-course.debut.y);		
		if (this.dispo<=course.fin.t) {
			nbreCourses=nbreCourses+1;
			coursesEffectuees=coursesEffectuees+course.id+" ";
		}
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
