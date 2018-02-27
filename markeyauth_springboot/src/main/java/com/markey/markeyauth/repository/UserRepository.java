package com.markey.markeyauth.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.markey.markeyauth.domain.User;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {
	public List<User> findByUsername(String username);
}
