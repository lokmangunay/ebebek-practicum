package com.ebebek;

import java.util.Scanner;
import java.util.logging.Logger;

public class BaseMethods {
    Logger logger = Logger.getLogger(BaseMethods.class.getName());
    Scanner scanner = new Scanner(System.in);
    Employee employee = new Employee();

    public final static String INFO_TEXT =
            "\nPlease make a choice" +
                    "\n Type QUIT if you want to terminate the program" +
                    "\n Type INFO if you want to fill the employee's information" +
                    "\n Type CALCULATE if you want to calculate bonus, tax, salary promotion and total salary" +
                    "\n Type PRINT if you want to print all information related to the employee";

    public String getNextLineFromScanner() {
        return scanner.nextLine();
    }

    public void nameOfEmployee() {
        logger.info("What is your name?");
        employee.setName(getNextLineFromScanner());
    }

    public void hiredYearOfEmployee() {
        logger.info("Since when have you been working in this company?");
        employee.setHireYear((Integer.parseInt(getNextLineFromScanner())));
    }

    public void hoursWorkedInAWeek() {
        logger.info("How many hours do you work in a week?");
        employee.setWorkHours((Double.parseDouble(getNextLineFromScanner())));
    }

    public void salary() {
        logger.info("What is your current salary?");
        employee.setSalary((Double.parseDouble(getNextLineFromScanner())));
    }

    public void employeeQuering() {
        String options = getNextLineFromScanner();
        while(!options.equalsIgnoreCase("QUIT")){
            switch (options) {
                case "QUIT":
                    logger.info("You have chosen to quit the program. See you later.");
                    break;

                case "INFO":
                    nameOfEmployee();
                    hiredYearOfEmployee();
                    salary();
                    hoursWorkedInAWeek();
                    new Employee(employee.getName(), employee.getSalary(), employee.getWorkHours(), employee.getHireYear());
                    break;

                case "CALCULATE":
                    employee.raiseSalary();
                    employee.bonus();
                    employee.tax();
                    break;

                case "PRINT":
                    logger.info(employee.toString());
                    break;

                default:
                    logger.info("You have written an unexpected text");
               }

            logger.info(INFO_TEXT);
            options = getNextLineFromScanner();

        }
    }


}



