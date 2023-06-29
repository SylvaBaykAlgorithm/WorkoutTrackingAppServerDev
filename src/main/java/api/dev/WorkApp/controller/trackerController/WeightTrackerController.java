package api.dev.WorkApp.controller.trackerController;


import api.dev.WorkApp.service.trackerService.WeightTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tracker")
public class WeightTrackerController {

    @Autowired
    WeightTrackerService weightTrackerService;

    @GetMapping("/{uid}/{targetWeight}")
    public String createWeightTracker(@PathVariable String uid, @PathVariable String targetWeight){
        System.out.println(uid+targetWeight);
        return weightTrackerService.createWeightTracker(uid, targetWeight);
    }


    @GetMapping("/check")
    public String statusCheck(){
        return "ok";
    }
}
