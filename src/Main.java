public class Main
{
    public static void main(String[] args)
    {
        int intOperandA = 9;
        int intOperandB = 2;
        int intSum = 2;
        int intProduct = 3;
        int intDifference = 4;
        int intQuotient = 5;
        int intModulo = 6;

        double doubleOperandA = 9.0;
        double doubleOperandB = 2.0;
        double doubleSum = 2.0;
        double doubleProduct = 3.0;
        double doubleDifference = 4.0;
        double doubleQuotient = 5.0;
        double doubleModulo = 6.0;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum of " + intOperandA + " and " + intOperandB + " is " + intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference of " + intOperandA + " and " + intOperandB + " is " + intDifference);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient of " + intOperandA + " and " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        System.out.println();

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

        doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("The modulo of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo);

        int childrenInFamily = 2;
        boolean isRaining = false;
        double gasPricePerGallon = 3.49;
        int favNumber = 0;
        double shoeSize = 12.0;
        int birthMonth = 7;
        String fullName = "Kuyper Reynolds";

        System.out.println();
        System.out.println("The number of kids in my family is " + childrenInFamily);
        System.out.println("Is it raining? " + isRaining);
        System.out.println("The price of a gallon of gas is " + gasPricePerGallon);
        System.out.println("My favorite number is " + favNumber);
        System.out.println("My shoe size is " + shoeSize);
        System.out.println("My birth month is " + birthMonth);
        System.out.println("My name is " + fullName);
    }
}