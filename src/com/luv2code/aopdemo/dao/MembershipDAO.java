package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

     public boolean addSillyMember(){

            System.out.println(getClass() + ": DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");

            return true;
    }

    // add a new method to see if it will match...
    public void goToSleep(){
        System.out.println(getClass() + ": I am going to sleep now...");
    }
}
