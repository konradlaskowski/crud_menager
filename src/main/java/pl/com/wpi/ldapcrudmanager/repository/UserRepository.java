package pl.com.wpi.ldapcrudmanager.repository;

import pl.com.wpi.ldapcrudmanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Tutaj możesz dodać niestandardowe metody zapytań, jeśli potrzebujesz
}
