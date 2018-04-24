package com.kodilla.spring.portfolio;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Component;

        import java.util.ArrayList;
        import java.util.List;

public class TaskList {
    private final List<String> tasks;

    public TaskList(List<String> tasks) {
        this.tasks = new ArrayList<>();
    }

    public int taskAmount(){
        return this.tasks.size();
    }
    public List<String> getTasks() {
        return this.tasks;
    }
}