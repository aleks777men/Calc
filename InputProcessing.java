
public class InputProcessing {
    static String[] validValues = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    static String[] validValuesR = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    static String[] operators = new String[]{"+", "-", "*", "/"};
    static String[] arr = new String[3];
    static int operand1, operand2;
    static int result = -1;
    static String[] operands = new String[2];
    static int num = 0;
    static int count = 0;





    public static int calc(String str) {
       for (String operator: operators){
           int index = str.indexOf(operator);
           if (index != -1) {
               operands = str.split(String.format("\\%s", operator));
               arr[0] = operands[0];
               arr[2] = operands[1];
               arr[1] = operator;
           }

       }
       for(String el: arr){
           for (String value: validValuesR){
               if (el.equals(value) == true){
                   arr[num] = converter(arr[num]);
                    count++;
               }
           }
           num++;
       }
       if (count == 1|count > 2) myExeption();
        for (String el: arr){
            str ="";
            str += el;
        }

        String firstChar = ""+str.charAt(0);
        String lastChar = ""+str.charAt(str.length() - 1);

        for (String operator : operators) {
            int index = str.indexOf(operator);
            if (index != -1) {
                operands = str.split(String.format("\\%s", operator));
                arr[0] = operands[0];
                arr[2] = operands[1];
                arr[1] = operator;
            }
        }


        for (int i = 0; i < 10; i++){
            int index = str.indexOf(validValues[i]);
            if (index != -1){
                operand1 = Integer.parseInt (arr[0]);
                operand2 = Integer.parseInt (arr[2]);

                if (operands.length > 2||operand1 > 10||operand1<1||operand2 > 10||operand1<1)myExeption();
                switch(arr[1]){
                    case "+":
                        result = operand1 + operand2;
                        return result;
                    case "-":
                        result = operand1 - operand2;
                        return result;
                    case "/":
                        result = operand1 / operand2;
                        return result;
                    case "*":
                        result = operand1 * operand2;
                        return result;
                }

            }


        }
        System.out.println("!");
        if (result == -1) myExeption();
        return result;

    }

    public static String converter(String str){

        switch(str){
            case "I": str = "1";
                break;
            case "II": str = "2";
                break;
            case "III": str = "3";
                break;
            case "IV": str = "4";
                break;
            case "V": str = "5";
                break;
            case "VI": str = "6";
                break;
            case "VII": str = "7";
                break;
            case "VIII": str = "8";
                break;
            case "IX": str = "9";
                break;
            case "X": str = "10";

        }
        return str;
    }



    public static void myExeption(){

        int[] a = new int[2];
        int b = a[2];

    }



}
