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
        is incorrect.

        */
        double price;
        int type;
        double totalCost;
        String WARN_THE_USER = "Type is invalid !";
        totalCost = 0;

        //Get the type and the price from user. 
        Scanner input;
        input = new Scanner(System.in);
        System.out.print("Enter the type of the product : ");
        type = input.nextInt();
        System.out.print("Enter the price of the product : ");
        price = input.nextDouble();
        input.close();


        //Calculate the total cost, if the type is not valid, ask for again 
        if (type == 172) {
            totalCost = price * (1+0.18);
            
        }
        else if(type == 188){
            totalCost = price * (1+0.08);

        }
        else if (type == 196){
            totalCost = price ;
        }
        else{
            System.out.println(WARN_THE_USER);
            return;
        }
          
        //Display the result
        System.out.println("The total cost of the product is : "+totalCost);
    }


}
