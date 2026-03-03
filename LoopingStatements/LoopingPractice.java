package LoopingStatements;

public class LoopingPractice {

    public static void main(String[] args){

        String[] names = {"Maya","Mia", "John", "Dale"};
        loopingStatement(names);
    }

    public static void loopingStatement(String[] names){
        for (int i = 0; i < names.length; i++){
            System.out.println("Names: " + names[i]);
        }
    }
}