import java.util.List;
import java.util.Arrays;

public class waefwafs {



        public static void main(String[] args) {
//            System.out.print("alma");
//            System.out.println();
//            System.out.print("körte");



           // int[] numbers = new int[10];
         //   int y = Math.sqrt(10);
//            System.out.println(y);


//            int x = 5;
//            int y = 2;
//            int z = x++ + (x - 4) * y - 2;
//            System.out.println(x);
//            System.out.println(x + " " + z);

//            int a = 10;
//            double b = (15 - a) / 2 * (double) 3;
//            System.out.println(b);
//
//            System.out.println((-38 % 3 == 2));
//            System.out.println((67 % 7 == 0));
//            System.out.println( !true);

//            System.out.println('m' < 'q');
//            System.out.println('A' == 65);
//            System.out.println('g' == (int)'g');
//            System.out.println('é' < 'm');

//            System.out.println(Character.isAlphabetic('e'));
//
//            System.out.println(Character.isDigit(9));
//
//
//            System.out.println(Character.isWhitespace('\r'));
//
//
//            System.out.println(Character.isWhitespace(' '));

//            int number = String.valueOf(12);


//
//            int number = (int)"3123";
//
//
//
//            Integer number = String.toInteger("3");
//
//
//
//            long number = Integer.parseInt("4");

//            System.out.println("6" + "5");
//
//            System.out.println((int) 'A');
//
//            System.out.print((int) "65");
//
//            System.out.print(Integer.parseInt("65"));

//            List fruits = Arrays.asList("alma", "körte", "barack");
//            StringBuilder sb = new StringBuilder();
//            for (int i = 0; i < fruits.size(); i++) {
//                if (i != 0) {
//                    sb.append(", ");
//                }
//                sb.append(fruits.get(i));
//            }
//            System.out.println(sb);

//            List fruits = Arrays.asList("alma", "körte", "barack");
//            StringBuilder sb = new StringBuilder();
//            for (int i = 0; i < fruits.size(); i++) {
//                sb.append(fruits.get(i));
//                sb.append(", ");
//            }
//            System.out.println(sb);

//            StringBuilder sb = new StringBuilder();
//            sb.append("alma").append(", ").append("körte").append(", ").append("barack");
//            System.out.println(sb);

//            List fruits = Arrays.asList("alma", "körte", "barack");
//            StringBuilder sb = new StringBuilder();
//            for (int i = 0; i < fruits.size(); i++) {
//                sb.append(fruits.get(i));
//                if (i != (fruits.size() - 1)) {
//                    sb.append(", ");
//                }
//            }
//            System.out.println(sb);
//            String password1 = "John123";
//            String password2 = "John123";
//
//
//            System.out.println(password1 == password2);
//            System.out.println(password1.toUpperCase() == password2.toUpperCase());
//            System.out.println(password1.toUpperCase().equals( password2.toUpperCase()) );
//
//            password2 = "blalbla";
//            password1 = "blalbla";
//            System.out.println(password1 == password2);
//            System.out.println(password1.toUpperCase() == password2.toUpperCase());

            int stamina = 30;
            int power;

            if(stamina <= 10) {
                power = 1;
            } else if(stamina <= 30) {
                power = 2;
            } else if(stamina <= 80) {
                power = 3;} else {
                power = 4;
            }
            System.out.println(power);

            int number = 5;
            while(number < 20) {
                number += 3;
            }
            System.out.println(number);

            for(int i = 2; i < 5; i++) {
                System.out.println("in");
            }
            String name = "Joe";
            String spouse = "Jean";
            switch(name) {
                case "John":
                    spouse = "Eve";
                case "Joe":
                    spouse = "Sarah";
                case "Jake":
                    spouse = "Mary";
            }
            System.out.println(spouse);
        }

    }

