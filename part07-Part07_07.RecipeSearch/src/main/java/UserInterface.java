
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    
    private String file;
    private Scanner scan;
    private ArrayList<String> fileToArray;
    private ArrayList<ReceiptAdmin> recetas;
    
    public UserInterface(String file, Scanner scan){
        this.file = file;
        this.scan = scan;
        this.fileToArray = new ArrayList<>();
        this.recetas = new ArrayList<>();
    }
    
    public void start(){
        
        System.out.println("");
        System.out.print("Commands:\nlist - lists the recipes\nstop - stops the program");
        System.out.print("\nfind name - searches recipes by name");
        System.out.print("\nfind cooking time - searches recipes by cooking time");
        System.out.print("\nfind ingredient - searches recipes by ingredient\n");
        
        readFromFile();
        System.out.println(fileToArray);
        FileToRecetas();
        System.out.println(recetas);

        //whileFile();
    }
    
    public void whileFile(){
        while (true){
            System.out.println("");
            System.out.print("Enter command:");
            String command = scan.nextLine();
            if(command.equals("list")){
                System.out.println("");
                System.out.println("Recipes:");               
                    for(ReceiptAdmin data: recetas){
                        System.out.println(data);
                    }
            }
            if(command.equals("stop")){
                break;
            }
            if(command.equals("find name")){
                findName();
            }
            if(command.equals("find cooking time")){
                findCookingTime();
            }
            if(command.equals("find ingredient")){
                findIngredient();
            }
        }                                
    }
    
    public void findIngredient(){
        ArrayList <String> listado = new ArrayList<>();
        System.out.print("Ingredient:");
        String data = scan.nextLine();
        System.out.println("");
        System.out.println("Recipes:");     
        for(ReceiptAdmin nombres : recetas){
            listado = nombres.getRecetaIngred();
            //System.out.println(listado); 
            //System.out.println(nombres);     
                for (String items : listado){
                    //System.out.println(items);            
                    if(items.equals(items)){                  
                        System.out.println(nombres);            
                    }
                    //if(items.contentEquals(data)){                  
                   //     System.out.println(nombres);            
                  //  }

        }
    }
    }                   
    public void findCookingTime(){
        System.out.print("Max cooking time:");
        int data = Integer.valueOf(scan.nextLine());
        for(ReceiptAdmin nombres : recetas){
            int info = nombres.getRecetaTime();
            if(info <= data){
                System.out.println(nombres);
            }
        }
    }

    
    public void findName(){
        System.out.print("Searched word:");
        String data = scan.nextLine();
        System.out.println("");
        System.out.println("Recipes:");               
        for(ReceiptAdmin nombres : recetas){
            String info = nombres.getRecetaName();
            if(info.contains(data)){
                System.out.println(nombres);
            }          
        }
    }
    
   
    
    public ArrayList<ReceiptAdmin> FileToRecetas(){
        ArrayList <String> ingredientes = new ArrayList<>();
        int i = 1;
        String nombreReceta = "";
        int tiempo = 0;
        for (String data : fileToArray){
            if (data.equals("")){
                //System.out.println(ingredientes);
                recetas.add(new ReceiptAdmin(nombreReceta, tiempo, ingredientes));
                //System.out.println(recetas);
                i = 1;
                ingredientes.clear();
                continue;
                }   
            if (i==1){
                nombreReceta = data;
            }
            if (i==2){
                tiempo = Integer.valueOf(data);                              
            } 
            if (i > 2){
                ingredientes.add(data);         
            }
            i++;
        }
        //System.out.println(ingredientes);
        //System.out.println(ingredientes);
        this.recetas.add(new ReceiptAdmin(nombreReceta, tiempo, ingredientes););
        //System.out.println(recetas);
        return recetas;
        }   
     
    public ArrayList<String> readFromFile(){
        try (Scanner scant = new Scanner(Paths.get(this.file))){
            while (scant.hasNextLine()){
                String data = scant.nextLine();
                if (data.isEmpty()){
                    this.fileToArray.add("");
                    continue;
                }
                this.fileToArray.add(data);
            }
        } catch (Exception e){
            System.out.println("error!" + e.getMessage());
        }  
        return this.fileToArray;
    }
        

    
}

    
