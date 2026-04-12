public class HelloApp {
    public static void main(String[] args) {
        // Check if any arguments were provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder names = new StringBuilder();
            
            // Use enhanced for loop to iterate through arguments
            for (int i = 0; i < args.length; i++) {
                names.append(args[i]);
                
                // Add a comma and space if it's not the last element
                if (i < args.length - 1) {
                    names.append(", ");
                }
            }
            
            System.out.println("Hello, " + names.toString() + "!");
        }
    }
}