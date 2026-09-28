//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String[] cities={"Cape Town","Port Elizabeth","Pretoria"};
    String[] catogeries={"PS5","XBOX","SWITCH"};
    int[][] sales={{1000,2000,3000},{2000,3000,4000},{1500,1100,1200}};
    int max=sales[0][0];
    int total=0;

    System.out.println("-------------------------------------------------------------------------------------");
    System.out.println("Gaming Console Report");
    System.out.println("--------------------------------------------------------------------------------------");


    for (int i=0;i< cities.length;i++){
        System.out.printf("%-18s",cities[i]);
    }
    System.out.println();
    for (int i=0;i< catogeries.length;i++){
        System.out.printf("%-18s",catogeries[i]);
        for (int j = 0; j <sales.length; j++){
            System.out.printf("%-18s",sales[i][j]);
             total=sales[i][j];
             if(total>max){
                 max=sales[i][j];

                 System.out.println("City with the most sales: "+cities[i]);
                 System.out.println("-------------------------------------------------------------------------------------");
                 System.out.println("Console Sales Totals for each city");
                 System.out.println("--------------------------------------------------------------------------------------");
             }


             }
    }

}
