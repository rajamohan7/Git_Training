package com.training.git;

public class LaunchTraining {

  public static void main(String[] args) {

    ClassRoom classRoom = new ClassRoom("Ajanta Caves", "BN 5F 001", 5);
    
    if(args.length > 0) {
      System.out.println("My name is '" + args[0]+ "'. I am attending training in " + classRoom); 
    } else {
      System.out.println("We are in " + classRoom); 
    }
  }

}
