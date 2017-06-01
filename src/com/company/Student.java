package com.company;

/**
 * Created by ilona.oliinyk_tac on 01.06.2017.
 */
 class Student implements IChillable, IWorkable {

    String newBeer;
    String newGame;
    String newName;


    public Student (String name){
        newName = name;
    }

    public Student (Student studentObject){
        newName = studentObject.newName;
    }

   public void drinkBeer(String beer){
        newBeer = beer;
       System.out.println("Drinks beer " + beer);

    }
    public void playGames(String game){
       newGame = game;
    }

    public void work(){


    }
    public void getPaid(){

    }
    public void setName (String name){
        newName = name;


    }
    public String getName(){
        return newName;
    }



}
