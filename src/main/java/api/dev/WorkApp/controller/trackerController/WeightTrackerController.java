package api.dev.WorkApp.controller.trackerController;


import api.dev.WorkApp.service.trackerService.WeightTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tracker")
public class WeightTrackerController {

    @Autowired
    WeightTrackerService weightTrackerService;

    @PutMapping("/{uid}")
    public String createWeightTracker(@PathVariable String uid, @RequestBody String targetWeight){
        String res = weightTrackerService.createWeightTracker(uid, targetWeight);
        return res;
    }


}
