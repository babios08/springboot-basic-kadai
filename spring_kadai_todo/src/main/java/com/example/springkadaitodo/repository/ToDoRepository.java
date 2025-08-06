package com.example.springkadaitodo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springkadaitodo.entity.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo, Integer> {
    // JpaRepository を継承すると基本的なCRUD操作が自動で使える
}
