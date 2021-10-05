package com.turntabl;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.util.Date.*;

public class Client {
    private String firstName;
    private String lastName;
    private int points = 0;
    private MembershipType membershipType;
    private List<Trade> trade = new ArrayList<>();

    public Client(String firstName, String lastName, int points, MembershipType membershipType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.points = points;
        this.membershipType = membershipType;
    }

    public void initializeMembership() {
        if (points > 0 && points < 10){
            membershipType = new MembershipType.Bronze();
        }else if (points > 10 && points < 19){
            membershipType = new MembershipType.Silver();
        }else if(points >= 20) {
            membershipType = new MembershipType.Gold();
        }
    }

    public void addTrade(Trade trade){
        initializeMembership();
        canTrade(membershipType);
    }

    private boolean canTrade(MembershipType membershipType){
        int time = LocalTime.now().getHour();
        if(){}

        if (membershipType instanceof MembershipType.Bronze &&  points <= ((MembershipType.Bronze) membershipType).getLimit() && time >= 10){
            return true;
        }else if(membershipType instanceof MembershipType.Silver && points <= ((MembershipType.Silver) membershipType).getLimit()){
            return true;
        }else if(membershipType instanceof MembershipType.Gold && points <= ((MembershipType.Gold) membershipType).getLimit()){
            return true;
        }else {
            return false;
        }
    }
}
