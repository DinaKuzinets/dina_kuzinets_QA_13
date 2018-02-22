package com.telRan.course;

import org.testng.annotations.Test;


public class LoginTrelloNegativeTest extends TestBaseNegative {


    @Test(priority = 2)
    public void ALoginTrelloTestNotValidmail() {
        login(user1, pwd1);
    }

    @Test(priority = 1)
    public void BLoginTrelloTestNotValidmail() {
        login(user2, pwd2);
    }


}