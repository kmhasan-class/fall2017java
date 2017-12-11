/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.gui.demo;

/**
 *
 * @author kmhasan
 */
public class TodoTask {
    private int taskId;
    private String taskName;
    private int todoId;

    public TodoTask() {
    }

    public TodoTask(int taskId, String taskName, int todoId) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.todoId = todoId;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getTodoId() {
        return todoId;
    }

    @Override
    public String toString() {
        return taskName;
    }
    
    
}
