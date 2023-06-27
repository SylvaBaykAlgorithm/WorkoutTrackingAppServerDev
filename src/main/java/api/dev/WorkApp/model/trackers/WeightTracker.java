package api.dev.WorkApp.model.trackers;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;


@Document
@Component
public class WeightTracker {

    @Id
    private String uid;
    @Field
    private String targetWeight;
    @Field
    private HashMap<Date,String> previousWeights;

    public WeightTracker(String uid,String targetWeight) {
        this.uid = uid;
        this.targetWeight = targetWeight;
        this.previousWeights = new HashMap<>();
    }

    public String getUid() {
        return uid;
    }

    public String getTargetWeight() {
        return targetWeight;
    }

    public void setTargetWeight(String targetWeight) {
        this.targetWeight = targetWeight;
    }

    public HashMap<Date, String> getPreviousWeights() {
        return previousWeights;
    }

    public void setPreviousWeights(HashMap<Date, String> previousWeights) {
        this.previousWeights = previousWeights;
    }
}
