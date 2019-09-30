package com.ytl.rxjava_rxandroid_demo.util;

import com.ytl.rxjava_rxandroid_demo.models.Task;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Richard Yi-Te Lu on 29,September,2019
 */
public class DataSource {


    public static List<Task> createTasksList(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Take out the trash", true, 3));
        tasks.add(new Task("Walk the dog", false, 2));
        tasks.add(new Task("Make my bed", true, 1));
        tasks.add(new Task("Unload the dishwasher", false, 0));
        tasks.add(new Task("Make dinner", true, 5));
        return tasks;
    }


}

