package com.epamfour1;
import java.util.Scanner;
import java.util.logging.Logger;
public class House_Estimation_cost {
    public void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        Logger log=Logger.getLogger(House_Estimation_cost.class.getName());
        log.info("Enter area of house in square feets");
        float area=input.nextFloat();
        log.info("Enter type of material ");
        log.info("1.standard material \n 2.above standarad material \n 3.high standard material \n 4.high standard and fully automated");
        int choice=input.nextInt();
        float value;
        if(choice==1)
        {
            value=1200*area;
            log.info("Your house is constructed using Standard Material of cost"+value);

        }
        else if(choice==2)
        {
            value=1500*area;
            log.info("Your house is constructed using Above Standard Material of cost"+value);

        }
        else if(choice==3)
        {
            value=1800*area;
            log.info("Your house is constructed using High Standard Material of cost"+value);

        }
        else if(choice==4)
        {
            value=2500*area;
            log.info("Your house is constructed using High Standard &Fully Automated Material of cost"+value);

        }
        else
        {
            log.info("You have entered invalid choice, Please check again");
        }

        input.close();
    }
}
