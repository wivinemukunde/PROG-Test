public abstract Consoles implements IConsole {
    String Store;
    String ConsoleType;

public void Consoles(String Store,String ConsoleType){
    this.Store=Store;
    this.ConsoleType=ConsoleType;

    @Override
    public String getConsoleType(){return ConsoleType;}
    @Override
            public String getStore(){return Store;}
    @Override
            public String getTotalSales(){return TotalSales;}
    public abstract void printReport();


}