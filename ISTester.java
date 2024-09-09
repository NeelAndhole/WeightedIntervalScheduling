import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ISTester {

  @Test
  public void OverlapsTester() {
    Job job1 = new Job(4, 7);
    Job job2 = new Job(5, 8);
    Job job3 = new Job(3, 5);
    Job job4 = new Job(2, 4);
    Assertions.assertTrue(job1.overlaps(job2));
    Assertions.assertTrue(job3.overlaps(job4));
    Assertions.assertFalse((new Job(1, 4)).overlaps(new Job(5, 8)));
  }

  @Test
  public void ExampleTester() {
    TextUITester tester = new TextUITester("2\n1\n1 4\n3\n1 2\n3 4\n2 6\n");
    IntervalSchedulingMain.runner();
    String output = tester.checkOutput();
    Assertions.assertEquals("1\n" + "2\n", output);
  }

  @Test
  public void MultipleWithSameStartAndEndTester() {
    TextUITester tester = new TextUITester(
        "1\n12\n1 4\n5 10\n12 16\n2 5\n6 10\n2 6\n8 12\n2 6\n8 12\n11 11\n12 12\n10 10\n");
    IntervalSchedulingMain.runner();
    String output = tester.checkOutput();

    Assertions.assertEquals("6\n", output);
  }

  @Test
  public void Test3Tester() {
    TextUITester tester = new TextUITester("1\n4\n1 3\n3 7\n7 12\n1 7\n");
    IntervalSchedulingMain.runner();
    String output = tester.checkOutput();
    Assertions.assertEquals("3\n", output);
  }


}
