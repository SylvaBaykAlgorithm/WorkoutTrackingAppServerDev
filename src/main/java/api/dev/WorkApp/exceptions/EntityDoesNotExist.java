package api.dev.WorkApp.exceptions;

public class EntityDoesNotExist extends Exception{

    public EntityDoesNotExist(String error){
        super(error);
    }
}
