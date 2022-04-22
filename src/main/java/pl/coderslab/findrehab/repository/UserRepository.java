package pl.coderslab.findrehab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.findrehab.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
