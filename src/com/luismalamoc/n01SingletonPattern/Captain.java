package com.luismalamoc.n01SingletonPattern;

final class Captain {

    private static Captain captain;

    private Captain(){}

    public static synchronized Captain getCaptain(){
        if(captain == null){
            captain = new Captain();
        } else {
            System.out.println("You already have a captain for your team");
        }
        return captain;
    }

}