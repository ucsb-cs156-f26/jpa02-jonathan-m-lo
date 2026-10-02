package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

}
