import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Bucket {
  private int rateLimitingInterval;

  private  int capacity;
  private BlockingQueue<Integer> bucket;

  public Bucket(int capacity, int rateLimitingInterval) {
    this.bucket = new PriorityBlockingQueue<>();
    this.capacity = capacity;
    this.rateLimitingInterval = rateLimitingInterval;
  }

  // Remove all entries prior to (current timestamp - rate limiting ) interval
  public  void removeOldRequests(int currentTimeStamp) {
    while (!bucket.isEmpty() &&  bucket.peek() <= (currentTimeStamp - rateLimitingInterval)) {
      bucket.poll();
    }
  }

  // remove old entries
  //Check for a request is possible or not
  // If request is possible enqueue it
  public  boolean isAllowed(int currentTimeStamp){
      removeOldRequests(currentTimeStamp);
      if(bucket.size() < capacity ){
          bucket.add(currentTimeStamp);
          return true;
      }
      return false;
  }

}
