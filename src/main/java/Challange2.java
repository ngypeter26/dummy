public class Challange2 {
    public boolean evenXAndO(String str){
        char[] strChar = str.toUpperCase().toCharArray();
        int numberOfX = 0;
        int numberOfO = 0;

        for (char i : strChar) {
            numberOfX += i == 'X' ? 1 : 0;
            numberOfO += i == 'O' ? 1 : 0;
        }
        return numberOfX == numberOfO;
    }

    public static void main(String[] args) {
        Challange2 challange2 = new Challange2();

        System.out.println(challange2.evenXAndO("ooxx"));
        System.out.println(challange2.evenXAndO("xooxx"));
        System.out.println(challange2.evenXAndO("ooxXm"));
        System.out.println(challange2.evenXAndO("zpzpzpp"));
        System.out.println(challange2.evenXAndO("zzoo"));
    }
}
