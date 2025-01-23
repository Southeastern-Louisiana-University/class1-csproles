package src;

import java.util.Scanner;

public class start {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String letterGrade = "";
        double userGrade = -1;

        while((userGrade < 0) || (userGrade > 100)){
            userGrade = input.nextDouble();
        }

        if(userGrade >= 90){
            letterGrade = "A";
        }
        else if((userGrade < 90) && (userGrade >= 80)){
            letterGrade = "B";
        }
        else if((userGrade < 80) && (userGrade >= 70)){
            letterGrade = "C";
        }
        else if((userGrade < 70) && (userGrade >= 60)){
            letterGrade = "D";
        }
        else if(userGrade < 60){
            letterGrade = "F";
        }

        System.out.println(letterGrade);
    }
}
