public class Job implements Comparable<Job> {
  public int start;
  public int end;

  public Job(int x, int y) {
    start = x;
    end = y;
  }

  @Override
  public int compareTo(Job o) {
    return this.end - o.end;
  }

  public boolean overlaps(Job other) {
    return (this.end > other.start && this.start < other.end)
        || (this.start < other.end && this.end > other.start);
  }
}
