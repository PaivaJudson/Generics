class Program{
    public static void main(String[] args) {
        
        PrintService<Integer> printService = new PrintService<>();

        printService.addValue(45);
        System.out.println(printService.first());
    }
}