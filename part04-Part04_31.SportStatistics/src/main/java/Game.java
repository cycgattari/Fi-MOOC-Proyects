/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi G
 */
public class Game {
    
    private String homeTeam;
    private String visitingTeam;
    private int homePoints;
    private int visitingPoints;
    private int localWinner;
    private int visitingWinner;

    
    public Game (String homeTeam, String visitingTeam, int homePoints, int visitingPoints){
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homePoints = homePoints;
        this.visitingPoints = visitingPoints;
        this.localWinner = 0;
        this.visitingWinner = 0;
    }
    public String gethomeTeam(){
        return this.homeTeam;
    }
    public String getvisitingTeam(){
        return this.visitingTeam;
    }
    
    public int localWinner(){
        if (this.homePoints > this.visitingPoints){
            this.localWinner = 1;            
        }
        return localWinner;
    }
    public int visitingWinner(){
        if (this.visitingPoints > this.homePoints){
            this.visitingWinner = 1;            
        }
        return visitingWinner;
    }    
    public boolean winnerIs(String team){
        if (team.equals(homeTeam) && visitingPoints < homePoints){
            return true;
        }
        
        if (team.equals(visitingTeam) && homePoints < visitingPoints){
            return true;
        } 
        
        return false;
        
        
    }    
        
        
}


        

    

