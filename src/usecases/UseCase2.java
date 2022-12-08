package usecases;

public class UseCase2 {
    public static void main(String[] args) {
        int isFullTime = 1;
        int empRatePerhr = 20;
        int empHr = 0;
        int empWage=0;
        double randomCheck = Math.floor(Math.random() * 10) % 2;

        if (randomCheck == isFullTime)
            empHr = 8;

        else

            empHr = 0;



        empWage = empHr*empRatePerhr;
        System.out.println("Employee Wage is :"+empWage);
    }
        }


