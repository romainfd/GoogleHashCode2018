package GoogleHashCode2018;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class test {

	public static void main(String[] args) {
		String[] inputs = new String[] {"a_example.in", "b_should_be_easy.in", "c_no_hurry.in", "d_metropolis.in", "e_high_bonus.in"};
		Course c = new Course(0, "0 0 1 3 2 9");
		System.out.println(c);
		System.out.println(c.debut);
		System.out.println(c.debut.x);
		
		for (int j = 0; j < 5; j++) {
			
			int currentTime = 0;
			Instance ins = new Instance(inputs[j]);
			PriorityQueue<Course> courses=ins.courses;
			LinkedList<Voiture> voitures= new LinkedList<Voiture>();
			
			for(int i=0;i<ins.f;i++){
				voitures.add(new Voiture());
			}
			
			Course c1;
			Voiture v1;
			int d;
			while (!courses.isEmpty()){
				d=ins.col+ins.row;
				c1=courses.poll();
				v1=null;
				for (Voiture v:voitures){
					if (v.isCourse(c1)==2 && v.getDist(c1)<d){
						v1=v;
						d=v.getDist(c1);
					}
				}
				if (v1==null){
					for (Voiture v:voitures){
						if (v.isCourse(c1)==1 && v.getDist(c1)<d){
							v1=v;
							d=v.getDist(c1);
						}
					}
				}
				if (v1!=null){
					v1.newCourse(c1);
				}
			}
			
			ins.output(voitures);
		}

	}

}
