package api.dev.WorkApp.repo;


import api.dev.WorkApp.model.users.ClientUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.baeldung.spring.data.persistence.repository")
public interface UserRepository extends JpaRepository<ClientUser, String> {

//    public ClientUser createUser(){
//        ClientUser user = new ClientUser("123","kenny","woods","email@gmail.com","CLIENT",true);
//        return user;
//    }


}
