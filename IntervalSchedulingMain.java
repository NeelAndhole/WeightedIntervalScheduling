import java.util.PriorityQueue;
import java.util.Scanner;

public class IntervalSchedulingMain {
  public static void main(String[] args) {
    runner();
  }

  /**
   * easier to call from Tester classes
   */
  public static void runner() {
    Scanner kb = new Scanner(System.in);
    int NumOfInstances = Integer.parseInt(kb.nextLine());
    for (int i = 0; i < NumOfInstances; i++) {
      int NumOfJobs = Integer.parseInt(kb.nextLine());
      PriorityQueue<Job> jobs = new PriorityQueue<Job>();
      for (int j = 0; j < NumOfJobs; j++) {
        String[] line = kb.nextLine().split(" ");

        jobs.add(new Job(Integer.parseInt(line[0]), Integer.parseInt(line[1])));

      }
      int counter = 1;
      Job curJob = jobs.remove();
      while (!jobs.isEmpty()) {
        if (curJob.overlaps(jobs.peek())) {
          jobs.remove();
        } else {
          counter++;
          curJob = jobs.remove();
        }
      }
      System.out.println(counter);
    } // end of the instance loop
    kb.close();
  }



}

