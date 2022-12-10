package usecases;

public class EmployeeWagemain {
    public static final int isFullTime = 1;
    public static final int isPartTime = 2;
    public static void main(String[] args) {

        int empRatePerhr = 20;
        int empHr = 0;
        int empWage = 0;
        int randomCheck = (int) Math.floor(Math.random() * 10) % 3;

        switch (randomCheck) {
            case  isFullTime:
                empHr = 8;
                break;
            case isPartTime:
                empHr = 4;
                break;
            default:
                empHr=0;

        }
        empWage=empHr*empRatePerhr;
        System.out.println("EmpWage is :" + empWage);
    }
        }


