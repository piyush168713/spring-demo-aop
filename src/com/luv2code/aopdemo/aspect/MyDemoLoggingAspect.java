package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {             // 7527030526   -> DSW Conselling cell

    // this is where we add all our related advices for logging

    // let's start with an @Before advice

    // @Before("execution(public void com.luv2code.aopdemo.dao.AccountDAO.addAccount())")         // will only match on addAccount for the specific class (AccountDAO)
    // @Before("execution(public void add*())")         // will match on all class which starts from add i.e. addAccount, addSillyMember

    // @Before("execution(* add*())")      // changed void -> *   and will match with any return type for add* methods

    // @Before("execution(* add*(com.luv2code.aopdemo.Account, ..))")      // matching by param wildcards on more parameter type with pointcut expression

    // @Before("execution(* add*(..))")          // Match on any number of parameters

    @Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")       // matching on package in any class and any method and any params
    public void beforeAddAccountService(){

        System.out.println("\n====>>>> Executing @Before advice on addAccount()");
    }
}
