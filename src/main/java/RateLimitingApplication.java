public class RateLimitingApplication {

  public static void main(String[] args) {
    // This program demonstrate a leaky bucket algoriothm
    // create a bucket for user
    BucketMaster bucketMaster = new BucketMaster();
    User user = new User("aXTr45Ta", 1, 5 );
    bucketMaster.createUserBucket(user);

    test(bucketMaster, user);
  }

  private static void test(BucketMaster bucketMaster, User user){
    System.out.println(bucketMaster.getUserBucket(user).isAllowed(1));
    System.out.println(bucketMaster.getUserBucket(user).isAllowed(1));
    System.out.println(bucketMaster.getUserBucket(user).isAllowed(1));
    System.out.println(bucketMaster.getUserBucket(user).isAllowed(1));
    System.out.println(bucketMaster.getUserBucket(user).isAllowed(1));
    System.out.println(bucketMaster.getUserBucket(user).isAllowed(1));
    System.out.println(bucketMaster.getUserBucket(user).isAllowed(2));
  }
}
