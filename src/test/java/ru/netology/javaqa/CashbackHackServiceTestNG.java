package ru.netology.javaqa;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTestNG {

    @Test
    public void shouldAdviseToBuyUpToAThousand(){
        CashbackHackService service = new CashbackHackService();

        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        Assert.assertEquals(actual,expected);

    }

    @Test
    public void shoulDofferToBuyUpToTwoThousand(){
        CashbackHackService service = new CashbackHackService();

        int amount = 1267;

        int actual = service.remain(amount);
        int expected = 733;

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void shoulFallDueToInaccuracyInTheCode(){
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }


}
