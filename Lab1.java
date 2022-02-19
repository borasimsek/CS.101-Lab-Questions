import java.util.Scanner;

public class Lab1{

    public static void main(String[] args) {
        question9();
        
    }

    public static void question1() {
        // The currency exchange rate is 1 US dollar for 0.8961 euros. 
        // Write a program that prompts the user to enter the US dollars and displays the euros.  
        
        // Pseudo Code -> Yazilimin kendisi degil ama acik acik hangi adimlarin izlenmesi gerektigini soyler

        // Get Dollar input from user
        Scanner scanStr = new Scanner(System.in);
        System.out.print("Dollar: ");
        double dollar = scanStr.nextDouble();
        
        scanStr.close();
        // Convert dollar to the euro
        double euro = dollar * 0.8961;

        // Display the result
        System.out.println("Euro: "+euro);

    }
    public static void question2() {

        /*
        The currency exchange rate is 1 US dollar for
        0.8961 euros. Write a program that prompts the user
        enter the euro and displays the US dollars.
        */
        
        // Get euro input
        Scanner bora= new Scanner(System.in);
        System.out.println("Euro= " );
        double euro = bora.nextDouble();
        bora.close();

        // Convert euro to dollar
        double dollar = euro /0.8961;


        //Display the result
        System.out.println("Dollar= "+dollar);


    }
    public static void question3() {
        /*
        Write a program that reads in the radius and
        height of a cone and computes volume of the cone.
        */

        //Get the inputs of height and radius

        Scanner inputs1 = new Scanner(System.in);
        System.out.println("Radius= ");
        double radius = inputs1.nextDouble();
        
        System.out.println("Height= ");
        double height = inputs1.nextDouble();
        inputs1.close();
        //Calculate the volume of the cone
        
        double Volume = 3.14 * radius * radius *height /3;

        //Display the result.
        System.out.println("Volume is "+Volume);



    }
    public static void question4(){
        /*
        The total price of a product is the price of the
        product plus the sales tax. Suppose the sales tax is
        18%. Write a program that will read the price of the
        product and displays the total cost of the product.
        */

        // Get the price from the user
        Scanner scanPrice = new Scanner(System.in);
        System.out.println("Enter the price= ");
        double price = scanPrice.nextDouble();

        scanPrice.close();

        // add the sale tax
        double total_cost = price*(1+0.18);

        //Display the result
        System.out.println("Total cost= "+total_cost);


    }
    public static void question5(){
        /*
        The total price of a product is the price of the
        product plus the sales tax. Suppose the sales tax is
        18%. Write a program will read the total cost of
        the product and will display the total price of the
        product
        */

        //Get the total price input
        Scanner totalPrice = new Scanner(System.in);
        System.out.println("Total price= ");
        double totalprice = totalPrice.nextDouble();
        totalPrice.close();
        //Calculate the price without the tax
        double price = totalprice*(1-0.18);

        // Display the result
        System.out.println("Price is= "+price );


    }
    public static void question6(){

        /*
        Write a program that reads an integer between 0
        and 100 and adds all the digits in the integer. For
        example, if an integer is 93, the sum of all its digits
        is 12.
        */

        //get the integer input 
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer betwwen 0 and 100= ");
        int num = input.nextInt();
        input.close();
        //divide the number 
        int firstdigit = num %10;
        int remainingdigit = num /10;
        int seconddigit = remainingdigit%10;
        remainingdigit = remainingdigit/10;
        int thirddigit = remainingdigit%10;

        //sum and display the result
        int sum = firstdigit+seconddigit+thirddigit;
        System.out.println("sum is= "+sum);

    }
    public static void question7(){
        //Write a program that reads an integer between
        //0 and 1000 and adds all the digits in the integer.
        //For example, if an integer is 932, the sum of all its
        //digits is 14

        //Get the input between 0-1000
        Scanner input = new Scanner(System.in);
        System.out.println("Write the number between 0-1000= ");
        Integer number = input.nextInt();
        //find the first integer,remaining and second
        Integer firstdigit = number %10;
        Integer remain = number /10;
        Integer seconddigit = remain%10;
        input.close();
        //find the last integer
        remain = remain/10;
        int third = remain%10;
        //sum them up
        int sum = firstdigit+seconddigit+third;
        System.out.println("sum is= "+sum);

    }
    public static void question8() {
        /*
        Write a program that prompts the user to enter
        the number of 1 kurus¸, 5 kurus¸, 10 kurus¸, 25 kurus¸,
        50 kurus¸ and displays the total amount.
        */

        // Get the inputs from user
        Scanner input =new Scanner(System.in);
        System.out.print("1 kurus  :");
        double number1 = input.nextInt();
        System.out.print("5 kurus  :");
        double number5 = input.nextInt();
        System.out.print("10 kurus :");
        double number10 = input.nextInt();
        System.out.print("25 kurus :");
        double number25 = input.nextInt();
        System.out.print("50 kurus :");
        double number50 = input.nextInt();
        input.close();
        //calculate the sum
        double sum =(number1/100)+(number10/10)+(number25/4)+(number5/20)+(number50/2);
        //display the info and sum
        String outputStr=  "\n********RESULT********\n"+
                        "1  kurus : "+number1 +"\n"+
                        "5  kurus : "+number5+"\n"+
                        "10 kurus : "+number10+"\n"+
                        "25 kurus : "+number25+"\n"+
                        "50 kurus : "+number50+"\n"+
                        "-------------------------\n"+
                        "Total Sum: "+sum;
        System.out.println(outputStr);
        
    }
    public static void question9() {
        /*
        Write a program that reads the balance (B) and
        the annual percentage interest rate (AIR) and displays the interest rate on the next month using the
        following formula:
        Interest = B × (AIR/1200)
        */

        //Get the inputs from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Balance : ");
        double balance = input.nextDouble();
        System.out.println("AIR : ");
        double AIRinput = input.nextDouble();
        //Calculate the interest rate according to formula
        double interestRate = balance * (AIRinput/1200);
        input.close();
        // display the result
        System.out.println("Interest rate is "+interestRate);

    
}



}