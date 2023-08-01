class PatternEg {

    // Pyramid example with decreasing order
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) { // Outer loop
            for (int j = 5; j >= i; j--) { // Inner loop
                System.out.print(" $ "); // Print stmt
            }
            System.out.println(); // New line
        }

        System.out.println("-----------------"); // Added semicolon here

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println(); // New line
        }
    }
}
