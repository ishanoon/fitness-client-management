package io.shanoon.fitness.repository;

import io.shanoon.fitness.models.Management;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagementRepository extends JpaRepository<Management,Long> {
}
