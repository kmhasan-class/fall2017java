/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1.demo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author kmhasan
 */
public class Todo {
    private LocalDate date;
    private String title;
    private ArrayList<String> todoItemList;
    private ArrayList<String> completedItemList;

    public Todo() {
        todoItemList = new ArrayList<>();
        completedItemList = new ArrayList<>();
    }

    public Todo(LocalDate date, String title) {
        this();
        this.date = date;
        this.title = title;
    }

    
    public LocalDate getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getTodoItemList() {
        return todoItemList;
    }

    public ArrayList<String> getCompletedItemList() {
        return completedItemList;
    }
    
    public String toString() {
        return title + " " + todoItemList.size() + "/" + (todoItemList.size() + completedItemList.size());
//date.toString(); 
/*                + ", " 
                + title 
                + ", " 
                + todoItemList 
                + ", "
                + completedItemList;*/
    }
    
}
