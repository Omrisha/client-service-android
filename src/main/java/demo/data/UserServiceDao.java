package demo.data;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserServiceDao extends JpaRepository<UserEntity, Long> {
    List<UserEntity> findByFirstNameAndLastName(String firstName, String lastName);
    UserEntity findByEmail(String email);
}
