public class MajorityChecker {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide three Boolean values (true/false).");
            return;
        }
        boolean a = Boolean.parseBoolean(args[0]);
        boolean b = Boolean.parseBoolean(args[1]);
        boolean c = Boolean.parseBoolean(args[2]);
        boolean result = majority(a, b, c);
        System.out.println("The result is "+result);
    }
    public static boolean majority(boolean a, boolean b, boolean c) {
        return (a && b) || (a && c) || (b && c);
    }
}
