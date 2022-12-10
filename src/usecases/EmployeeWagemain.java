package usecases;

public class EmployeeWagemain {
    public static final int isFullTime = 1;
    public static final int isPartTime = 2;

    public static final int noOfWorkingDays=20;

    public static void main(String[] args) {
        int isFullTime=0;
        int empRatePerhr = 20;
        int empHr = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        int noOfWorkingDays = 20;

        for (int day = 0 ; day < noOfWorkingDays;day++)
        {
            int randomCheck = (int) Math.floor(Math.random() * 10) % 3;

            if(isFullTime == randomCheck)
            {
                empHr = 8;
            } else if (isPartTime == randomCheck) {
                empHr = 4;
            }else {
                empHr=0;
            }
            empWage = empHr * empRatePerhr;
            System.out.println("EmpWage is for day "+ day +" "  + empWage);
            totalEmpWage+=empWage;


        }

        System.out.println("total EmpWageis :"+totalEmpWage);



    }
        }


