import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReverseInPlace2(){
    int[] input2 = { 9, 8, 7, 6};
  ArrayExamples.reverseInPlace(input2);
  assertArrayEquals(new int[]{ 6, 7, 8, 9}, input2);
  }
    


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2(){
    int[] input2 = {5, 6, 7, 8};
    assertArrayEquals(new int[] {8, 7, 6, 5}, ArrayExamples.reversed (input2));
  }
}
