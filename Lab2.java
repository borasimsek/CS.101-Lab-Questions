import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        
        question1();

    }

    public static void question1() {
        /*
    The total price of a product is the price of the
    product plus the sales tax. 
    
    The sales tax is of a
    product depends on the type of the product (an
    integer). 
    
    If the type of the product is 172, the sales
    tax is 18%;
    
    if the type of the product is 188, the
    sales tax is 8%;
    
    if the type of the product is 196,
    the sales tax is 0%.
    
    Write a program that will read
    the price of the product, the type of the product and
    displays the total cost of the product.
    
    Your program
    will also display a message if the type of the product
    is incorrect
    */
        String PRODUCT_TYPT_WARNING = "The type is not valid !";

        //Get the product price as integer and the type of the product as integer.
        Scanner input = new Scanner(System.in);
        System.out.print("The price of the product : ");

        Integer productPrice = input.nextInt();
        System.out.print("The type of the product : ");

        Integer productType = input.nextInt();
        double tax = 0;

        input.close();



        //If the type is 172
            // tax = Pprıce * 0.18
        if(productType == 172){
            tax = productPrice * 0.18;
        }
        

        //If the type is 188
            // tax = Pprıce * 0.8
        else if(productType == 188){
            tax = productPrice * 0.8;
        }
        //If the type is 196
            // tax = Pprıce * 0
        else if(productType == 196){
            tax = productPrice * 0;
        }
        // ıf the type other
            // warn the user
        else{
            
            System.out.println(PRODUCT_TYPT_WARNING);
            // Fınısh the method
            return;
        }
        // Dısplay the result
        double totalCost = tax + productPrice;
        System.out.println("The total cost is :" +totalCost);
    }
    
    

}
