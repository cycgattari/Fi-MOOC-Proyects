
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String fileUpload = scan.nextLine();
        
        
        ArrayList<Game> games = readFromFile(fileUpload); // Clase game list ade ob games para leer la file metodo
        System.out.println("Team: ");
        String teamName = scan.nextLine();
        
        int gamesWin = 0;
        
        ArrayList<Game> gamesOfATeam = new ArrayList<>();
        for (Game game : games) {
                if (teamName.equals(game.gethomeTeam()) || teamName.equals(game.getvisitingTeam())){
                    gamesOfATeam.add(game);
                }
            }
                             
        System.out.println("Games: " + gamesOfATeam.size());        
        
        for (Game game : gamesOfATeam) {
                if (game.winnerIs(teamName)){
                    gamesWin++ ;
                }
            }

        System.out.println("Wins: " + gamesWin);

        System.out.println("Losses: " + (gamesOfATeam.size() - gamesWin));
                       
    }    
    public static ArrayList<Game> readFromFile(String fileName) {
        ArrayList <Game> games = new ArrayList <>();
        
        try (Scanner scan = new Scanner(Paths.get(fileName))){
                        
            while (scan.hasNextLine()){
                String data = scan.nextLine();
                if (data.isEmpty()){
                    continue;
                }
                String[] listado = data.split(",");
                String nameL = listado[0];
                String nameV = listado[1];
                int pointsL = Integer.valueOf(listado[2]);
                int pointsV = Integer.valueOf(listado[3]);
                games.add(new Game(nameL, nameV, pointsL, pointsV));
            }
                                                
        } catch (Exception e){
            System.out.println("error " + e.getMessage());
        }         
        return games;
    }

}


        /*
        try (Scanner fileRead = new Scanner(Paths.get(fileUpload)) ){
            int counter = 0;
            int wins = 0;
            int loose = 0;
            while (fileRead.hasNextLine()){
                String linea = fileRead.nextLine();
                String[] dataFinal = linea.split(",");
                int one1 = Integer.valueOf(dataFinal[2]);
                int one2 = Integer.valueOf(dataFinal[3]);
                                                       
                if (dataFinal[0].contains(teamName)){
                    counter++;
                    if (one1 > one2){
                        wins++;
                    } else {
                        loose++;
                    }
                }
                if (dataFinal[1].contains(teamName)){
                    counter++;
                    if (one2 > one1){
                        wins++;
                    } else {
                        loose++;
                    }
                }
                                                                                                                
            }
            System.out.println("Games: " + counter);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + loose);

            
            
        } catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }

if (teamName.equals(game.gethomeTeam())){
                gamesCounter++;
                if (game.localWinner() == 1){
                    gamesWin++;
                } else {
                    gamesLoose++;
                }            
            }
            if (teamName.equals(game.getvisitingTeam())){
                gamesCounter++;
                if (game.visitingWinner() == 1){
                    gamesWin++;
                } else {
                    gamesLoose++;
                }            
            }        
        */