package com.epamfour1;
import java.util.Scanner;
import java.util.logging.Logger;
public class Interest
{
    public void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        Logger log=Logger.getLogger(Interest.class.getName());
        float si,ci,c;
        log.info("select your choice ");
        log.info("1.Simple Interest \n 2.Compound Interest");
        int choice=input.nextInt();
        if(choice==1)
        {
            log.info("You've opted to find Simple Interest so");
            log.info("Enter Principal,Time and Rate");
            int p=input.nextInt();
            int t=input.nextInt();
            int r=input.nextInt();
            int value;
            value=(p*t*r)/100;
            log.info("Simple Interest is:"+value);
        }
        else if(choice==2)
        {
            log.info("You've opted to find Compound Interest so");
            log.info("Enter Principal,Time , Rate & No.of times Interest is applied");
            int p=input.nextInt();
            int t=input.nextInt();
            int r=input.nextInt();
            int n=input.nextInt();
            int c1;
            int value;
            c1=(1+r/n)^(n*t);
            value=c1*p;
            log.info("Compound Interest is:"+value);
        }
        else
        {
            log.info("Sorry, You've entered wrong choice");
        }
        input.close();
    }
}
