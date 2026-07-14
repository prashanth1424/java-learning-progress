class try_check {
    public static void main(String[] args) {
        try{
            int quantity = Integer.parseInt("abc");
            double price = 100.0;
            double total = quantity * price;
            System.out.println("Total: " + total);
        } catch (NumberFormatException e) {
            System.out.println("invalid quantity format");
            System.out.println("Using default quantity of 1");
            double price = 100.0;
            double total = 1 * price;
            System.out.println("Total: " + total);
        }
    System.out.println("Program continues after the try-catch block.");
    }

}
