package com.jspider.voting_surey_project.Entity.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jspider.voting_surey_project.Entity.Admin;

import jakarta.transaction.Transactional;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

	@Query(value = "SELECT * FROM admin WHERE email = :email", nativeQuery = true)
	Optional<Admin> findByEmail(@Param("email") String email);
      
}
