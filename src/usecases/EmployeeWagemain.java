package usecases;

public class EmployeeWagemain {
    public static void main(String[] args) {
        int isFullTime = 1;
        int isPartTime = 2;
        int empRatePerhr = 20;
        int empHr = 0;
        int empWage=0;
        double randomCheck = Math.floor(Math.random() * 10) % 3;

        if (randomCheck == isFullTime)
            empHr = 8;

        else if (randomCheck == isPartTime)
            empHr=4;
        else
            empHr = 0;



        empWage = empHr*empRatePerhr;
        System.out.println("Employee Wage is :"+empWage);
    }
        }


