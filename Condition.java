public class Condition {
    public static void main(String[] args) {

        String name = "Ram";
        int exp = 4;
        boolean tier1 = true;

        boolean cond1 = exp <= 3;
        System.out.println(cond1);
        System.out.println(tier1);
        System.out.println(tier1 || cond1);
        System.out.println(cond1 && tier1);
    }
}
