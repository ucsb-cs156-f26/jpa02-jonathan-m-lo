package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    @Test
    public void getTeam_returns_team_with_correct_name() {
        Team  t = Developer.getTeam();
        assertEquals("f26-04", t.getName());
    }

    @Test
    public void getTeam_returns_team_with_correct_members() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Sarah"),"Team should contain Sarah");
        assertTrue(t.getMembers().contains("Austin"),"Team should contain Austin");
        assertTrue(t.getMembers().contains("Harry"),"Team should contain Harry");
        assertTrue(t.getMembers().contains("Haoting"),"Team should contain Haoting");
        assertTrue(t.getMembers().contains("Athena"),"Team should contain Athena");
        assertTrue(t.getMembers().contains("Jonathan L."),"Team should contain Jonathan L.");
    }

    @Test
    public void EqualsSameObject() {
        Team t = Developer.getTeam();
        assertTrue(t.equals(t));
    }

    @Test
    public void NotEqualsDifferentObject() {
        ArrayList<String> a = new ArrayList<>();
        assertTrue(!team.equals(a));
    }

    @Test
    public void equals_different_name_returns_false() {
        Team t1 = new Team("Team1");
        Team t2 = new Team("Team2");

        assertTrue(!t1.equals(t2));
    }

    @Test
    public void equals_different_members_returns_false() {
        Team t1 = new Team("Team1");
        Team t2 = new Team("Team1");

        t1.addMember("Member1");
        t2.addMember("Member2");

        assertTrue(!t1.equals(t2));
    }

    @Test
    public void equals_same_fields_returns_true() {
        Team t1 = new Team("Team1");
        Team t2 = new Team("Team1");

        t1.addMember("Member1");
        t2.addMember("Member1");

        assertTrue(t1.equals(t2));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test 
    public void hashCode_consistent_with_equals() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());
        // instantiate t as a Team object
        Team t = new Team();
        int result = t.hashCode();
        int expectedResult = 1;
        assertEquals(expectedResult, result);

    }
    

}
