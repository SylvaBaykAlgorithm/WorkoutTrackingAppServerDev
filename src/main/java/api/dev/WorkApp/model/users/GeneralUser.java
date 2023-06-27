package api.dev.WorkApp.model.users;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;

@Document
@Component
public class GeneralUser {

    @Id
    private String uid;
    @Field
    private String first;
    @Field
    private String last;
    @Field
    private String phoneNumber;
    @Field
    private String email;
    @Field
    private String title;
    @Field
    private boolean active;

    protected GeneralUser(){}
    public GeneralUser(String uid, String first, String last, String email, String title, boolean active) {
        this.uid = uid;
        this.first = first;
        this.last = last;
        this.email = email;
        this.title = title;
        this.active = active;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
