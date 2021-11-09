public class Challenge {

    public int sumBetween(int a, int b){
            int diff = a <=b ? 1 : -1;
            int sum = 0;
            for (int i=a;i<b+1; i +=diff){
                sum += i;
            }
        return sum;
    }

    public static void main(String[] args) {
        Challenge challenge = new Challenge();

        System.out.println(challenge.sumBetween(1,0));
        System.out.println(challenge.sumBetween(1,2));
        System.out.println(challenge.sumBetween(0,1));
        System.out.println(challenge.sumBetween(1,1));
        System.out.println(challenge.sumBetween(-1,2));
    }
}
