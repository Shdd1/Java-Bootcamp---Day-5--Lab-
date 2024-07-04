import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Q1

   /* int num1=125;
    int num2=24;
        System.out.println("Addition : "+(num1+num2));
        System.out.println("Multiply : "+(num1*num2));
        System.out.println("Subtract : "+(num1-num2));
        System.out.println("Divide : "+(num1/num2));
        System.out.println("Remainder : "+(num1%num2));*/


        //another slotion take input from the user

        /*Scanner input=new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("inter num1 : ");
        num1=input.nextInt();
        System.out.println("inter num2 : ");
        num2=input.nextInt();

        System.out.println("Addition : "+(num1+num2));
        System.out.println("Multiply : "+(num1*num2));
        System.out.println("Subtract : "+(num1-num2));
        System.out.println("Divide : "+(num1/num2));
        System.out.println("Remainder : "+(num1%num2));*/

        //Q2

        /*Scanner input=new Scanner(System.in);
        int num;
        System.out.println("inter number : ");
        num=input.nextInt();
        int multiplicationTable;
        for(int i=1;i<=10;i++){
            multiplicationTable =num*i;
            System.out.println(num+"*"+i+" = "+multiplicationTable); */


        //Q3

       /* Scanner input=new Scanner(System.in);
        double radius;
        double area;
        double perimeter;
        double pi= 3.1415926;
        System.out.println("Enter the radius of a Circle: ");
        radius=input.nextDouble();
         area =pi*(radius*radius);
        perimeter= 2 * pi* radius;
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is= " + area);*/

        //Q4
        // do while
        /*
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the count of numbers: ");
        int count=input.nextInt();
        int loop=0;
        float average=0;
        do {
            System.out.println("plese inter number");
            int num= input.nextInt();
            average+=num;
            loop++;
            if (loop==count){
                break;
            }

        }while (loop<=count);
        System.out.println("The average is: "+(average/count));
        */

        // while loop

       /* Scanner input=new Scanner(System.in);
        System.out.println("Enter the count of numbers: ");
        //
        int count=input.nextInt();
        int loop=0;
        float average=0;
        while (loop <= count){
            loop++;
            System.out.println("plese inter a number :");
            int num=input.nextInt();
            average+=num;
            if (loop==count){
                break;
            }
        }
        System.out.println("The average is: "+(average/count));
        */


        //Q5
        /*Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int first=input.nextInt();
        System.out.println("Input the second number : ");
        int second=input.nextInt();
        System.out.println("Input the third number : ");
        int third=input.nextInt();
        int sum2=first+second;
        if(sum2==third){
            System.out.println("The result is : true");
        }else {
            System.out.println("The result is: false");
        }*/

        //Q6
        /*Scanner input = new Scanner(System.in);
        System.out.println("Input a word:");
        String word =input.nextLine();
        String reversedString = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedString += word.charAt(i);
        }
        System.out.println(" Reverse word : " + reversedString);*/


        //Q7
       /* Scanner input = new Scanner(System.in);
        System.out.println("Input a number:");
        int num=input.nextInt();
        if(num%2==0){
            System.out.println("The number is Even");
        }else {
            System.out.println("The number is Odd");
        }*/


        //Q8

        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in Centigrade: ");
        int cent=input.nextInt();
        double fahren=((cent*1.8)+32);
        System.out.println("Temperature in Fahrenheit is: "+ fahren);*/


        //Q9

       /* Scanner input = new Scanner(System.in);
        System.out.println("Input a string:  ");
        String string = input.nextLine();
        System.out.println("Input a number: ");
        int num = input.nextInt();
        if (num >= 0 && num < string.length()) {
            System.out.println("output : " + string.charAt(num));
        }else {
            System.out.println("Index out of range. Please enter a valid index");
        }*/


        //Q10

        /*Scanner input = new Scanner(System.in);
        System.out.println("inter Width for rectangle=  ");
        float width = input.nextFloat();
        System.out.println("inter Height for rectangle=  ");
        float height=input.nextFloat();
        float area;
        float perimeter;
        area=width*height;
        perimeter=2*(width+height);
        System.out.printf("Area  is %.1f * %.1f = %.2f%n", width, height, area);
        System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.2f%n", width, height, perimeter);*/


        //Q11

      /* Scanner input = new Scanner(System.in);
        System.out.println("inter first integer :  ");
        int num1 = input.nextInt();
        System.out.println("inter second integer : ");
        int num2=input.nextInt();

        if (num1!=num2) {
            System.out.println(num1+"!="+num2);
        }
        if(num1<num2) {
            System.out.println(num1+"<"+ num2);
        }
        if(num1<=num2){
            System.out.println(num1+"<="+ num2);
        }*/


        //Q12

     /* Scanner input = new Scanner(System.in);
        System.out.println("Input seconds: ");
        int second = input.nextInt();
        int minut;
        int hours;
        int remaining_second;
        hours=second/3600;
        minut=((second%3600)/60);
        remaining_second=(second%60);

        System.out.println(hours+":"+minut+":"+remaining_second);*/

        //Q13

       /*Scanner input = new Scanner(System.in);
        System.out.println("Input first number :  ");
        int num1 = input.nextInt();
        System.out.println("Input second number : ");
        int num2=input.nextInt();
        System.out.println("Input third number: ");
        int num3=input.nextInt();
        System.out.println("Input fourth number:");
        int num4=input.nextInt();
         if(num1==num2 && num1==num3 && num1==num4 && num2==num3&&num2==num4&&num3==num4){
             System.out.println("Numbers are equal!\n");
         }else {
             System.out.println("Numbers are not equal!\n");
         }*/

        //Q14

        /*Scanner input = new Scanner(System.in);
        System.out.println("Input a number :  ");
        int num = input.nextInt();
        if(num>0){
            System.out.println("Number is positive");
        } else if (num<0) {
            System.out.println("Number is Negative");
        }else {
            System.out.println("Number is Zero");
        }*/


        //Q15

        /*Scanner input = new Scanner(System.in);
        int num ;
        int p = 0;
        int n = 0;
        int z = 0;
        while (true) {

            System.out.println("Please enter a number (enter -1 to end):");
            num = input.nextInt();
            if (num == -1) {
                break;
            }

            if (num > 0) {
                p++;
            } else if (num < 0) {
                n++;

            } else {
                z++;
            }

        }
        System.out.println("posativ num "+p+" "+"negativ num "+n+" " +"Zero "+z);*/


        //Q16

       /* Scanner input = new Scanner(System.in);
        System.out.println("inter number to reverse : ");
        int number=input.nextInt();
        int reverse=0;

        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);*/

        //Q17

      /*  Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Enter a number (or type 'stop' to end): ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("stop")) {
                break;
            }

            try {
                int number = Integer.parseInt(userInput);
                if (number > largest) {
                    largest = number;
                }
                if (number < smallest) {
                    smallest = number;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or type 'stop' to end.");
            }
        }

        if (largest == Integer.MIN_VALUE || smallest == Integer.MAX_VALUE) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);
        }*/

        //Q18

        /*Scanner scnr = new Scanner(System.in);
        System.out.println("Enter String: ");
        String userString = scnr.nextLine();
         int count=0;
         char user_char='a';
        for(int i=0; i<userString.length();i++){
            if(userString.charAt(i)==user_char){
                count=count+1;
            }
        }

        if(count ==1){
            System.out.println(count + " "+user_char);
        }
        else {
            System.out.println("Number of "+ user_char + "'s:"+count);

        }*/
    }
}
