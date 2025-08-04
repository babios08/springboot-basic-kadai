package com.example.springkadaitodo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springkadaitodo.entity.ToDo;
import com.example.springkadaitodo.service.ToDoService;

@Controller
public class ToDoController {

    private final ToDoService toDoService;

    // コンストラクタでServiceを受け取る
    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    // URL /todo にアクセスが来たらこのメソッドを実行
    @GetMapping("/todo")
    public String showToDoList(Model model) {
        // Serviceを使ってDBから全ToDoを取得
        List<ToDo> todoList = toDoService.getAllTodos();

        // HTMLに渡すためにModelにデータを登録
        model.addAttribute("todos", todoList);

        // templates/todoView.html を表示する
        return "todoView";
    }
}
