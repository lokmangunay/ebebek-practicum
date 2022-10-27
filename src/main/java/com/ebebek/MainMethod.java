package com.ebebek;

import java.util.logging.Logger;

public class MainMethod extends BaseMethods{



    public static void main(String[] args) {
        BaseMethods baseMethods = new BaseMethods();
        Logger logger = Logger.getLogger(MainMethod.class.getName());
        logger.info(INFO_TEXT);
        baseMethods.employeeQuering();




    }
}
