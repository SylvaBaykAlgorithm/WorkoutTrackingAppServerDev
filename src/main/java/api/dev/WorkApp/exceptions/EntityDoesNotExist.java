package api.dev.WorkApp.exceptions;

public class EntityDoesNotExist extends Error{

    public EntityDoesNotExist(String error){
        super(error);
    }
}
