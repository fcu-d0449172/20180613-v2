
import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ScoreCalTest {

	private ScoreCal a = new ScoreCal();

	@Test
	public void testall() {

//		兜Θ罿=0,薄0┪1
		assertEquals(40, a.Score(new int[] {123,0,50,50,50,0}));
		assertEquals(35, a.Score(new int[] {123,50,0,50,50,0}));
		assertEquals(35, a.Score(new int[] {123,50,50,0,50,0}));
		assertEquals(40, a.Score(new int[] {123,50,50,50,0,0}));
		
		assertEquals(45, a.Score(new int[] {123,0,50,50,50,1}));
		assertEquals(40, a.Score(new int[] {123,50,0,50,50,1}));
		assertEquals(40, a.Score(new int[] {123,50,50,0,50,1}));
		assertEquals(45, a.Score(new int[] {123,50,50,50,0,1}));
//		ㄢ兜Θ罿=0,薄0┪1
		assertEquals(25, a.Score(new int[] {123,0,0,50,50,0}));
		assertEquals(25, a.Score(new int[] {123,0,50,0,50,0}));
		assertEquals(30, a.Score(new int[] {123,0,50,50,0,0}));
		assertEquals(20, a.Score(new int[] {123,50,0,0,50,0}));
		assertEquals(25, a.Score(new int[] {123,50,0,50,0,0}));
		assertEquals(25, a.Score(new int[] {123,50,50,0,0,0}));
		
		assertEquals(30, a.Score(new int[] {123,0,0,50,50,1}));
		assertEquals(30, a.Score(new int[] {123,0,50,0,50,1}));
		assertEquals(35, a.Score(new int[] {123,0,50,50,0,1}));
		assertEquals(25, a.Score(new int[] {123,50,0,0,50,1}));
		assertEquals(30, a.Score(new int[] {123,50,0,50,0,1}));
		assertEquals(30, a.Score(new int[] {123,50,50,0,0,1}));
//		兜Θ罿=0,薄0┪1
		assertEquals(10, a.Score(new int[] {123,0,0,0,50,0}));
		assertEquals(15, a.Score(new int[] {123,0,0,50,0,0}));
		assertEquals(15, a.Score(new int[] {123,0,50,0,0,0}));
		assertEquals(10, a.Score(new int[] {123,50,0,0,0,0}));
		
		assertEquals(15, a.Score(new int[] {123,0,0,0,50,1}));
		assertEquals(20, a.Score(new int[] {123,0,0,50,0,1}));
		assertEquals(20, a.Score(new int[] {123,0,50,0,0,1}));
		assertEquals(15, a.Score(new int[] {123,50,0,0,0,1}));
//		场Θ罿0,薄0┪1
		assertEquals(0, a.Score(new int[] {123,0,0,0,0,0}));
		assertEquals(5, a.Score(new int[] {123,0,0,0,0,1}));
//		兜Θ罿=100,薄0┪1	
		assertEquals(60, a.Score(new int[] {123,100,50,50,50,0}));
		assertEquals(65, a.Score(new int[] {123,50,100,50,50,0}));
		assertEquals(65, a.Score(new int[] {123,50,50,100,50,0}));
		assertEquals(60, a.Score(new int[] {123,50,50,50,100,0}));
		
		assertEquals(65, a.Score(new int[] {123,100,50,50,50,1}));
		assertEquals(70, a.Score(new int[] {123,50,100,50,50,1}));
		assertEquals(70, a.Score(new int[] {123,50,50,100,50,1}));
		assertEquals(65, a.Score(new int[] {123,50,50,50,100,1}));
//		ㄢ兜Θ罿=100,薄0┪1	
		assertEquals(75, a.Score(new int[] {123,100,100,50,50,0}));
		assertEquals(75, a.Score(new int[] {123,100,50,100,50,0}));
		assertEquals(70, a.Score(new int[] {123,100,50,50,100,0}));
		assertEquals(80, a.Score(new int[] {123,50,100,100,50,0}));
		assertEquals(75, a.Score(new int[] {123,50,100,50,100,0}));
		assertEquals(75, a.Score(new int[] {123,50,50,100,100,0}));
		
		assertEquals(80, a.Score(new int[] {123,100,100,50,50,1}));
		assertEquals(80, a.Score(new int[] {123,100,50,100,50,1}));
		assertEquals(75, a.Score(new int[] {123,100,50,50,100,1}));
		assertEquals(85, a.Score(new int[] {123,50,100,100,50,1}));
		assertEquals(80, a.Score(new int[] {123,50,100,50,100,1}));
		assertEquals(80, a.Score(new int[] {123,50,50,100,100,1}));
//		兜Θ罿=100,薄0┪1	
		assertEquals(90, a.Score(new int[] {123,100,100,100,50,0}));
		assertEquals(85, a.Score(new int[] {123,100,100,50,100,0}));
		assertEquals(85, a.Score(new int[] {123,100,50,100,100,0}));
		assertEquals(90, a.Score(new int[] {123,50,100,100,100,0}));
		
		assertEquals(95, a.Score(new int[] {123,100,100,100,50,1}));
		assertEquals(90, a.Score(new int[] {123,100,100,50,100,1}));
		assertEquals(90, a.Score(new int[] {123,100,50,100,100,1}));
		assertEquals(95, a.Score(new int[] {123,50,100,100,100,1}));
//		场κ对0┪1
		assertEquals(100, a.Score(new int[] {123,100,100,100,100,0}));
		
		assertEquals(100, a.Score(new int[] {123,100,100,100,100,1}));
//		对=0┪1
		assertEquals(50, a.Score(new int[] {123,50,50,50,50,0}));
		assertEquals(55, a.Score(new int[] {123,50,50,50,50,1}));
//		兜Θ罿=1对0┪1
		assertEquals(40, a.Score(new int[] {123,1,50,50,50,0}));
		assertEquals(35, a.Score(new int[] {123,50,1,50,50,0}));
		assertEquals(35, a.Score(new int[] {123,50,50,1,50,0}));
		assertEquals(40, a.Score(new int[] {123,50,50,50,1,0}));
		
		assertEquals(45, a.Score(new int[] {123,1,50,50,50,1}));
		assertEquals(40, a.Score(new int[] {123,50,1,50,50,1}));
		assertEquals(40, a.Score(new int[] {123,50,50,1,50,1}));
		assertEquals(45, a.Score(new int[] {123,50,50,50,1,1}));
//		ㄢ兜Θ罿=1对0┪1
		assertEquals(25, a.Score(new int[] {123,1,1,50,50,0}));
		assertEquals(25, a.Score(new int[] {123,1,50,1,50,0}));
		assertEquals(30, a.Score(new int[] {123,1,50,50,1,0}));
		assertEquals(20, a.Score(new int[] {123,50,1,1,50,0}));
		assertEquals(25, a.Score(new int[] {123,50,1,50,1,0}));
		assertEquals(25, a.Score(new int[] {123,50,50,1,1,0}));
		
		assertEquals(30, a.Score(new int[] {123,1,1,50,50,1}));
		assertEquals(30, a.Score(new int[] {123,1,50,1,50,1}));
		assertEquals(35, a.Score(new int[] {123,1,50,50,1,1}));
		assertEquals(25, a.Score(new int[] {123,50,1,1,50,1}));
		assertEquals(30, a.Score(new int[] {123,50,1,50,1,1}));
		assertEquals(30, a.Score(new int[] {123,50,50,1,1,1}));
//		兜Θ罿=1对0┪1
		assertEquals(10, a.Score(new int[] {123,1,1,1,50,0}));
		assertEquals(15, a.Score(new int[] {123,1,1,50,1,0}));
		assertEquals(15, a.Score(new int[] {123,1,50,1,1,0}));
		assertEquals(10, a.Score(new int[] {123,50,1,1,1,0}));
		
		assertEquals(15, a.Score(new int[] {123,1,1,1,50,1}));
		assertEquals(20, a.Score(new int[] {123,1,1,50,1,1}));
		assertEquals(20, a.Score(new int[] {123,1,50,1,1,1}));
		assertEquals(15, a.Score(new int[] {123,50,1,1,1,1}));
//		场Θ罿1对0┪1
		assertEquals(1, a.Score(new int[] {123,1,1,1,1,0}));
		
		assertEquals(6, a.Score(new int[] {123,1,1,1,1,1}));
//		兜Θ罿=99对0┪1
		assertEquals(59, a.Score(new int[] {123,99,50,50,50,0}));
		assertEquals(64, a.Score(new int[] {123,50,99,50,50,0}));
		assertEquals(64, a.Score(new int[] {123,50,50,99,50,0}));
		assertEquals(59, a.Score(new int[] {123,50,50,50,99,0}));
		
		assertEquals(64, a.Score(new int[] {123,99,50,50,50,1}));
		assertEquals(69, a.Score(new int[] {123,50,99,50,50,1}));
		assertEquals(69, a.Score(new int[] {123,50,50,99,50,1}));
		assertEquals(64, a.Score(new int[] {123,50,50,50,99,1}));
//		ㄢ兜Θ罿=99对0┪1
		assertEquals(74, a.Score(new int[] {123,99,99,50,50,0}));
		assertEquals(74, a.Score(new int[] {123,99,50,99,50,0}));
		assertEquals(69, a.Score(new int[] {123,99,50,50,99,0}));
		assertEquals(79, a.Score(new int[] {123,50,99,99,50,0}));
		assertEquals(74, a.Score(new int[] {123,50,99,50,99,0}));
		assertEquals(74, a.Score(new int[] {123,50,50,99,99,0}));
		
		assertEquals(79, a.Score(new int[] {123,99,99,50,50,1}));
		assertEquals(79, a.Score(new int[] {123,99,50,99,50,1}));
		assertEquals(74, a.Score(new int[] {123,99,50,50,99,1}));
		assertEquals(84, a.Score(new int[] {123,50,99,99,50,1}));
		assertEquals(79, a.Score(new int[] {123,50,99,50,99,1}));
		assertEquals(79, a.Score(new int[] {123,50,50,99,99,1}));

//		兜Θ罿=99对0┪1
		assertEquals(89, a.Score(new int[] {123,99,99,99,50,0}));
		assertEquals(84, a.Score(new int[] {123,99,99,50,99,0}));
		assertEquals(84, a.Score(new int[] {123,99,50,99,99,0}));
		assertEquals(89, a.Score(new int[] {123,50,99,99,99,0}));
		
		assertEquals(94, a.Score(new int[] {123,99,99,99,50,1}));
		assertEquals(89, a.Score(new int[] {123,99,99,50,99,1}));
		assertEquals(89, a.Score(new int[] {123,99,50,99,99,1}));
		assertEquals(94, a.Score(new int[] {123,50,99,99,99,1}));

//		场Θ罿=99对0┪1
		assertEquals(99, a.Score(new int[] {123,99,99,99,99,0}));
		
		assertEquals(100, a.Score(new int[] {123,99,99,99,99,1}));
//		兜Θ罿=50对0┪1
		assertEquals(10, a.Score(new int[] {123,50,0,0,0,0}));
		assertEquals(15, a.Score(new int[] {123,0,50,0,0,0}));
		assertEquals(15, a.Score(new int[] {123,0,0,50,0,0}));
		assertEquals(10, a.Score(new int[] {123,0,0,0,50,0}));
		
		assertEquals(15, a.Score(new int[] {123,50,0,0,0,1}));
		assertEquals(20, a.Score(new int[] {123,0,50,0,0,1}));
		assertEquals(20, a.Score(new int[] {123,0,0,50,0,1}));
		assertEquals(15, a.Score(new int[] {123,0,0,0,50,1}));
//		舦 >100 
		assertEquals(100, a.Score(new int[] {123,100,100,100,100,1}));
//		单F
		assertEquals(44, a.Score(new int[] {123,30,25,60,40,1}));
//		单D
		assertEquals(61, a.Score(new int[] {123,60,70,50,65,0}));
//		单C
		assertEquals(73, a.Score(new int[] {123,60,80,60,70,1}));
//		单B
		assertEquals(81, a.Score(new int[] {123,80,80,85,82,0}));
//		单A
		assertEquals(96, a.Score(new int[] {123,92,90,95,88,1}));
//		单S
		assertEquals(100, a.Score(new int[] {123,100,100,100,100,0}));
//		对禬筁絛瞅
		assertEquals(100, a.Score(new int[] {123,100,100,100,100,2}));
		
		assertEquals(100, a.Score(new int[] {123,100,100,100,100,-1}));
		
////	兜Θ罿=-1
//	assertEquals(0, a.Score(new int[] {369,-1,0,0,0,0}));
//	assertEquals(0, a.Score(new int[] {369,0,-1,0,0,0}));
//	assertEquals(0, a.Score(new int[] {369,0,0,-1,0,0}));
//	assertEquals(0, a.Score(new int[] {369,0,0,0,-1,0}));
////	对=-1
//	assertEquals(0, a.Score(new int[] {369,0,0,0,0,-1}));
////	兜Θ罿=101
//	assertEquals(0, a.Score(new int[] {369,101,0,0,0,0}));
//	assertEquals(0, a.Score(new int[] {369,0,101,0,0,0}));
//	assertEquals(0, a.Score(new int[] {369,0,0,101,0,0}));
//	assertEquals(0, a.Score(new int[] {369,0,0,0,101,0}));
////	ID=10000
//	assertEquals(0, a.Score(new int[] {10000,90,80,70,60,0}));
////	ID=0
//	assertEquals(80, a.Score(new int[] {0	));
//		
	}
	@Test
	public void testid() { 
		assertEquals(0,a.idtest(0));
		assertEquals(1,a.idtest(1));
		assertEquals(2,a.idtest(2));
		assertEquals(9998,a.idtest(9998));
		assertEquals(9999,a.idtest(9999));
		assertEquals(10000,a.idtest(10000));
		assertEquals(500,a.idtest(500));

	}
	public void testgpa() { 
		assertEquals(-1,a.gpatest(-1));
		assertEquals(0,a.gpatest(0));
		assertEquals(1,a.gpatest(1));
		assertEquals(99,a.gpatest(99));
		assertEquals(100,a.gpatest(100));
		assertEquals(101,a.gpatest(101));
		assertEquals(50,a.gpatest(50));
		
	}
	public void testmid() { 
		assertEquals(-1,a.midtest(-1));
		assertEquals(0,a.midtest(0));
		assertEquals(1,a.midtest(1));
		assertEquals(99,a.midtest(99));
		assertEquals(100,a.midtest(100));
		assertEquals(101,a.midtest(101));
		assertEquals(50,a.midtest(50));
		
	}
	public void testfin() { 
		assertEquals(-1,a.fintest(-1));
		assertEquals(0,a.fintest(0));
		assertEquals(1,a.fintest(1));
		assertEquals(99,a.fintest(99));
		assertEquals(100,a.fintest(100));
		assertEquals(101,a.fintest(101));
		assertEquals(50,a.fintest(50));
		
	}
	public void testquiz() { 
		assertEquals(-1,a.quiztest(-1));
		assertEquals(0,a.quiztest(0));
		assertEquals(1,a.quiztest(1));
		assertEquals(99,a.quiztest(99));
		assertEquals(100,a.quiztest(100));
		assertEquals(101,a.quiztest(101));
		assertEquals(50,a.quiztest(50));
		
	}
	public void testatt() { 
		assertEquals(-1,a.atttest(-1));
		assertEquals(0,a.atttest(0));
		assertEquals(1,a.atttest(1));
		assertEquals(2,a.atttest(2));
		
	}
	
	public void testattr() { 
		assertEquals("",a.attrtest(-1));
		assertEquals("",a.attrtest(0));
		assertEquals("琌",a.attrtest(1));
		assertEquals("",a.attrtest(2));
	}
	
	public void testlevel() { 
		assertEquals("F",a.leveltest(0));
		assertEquals("F",a.leveltest(59));
		assertEquals("F",a.leveltest(1));
		assertEquals("F",a.leveltest(58));
		assertEquals("F",a.leveltest(30));
		assertEquals("",a.leveltest(-1));
		assertEquals("D",a.leveltest(60));
		
		assertEquals("D",a.leveltest(60));
		assertEquals("D",a.leveltest(69));
		assertEquals("D",a.leveltest(61));
		assertEquals("D",a.leveltest(68));
		assertEquals("D",a.leveltest(65));
		assertEquals("F",a.leveltest(59));
		assertEquals("C",a.leveltest(70));
		
		assertEquals("C",a.leveltest(70));
		assertEquals("C",a.leveltest(79));
		assertEquals("C",a.leveltest(71));
		assertEquals("C",a.leveltest(78));
		assertEquals("C",a.leveltest(75));
		assertEquals("D",a.leveltest(69));
		assertEquals("B",a.leveltest(80));
		
		assertEquals("B",a.leveltest(80));
		assertEquals("B",a.leveltest(89));
		assertEquals("B",a.leveltest(81));
		assertEquals("B",a.leveltest(88));
		assertEquals("B",a.leveltest(85));
		assertEquals("C",a.leveltest(79));
		assertEquals("A",a.leveltest(90));
		
		assertEquals("A",a.leveltest(90));
		assertEquals("A",a.leveltest(99));
		assertEquals("A",a.leveltest(91));
		assertEquals("A",a.leveltest(98));
		assertEquals("A",a.leveltest(95));
		assertEquals("B",a.leveltest(89));
		assertEquals("S",a.leveltest(100));
		
		assertEquals("S",a.leveltest(100));
		assertEquals("A",a.leveltest(99));
		assertEquals("",a.leveltest(101));
	}
	
}