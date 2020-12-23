package com.jpa.learn.Spring.Data.Jpa.Service;

import com.jpa.learn.Spring.Data.Jpa.Repository.RetreivalRepo;
import com.jpa.learn.Spring.Data.Jpa.jpaModals.Retrieval;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@Component

public class jpaService {

    @Autowired
    RetreivalRepo repo;

    @Autowired
    EntityManager em;

    public List<Retrieval> getlist( ){

        //native qiery custom sql
//        Query q=em.createNativeQuery("select * from Retrieval");
//        List<Retrieval> list=q.getResultList();
//        System.out.println(list);



//saveOrUpdate(list);
//        List<Object[]> lis1=q.getResultList();
//        System.out.println("list2 "+lis1);
//        for(Object[] r:lis1){
//            System.out.println(r[0]);
//        }

insert();
        return  repo.findAll();

    }

    private synchronized void check() {
        System.out.println("incheck "+Thread.currentThread().getName());
    }


    public void saveOrUpdate(List<Retrieval> list){

Retrieval r=repo.findById((long) 23).get();

repo.save(r);


    }


    public void nativaequeryexample(){
        String sql="update retrieval set status='error' where id>30000;";
        Query q=em.createNativeQuery(sql);

       int i= q.executeUpdate();
        System.out.println("i="+i);


    }


    public void insert(){
        ExecutorService ex=Executors.newFixedThreadPool(4);


        for(int i=0;i<200;i++){

            int finalI = i;
            Runnable r=new Runnable() {
             @Override

             public void run() {
                 for(int j = finalI; j<10; j++){

                repo.updatedata();

                 }
                 System.out.println("completed i="+finalI);
             }

         };
            ex.execute(r);

        }
    }



}

