/*
 * import java.util.ArrayList;
 *
 * public class ListArray {
 *
 * public static void main(String[] args) { ArrayList<Object> myList = new
 * ArrayList<Object>(); myList.add("13"); myList.add("hello world");
 * myList.add(48); myList.add("Goodbye World");
 *
 * for(int i = 0; i < myList.size(); i++) { try { Integer castedValue =
 * (Integer) myList.get(i); } catch(ClassCastException e ) {
 * System.out.println(e); } } System.out.println("Finished"); } }
 */
import java.util.ArrayList;

public class ListArray {

    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for (Object o : myList) {
            try {
                if (o instanceof Integer castedValue) {
                    System.out.println(castedValue);
                } else if (o instanceof String) {
                    Integer parsedValue = Integer.parseInt((String) o);
                    System.out.println(parsedValue);
                }
            } catch (NumberFormatException e) {
                System.out.println("Unable to parse String to Integer: " + o);
            }
        }
        System.out.println("Finished");
    }
}

// This code first checks if the element is an instance of Integer. If it is, 
// it directly casts the value and prints it. If it's a String, it attempts to 
// parse it into an Integer. If parsing fails (due to non-integer strings), a 
// NumberFormatException is caught and an error message is printed.

//   for(int i = 0; i < myList.size(); i++) {
//        try {
//Object obj = myList.get(i);
//                if (obj instanceof Integer) {
//Integer castedValue = (Integer) obj;
//                    System.out.println(castedValue);
//                } else if (obj instanceof String) {
//Integer parsedValue = Integer.parseInt((String) obj);
//                    System.out.println(parsedValue);
//                }
//                        } catch (NumberFormatException e) {
//        System.out.println("Unable to parse String to Integer: " + myList.get(i));
//        }
//        }
//        System.out.println("Finished");

