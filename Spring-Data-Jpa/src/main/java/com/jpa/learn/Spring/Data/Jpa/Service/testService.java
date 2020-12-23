package com.jpa.learn.Spring.Data.Jpa.Service;

import com.jpa.learn.Spring.Data.Jpa.jpaModals.Retrieval;
import org.springframework.scheduling.config.Task;

import java.util.*;
import java.util.stream.Collectors;

public class testService {

    public static void main(String[] args) {
        System.out.println("Ready");

        Retrieval r=new Retrieval(10,"ABC","pdm","name","validated");

        PriorityQueue<Retrieval> p=new PriorityQueue<>();
        p.add(new Retrieval(13,"BCA","pdm","name","validated") );
        p.add(new Retrieval(11,"BCA","pdm","name","validated"));


        List<Retrieval> list= Arrays.asList(
                new Retrieval(10,"ABC","pdm","name","validated")
                ,new Retrieval(11,"BCA","pdm","name","validated")
                ,new Retrieval(12,"ABC","pdm","name","validated")
                ,new Retrieval(13,"BCA","pdm","name","validated"));

        System.out.println(list);


        System.out.println("p "+p);


        final Map<String, Map<String, List<Retrieval>>> collect = list.stream().collect(Collectors.groupingBy(Retrieval::getLob, Collectors.groupingBy(Retrieval::getSource)));

        System.out.println("collect ="+collect);

        Set<Retrieval> collect1 = list.stream().collect(Collectors.toSet());
        System.out.println(collect1);

    }
}
