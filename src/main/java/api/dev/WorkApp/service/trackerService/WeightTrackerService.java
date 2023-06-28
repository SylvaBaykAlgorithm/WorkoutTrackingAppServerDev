package api.dev.WorkApp.service.trackerService;

import api.dev.WorkApp.exceptions.EntityDoesNotExist;
import api.dev.WorkApp.model.trackers.WeightTracker;
import api.dev.WorkApp.repo.ClientUserRepository;
import api.dev.WorkApp.repo.trackerRepo.WeightTrackerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeightTrackerService {

    @Autowired
    WeightTrackerRepo weightTrackerRepo;

    @Autowired
    ClientUserRepository userRepository;


    public String createWeightTracker(String uid, String targetWeight){
        try{
            if(uid.isBlank() || targetWeight.isBlank()){
                return "";
            }
            String result = weightTrackerRepo.createWeightTracker(uid,targetWeight);
                return result;
        }catch (Error e){
            System.out.println(e);
        }
        return "";
    }
//    public WeightTracker getWeightTracker(String uid){
//
//    }
//    public String DeleteWeightTracker(String uid){
//
//    }

//    public WeightTracker updatePreviousWeights(String uid) throws EntityDoesNotExist {
////        // Need to get weightTracker, then add the current Weight to previous weight, then check target weight, if exceeds
////        //then need to clear target weight, if not just add current and date to previousweights and store in db.
//        try{
//
//        }catch (Error e){
//
//        }
//
//    }
}
