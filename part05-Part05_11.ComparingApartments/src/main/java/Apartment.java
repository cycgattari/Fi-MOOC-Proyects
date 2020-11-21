
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if (this.squares > compared.squares){
            return true;
        }
        if (this.squares < compared.squares){
            return false;
        }

        return false;

    }
    
    public int priceDifference(Apartment compared){
        int finalPrice = this.princePerSquare * this.squares;
        int toCompare = compared.princePerSquare * compared.squares;
        if (finalPrice >= toCompare){
            return finalPrice - toCompare;
        } else {
            return toCompare - finalPrice;
        } 
        
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int finalPrice = this.princePerSquare * this.squares;
        int toCompare = compared.princePerSquare * compared.squares;
        if (finalPrice >= toCompare){
            return true;
        } else {
            return false;
        } 
        
        
    }
}
