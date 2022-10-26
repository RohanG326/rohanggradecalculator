import java.util.*;
public class GradeCalculator {
    public static void main(String[] args) {
    Scanner type = new Scanner(System.in);
    System.out.println("Is your grade in a separate or test category? \n 1 - Separate \n 2 - Tests");
    int category = type.nextInt();
    type.close();
    if (category == 1) {
        Scanner currentGrade = new Scanner(System.in);
        System.out.println("What is your current grade?");
        double cGrade = currentGrade.nextDouble();
        currentGrade.close();
        Scanner percentFinal = new Scanner(System.in);
        System.out.println("What is the Final's weighted percent?");
        int pFinal = percentFinal.nextInt();
        percentFinal.close();
        Scanner desiredGrade = new Scanner(System.in);
        System.out.println("What is your desired grade?");
        double dGrade = desiredGrade.nextDouble();
        desiredGrade.close();
        
    }
    }
}