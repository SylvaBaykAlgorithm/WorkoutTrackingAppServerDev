package api.dev.WorkApp.model.users;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;

@Document
@Component
public class ClientUser extends GeneralUser{

    @Field
    private int height;
    @Field
    private int weight;
    @Field
    private int targetWeight;
    @Field
    private String[] prevTargetWeights;


    public  ClientUser(){
        super();
    }

    public ClientUser(String uid, String first, String last, String email, String title, boolean active) {
        super(uid, first, last, email, title, active);
    }

    public ClientUser(String uid, String first, String last, String email, String title, boolean active, int height, int weight, int targetWeight, String[] prevTargetWeights) {
        super(uid, first, last, email, title, active);
        this.height = height;
        this.weight = weight;
        this.targetWeight = targetWeight;
        this.prevTargetWeights = prevTargetWeights;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTargetWeight() {
        return targetWeight;
    }

    public void setTargetWeight(int targetWeight) {
        this.targetWeight = targetWeight;
    }

    public String[] getPrevTargetWeights() {
        return prevTargetWeights;
    }

    public void setPrevTargetWeights(String[] prevTargetWeights) {
        this.prevTargetWeights = prevTargetWeights;
    }
}


