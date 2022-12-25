package com.mafif.tutorials.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mafif.tutorials.model.Tutorial;

public interface TutorialsRepository extends JpaRepository<Tutorial, Long> {
  List<Tutorial> findByPublished(boolean published);

  List<Tutorial> findByTitleContaining(String title);
}
