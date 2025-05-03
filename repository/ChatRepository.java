package com.PMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PMS.model.Chat;
import com.PMS.model.Project;

public interface ChatRepository extends JpaRepository<Chat, Long> {
    

	Chat findByProject(Project projectById);
	
//	List<Chat> findByProjectNameContainingIgnoreCase(String projectName);
}

