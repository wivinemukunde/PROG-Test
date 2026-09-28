public class ConsoleSales extends Consoles{
    public Consoles(String Store,String ConsoleType){
        super(Store,ConsoleType);

    }
    public void printReport(){
        System.out.println("Console sales Report ");
        System.out.println(" Console type"+ getConsoleType);
        System.out.println("store "+ getStore);
        System.out.println("total "+ getTotalSales);

    }
}
