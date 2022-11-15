package net.javaguide.springboot.demo.repository;

import net.javaguide.springboot.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{

}
