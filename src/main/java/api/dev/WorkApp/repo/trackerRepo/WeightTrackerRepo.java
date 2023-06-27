package api.dev.WorkApp.repo.trackerRepo;

import api.dev.WorkApp.model.trackers.WeightTracker;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WeightTrackerRepo extends MongoRepository<WeightTracker, String> {

    public default WeightTracker updatePreviousWeights(String uid){
        // Need to get weightTracker, then add the current Weight to previous weight, then check target weight, if exceeds
        //then need to clear target weight, if not just add current and date to previousweights and store in db.
    }

}
