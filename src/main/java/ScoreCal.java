
public class ScoreCal {

	public int Score(int list[]) {
		int id = list[0];
		int gpa = list[1];
		int mid = list[2];
		int fin = list[3];
		int quiz = list[4];
		int att = list[5];
		idtest(list[0]);
		gpatest(list[1]); 
		midtest(list[2]);
		fintest(list[3]);
		quiztest(list[4]);
		atttest(list[5]);
		String result = "";
		String attr = "";
		double sum01;
		System.out.println("\n學號\t平時\t期中\t期末\t小考\t總分"); 
		sum01=(gpa* 0.2) + (mid* 0.3) + (fin* 0.3) + (quiz* 0.2) ; 
		int sum = (int)sum01;
		assert(sum <= 100);
		leveltest(sum);
		if (att == 0) {
			attrtest(att);
		}
		if(att == 1) {
			sum = sum + 5;
			attrtest(att);
			if(sum > 100) {
				sum = 100;
			}
		}
		System.out.println(id +"\t" + gpa + "\t" + mid +"\t" + fin +"\t" + quiz +"\t" + sum); 
		System.out.println("_____________________________________________________"); 
		
		return sum ;
	}
	public int idtest(int id) {
		try
		{
		  if(id <= 0 || id >= 10000)
		  throw new ArithmeticException();
		  else
		  return id;
		}
		catch(ArithmeticException e)
		{
		  System.out.println(e+" 被拋出");
		}
		return id;
	}
	public int gpatest(int gpa) {
		try
		{
		  if(gpa < 0 || gpa > 100)
		  throw new ArithmeticException();
		  else
		  return gpa;
		}
		catch(ArithmeticException e)
		{
		  System.out.println(e+" 被拋出");
		}
		return gpa;
	}
	public int midtest(int mid) {
		try
		{
		  if(mid < 0 || mid > 100)
		  throw new ArithmeticException();
		  else
		  return mid;
		}
		catch(ArithmeticException e)
		{
		  System.out.println(e+" 被拋出");
		}
		return mid;
	}
	public int fintest(int fin) {
		try
		{
		  if(fin < 0 || fin > 100)
		  throw new ArithmeticException();
		  else
		  return fin;
		}
		catch(ArithmeticException e)
		{
		  System.out.println(e+" 被拋出");
		}
		return fin;
	}
	public int quiztest(int quiz) {
		try
		{
		  if(quiz < 0 || quiz > 100)
		  throw new ArithmeticException();
		  else
		  return quiz;
		}
		catch(ArithmeticException e)
		{
		  System.out.println(e+" 被拋出");
		}
		return quiz;
	}
	public int atttest(int att) {
		try
		{
		  if(att < 0 || att > 1)
		  throw new ArithmeticException();
		  else
		  return att;
		}
		catch(ArithmeticException e)
		{
		  System.out.println(e+" 被拋出");
		}
		return att;
	}
	public String leveltest(int sum) {
		String result = "";
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
		return result;
	}
	public String attrtest(int att) {
		String attr = "";
		try
		{
		  if(att < 0 || att > 1)
		  throw new ArithmeticException();
		}
		catch(ArithmeticException e)
		{
		  System.out.println(e+" 被拋出");
		}
		if(att == 0) {
			attr = "否";
		}
		if(att == 1) {
			attr = "是";
		}
		
		return attr;
	}

}