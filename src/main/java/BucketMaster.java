import java.util.HashMap;
import java.util.Map;

public class BucketMaster {
    private Map<User , Bucket > userBucketMap;

    public BucketMaster() {
        this.userBucketMap = new HashMap<>();
    }

    public void createUserBucket(User user ){
         if(userBucketMap.containsKey(user))
             return;
         userBucketMap.put(user , new Bucket(user.getNoOfRequests(), user.getRateLimitingInterval()));
    }

    public Bucket getUserBucket(User user){
        return userBucketMap.getOrDefault(user , null);
    }
}
