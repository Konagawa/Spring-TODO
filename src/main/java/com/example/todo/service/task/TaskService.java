package com.example.todo.service.task;

import com.example.todo.controller.task.TaskDTO;

import java.util.List;

public class TaskService {
    public List<TaskDTO> find() {
        var task1 = new TaskDTO(
                1L,
                "Spring Bootを学ぶ",
                "TODOアプリケーションを作ってみる",
                "TODO"
        );
        var task2 = new TaskDTO(
                2L,
                "Spring Securityを学ぶ",
                "ログイン機能を作ってみる",
                "TODO"
        );

        return List.of(task1, task2);
    }
}
