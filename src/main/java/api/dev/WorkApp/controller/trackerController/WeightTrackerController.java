package api.dev.WorkApp.controller.trackerController;


import api.dev.WorkApp.service.trackerService.WeightTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeightTrackerController {

    @Autowired
    WeightTrackerService weightTrackerService;

    @PutMapping("/{uid}/tracker")
    public String createWeightTracker(@PathVariable String uid, @RequestBody String targetWeight){
        String res = weightTrackerService.createWeightTracker(uid, targetWeight);
        return res;

    }

}
