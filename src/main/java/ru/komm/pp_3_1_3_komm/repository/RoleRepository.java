package ru.komm.pp_3_1_3_komm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.komm.pp_3_1_3_komm.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
