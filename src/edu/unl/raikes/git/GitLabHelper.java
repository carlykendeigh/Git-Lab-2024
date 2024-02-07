package edu.unl.raikes.git;

import java.util.Arrays;

public class GitLabHelper {
//    private String person1;
//    private String person2;
//    GitLabHelper(String person1, String person2) {
//    this.person1 = person1;
//    this.person2 = person2;
//    }
//    public void PrintWelcomeMessage() {
//    System.out.print("Git lab by: " + person1 + " and " + person2);
//    }
    private String[] persons;
    
    GitLabHelper(String[] persons) {
        this.persons = persons;
    }

    public void PrintWelcomeMessage() {
        System.out.print("Git lab by: " + Arrays.toString(persons));
    }
}
