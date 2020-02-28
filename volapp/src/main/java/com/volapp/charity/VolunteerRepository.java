package com.volapp.charity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolunteerRepository extends JpaRepository<Volunteer, Long> {
    Volunteer findByVolunteerUsername(String volunteerUsername);

	List<Volunteer> findByUsername(String volunteerUsername);
}
