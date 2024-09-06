public class LogicOperators {
    public static void main(String[] args) {
        boolean first_value = true;
        boolean second_value = false;
        boolean third_value = true;
        boolean fourth_value = false;
        // &&(* and *) > true when both = true
        System.out.println(first_value&&second_value);
        System.out.println(first_value&&third_value);
        // ||(* or *) > true when 1 value = true
        System.out.println(first_value||second_value);
        System.out.println(second_value||fourth_value);
        // !(not *) > value reverse
        System.out.println(!first_value);
        System.out.println(!second_value);
    }
}
