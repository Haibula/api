package com.example.api.repo;

import com.example.api.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositories extends JpaRepository<Students,Long>{

}
