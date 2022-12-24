package Lab05;

import java.util.Scanner;

public class TestLAp {
    public static void main(String[] args) {
        Employee p1 = new Employee("Jame","123-A","1-1-2561");
        ProductionWorker pw1 = new ProductionWorker(p1,"Day",50.00);
        System.out.println("===================");
        pw1.showInfo();
        System.out.println("==================");

        Employee p2 = new Employee("Bell","222-A","2-2-2561");
        ProductionWorker pw2 = new ProductionWorker(p2,"Night",100.00);
        System.out.println("==================");
        pw2.showInfo();
        System.out.println("==================");

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the number of working hour for Jame : ");
        int hourJame = kb.nextInt();
        Double salaryJame  = hourJame*pw1.getHourPerate();
        System.out.println("Salary of Jame : "+salaryJame);
        System.out.print("Enter the number of working hour for Bell : ");
        int hourBell = kb.nextInt();
        Double salaryBell = hourBell*pw2.getHourPerate();
        System.out.println("salary of Bell : "+ salaryBell);

        Double bellThanJame = salaryBell-salaryJame;
        Double jameThanBell = salaryJame-salaryBell;
        
        if (salaryBell>salaryJame){
            System.out.println("Bell has more salary than Jame : " +bellThanJame);
        }
        else if (salaryJame>salaryBell){
            System.out.println("Jame has more salary than Bell : "+jameThanBell);
        }
        else{
            System.out.println("Jame and Bell get the same salary .");
        }
    }
}
