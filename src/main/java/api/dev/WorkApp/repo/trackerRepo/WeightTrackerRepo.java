package api.dev.WorkApp.repo.trackerRepo;

import api.dev.WorkApp.exceptions.EntityDoesNotExist;
import api.dev.WorkApp.model.trackers.WeightTracker;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface WeightTrackerRepo extends MongoRepository<WeightTracker, String> {

//    public default WeightTracker updatePreviousWeights(String uid) throws EntityDoesNotExist {
//        // Need to get weightTracker, then add the current Weight to previous weight, then check target weight, if exceeds
//        //then need to clear target weight, if not just add current and date to previousweights and store in db.
//        try{
//            Optional<WeightTracker> oldTracker = findById(uid);
//            if (oldTracker.isEmpty()){
//                throw new EntityDoesNotExist("UID does not have existing tracker");
//            }
//
//        }catch (Error err){
//            System.out.println(err);
//        }
//
//
//    }
    public default String createWeightTracker(String uid, String targetWeight){
        try{
            WeightTracker newTracker = new WeightTracker(uid,targetWeight);
            save(newTracker);
            return "Tracker Successfully Saved";
        }catch (Error e){
            System.out.println(e);
        }
        return "";
    }

}
