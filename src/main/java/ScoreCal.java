
public class ScoreCal {

	public int Score(int list[]) {
		int id = list[0];
		int gpa = list[1];
		int mid = list[2];
		int fin = list[3];
		int quiz = list[4];
		int att = list[5];
		String result = "";
		String attr = "";
		assert(gpa >= 0 && gpa <= 100);
		assert(mid >= 0 && mid <= 100);
		assert(fin >= 0 && fin <= 100);
		assert(quiz >= 0 && quiz <= 100);
		assert(att == 0 || att == 1);
		assert(id != 0);
		double sum01;
		System.out.println("\n�Ǹ�\t����\t����\t����\t�p��\t����\t�`��\t����"); 
		sum01=(gpa* 0.2) + (mid* 0.3) + (fin* 0.3) + (quiz* 0.2) ; 
		int sum = (int)sum01;
		if (att == 0) {
			attr = "�_";
		}
		if(att == 1) {
			sum = sum + 5;
			attr = "�O";
			if(sum > 100) {
				sum = 100;
			}
		}
		assert(sum <= 100);
		if(sum >= 0 && sum < 60) {
			result = "F";		
		}
		if(sum >= 60 && sum <70) {
			result = "D";		
		}
		if(sum >= 70 && sum < 80) {
			result = "C";		
		}
		if(sum >= 80 && sum < 90) {
			result = "B";		
		}
		if(sum >= 90 && sum < 100) {
			result = "A";		
		}
		if(sum == 100) {
			result = "S";		
		}
		System.out.println(id +"\t" + gpa + "\t" + mid +"\t" + fin +"\t" + quiz +"\t" + attr +"\t" + sum +"\t" + result); 
		System.out.println("_____________________________________________________"); 
		
		return sum ;
		
	}
}