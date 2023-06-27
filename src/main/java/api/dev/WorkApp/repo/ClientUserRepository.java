package api.dev.WorkApp.repo;


import api.dev.WorkApp.model.users.ClientUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ClientUserRepository extends MongoRepository<ClientUser, String> {

//    default String saveUserName(String fName, String lName, String userName) {
//        try{
//            ArrayList<ClientUser> users = (ArrayList<ClientUser>) findAll();
//            users.forEach((user -> {
//                if(user.getUserName().equals(userName)){
//                    System.out.println("ERROR: User already exists");
//                }
//            }));
//            ClientUser user = new ClientUser(fName,lName,userName);
//            user.setUid(UUID.randomUUID().toString());
//            user.setDateCreated(LocalDateTime.now().toString());
//            user.setActive(true);
//            save(user);
//            return user.getUid();
//        }catch (Error e){
//            e.printStackTrace();
//            return null;
//        }
//
//    }

    //may need to set height/weight and other vars
    default String updateUser(ClientUser newData, String uid){

        try{
            Optional<ClientUser> oldUser = findById(uid);
            if(oldUser.isPresent()){
                ClientUser newUser = oldUser.get();
                newUser.setFirst(newData.getFirst());
                newUser.setLast(newData.getLast());
                newUser.setEmail(newData.getEmail());
                newUser.setPhoneNumber(newData.getPhoneNumber());
                deleteById(uid);
                save(newUser);
                return "Data updated successfully";
            }else{
                return "No data found with that UID";
            }
        }catch(Error e){
            e.printStackTrace();
            return "Error";
        }
    }

    default void deleteUser(String uid){
        try{
            Optional<ClientUser> user =  findById(uid);
            if(user.isPresent()){
                ClientUser updatedUser = user.get();
                updatedUser.setActive(false);
                deleteById(uid);
                save(updatedUser);
            }
        }catch(Error e){
            e.printStackTrace();

        }
    }
}



