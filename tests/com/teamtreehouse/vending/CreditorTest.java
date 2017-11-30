package com.teamtreehouse.vending;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreditorTest {
    private Creditor creditor;


    @Before
    public void setUp() throws Exception {
        creditor = new Creditor();
    }

    @Test
    public void availableFundsGetToZeroAfterRefund () throws Exception {
        //arrange
        creditor.addFunds(50);

        //act
        creditor.refund();

        //assert
        assertEquals(0, creditor.getAvailableFunds());
    }

    @Test
    public void refundingReturnsAllAvailableFunds() throws Exception {
        //arrange
        creditor.addFunds(10);

        //act
        int refund = creditor.refund();

        //assert
        assertEquals(10, refund);
        assertEquals(0, creditor.getAvailableFunds());
    }

    @Test
    public void addingFundsIncrementsAvailableFunds() throws Exception {
        //arrange

        //act
        creditor.addFunds(25);
        creditor.addFunds(25);

        //assert
        assertEquals(50, creditor.getAvailableFunds());
    }




}