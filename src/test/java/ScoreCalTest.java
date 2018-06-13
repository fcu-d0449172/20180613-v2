
import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ScoreCalTest {

	private ScoreCal a = new ScoreCal();

	@Test
	public void test() {
		assertEquals(0, a.Score(new int[] {123,0,0,0,0,0}));
		assertEquals(60, a.Score(new int[] {456,100,50,50,50,0}));
		assertEquals(19, a.Score(new int[] {147,99,0,0,0,0}));
//		兜Θ罿=0
		assertEquals(0, a.Score(new int[] {123,0,0,0,0,0}));
		assertEquals(40, a.Score(new int[] {123,0,50,50,50,0}));
		assertEquals(35, a.Score(new int[] {123,50,0,50,50,0}));
		assertEquals(35, a.Score(new int[] {123,50,50,0,50,0}));
		assertEquals(40, a.Score(new int[] {123,50,50,50,0,0}));
//		兜Θ罿=100	
		assertEquals(60, a.Score(new int[] {456,100,50,50,50,0}));
		assertEquals(65, a.Score(new int[] {456,50,100,50,50,0}));
		assertEquals(65, a.Score(new int[] {456,50,50,100,50,0}));
		assertEquals(60, a.Score(new int[] {456,50,50,50,100,0}));
//		对=1
		assertEquals(55, a.Score(new int[] {456,50,50,50,50,1}));
//		兜Θ罿=1
		assertEquals(0, a.Score(new int[] {789,1,0,0,0,0}));
		assertEquals(0, a.Score(new int[] {789,0,1,0,0,0}));
		assertEquals(0, a.Score(new int[] {789,0,0,1,0,0}));
		assertEquals(0, a.Score(new int[] {789,0,0,0,1,0}));
//		兜Θ罿=99
		assertEquals(19, a.Score(new int[] {147,99,0,0,0,0}));
		assertEquals(29, a.Score(new int[] {147,0,99,0,0,0}));
		assertEquals(29, a.Score(new int[] {147,0,0,99,0,0}));
		assertEquals(19, a.Score(new int[] {147,0,0,0,99,0}));
//		兜Θ罿=50
		assertEquals(10, a.Score(new int[] {258,50,0,0,0,0}));
		assertEquals(15, a.Score(new int[] {258,0,50,0,0,0}));
		assertEquals(15, a.Score(new int[] {258,0,0,50,0,0}));
		assertEquals(10, a.Score(new int[] {258,0,0,0,50,0}));
//		舦 >100 
		assertEquals(100, a.Score(new int[] {321,100,100,100,90,1}));
//		单F
		assertEquals(44, a.Score(new int[] {654,30,25,60,40,1}));
//		单D
		assertEquals(61, a.Score(new int[] {987,60,70,50,65,0}));
//		单C
		assertEquals(73, a.Score(new int[] {741,60,80,60,70,1}));
//		单B
		assertEquals(81, a.Score(new int[] {852,80,80,85,82,0}));
//		单A
		assertEquals(96, a.Score(new int[] {963,92,90,95,88,1}));
//		单S
		assertEquals(100, a.Score(new int[] {111,100,100,100,100,0}));
		
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
////	对=2
//	assertEquals(0, a.Score(new int[] {369,0,0,0,0,2}));
////	ID=0
//	assertEquals(80, a.Score(new int[] {0,90,80,70,60,1}));
		
	}
}