package com.telRan.course.tests;

import org.testng.annotations.Test;


public class LoginTrelloNegativeTest extends TestBaseNegative {


    @Test(priority = 2)
    public void aLoginTrelloTestNotValidmail() {
        login(user1, pwd1);
    }

    @Test(priority = 1)
    public void bLoginTrelloTestNotValidmail() {
        login(user2, pwd2);
    }


}