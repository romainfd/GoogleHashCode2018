package GoogleHashCode2018;

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
			PriorityQueue<Voiture> voitures= new PriorityQueue<Voiture>();
			
			for(int i=0;i<ins.f;i++){
				voitures.add(new Voiture());
			}
			
			Course c1;
			Voiture v1;
			while (!courses.isEmpty()){
				v1=voitures.poll();
				currentTime=v1.dispo;
				c1=courses.poll();
				v1.newCourse(c1);
				voitures.add(v1);
			}
			
			ins.output(voitures);
		}
	}

}
