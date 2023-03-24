package lab17;

public class MoneyMain {

   static String[] dataSource = { "B5", "Q", "B20", "Q", "N", "P", "D" };
   static Money[] wallet = new Money[dataSource.length];

   public static void main(String[] args) {

      for (int i = 0; i < dataSource.length; i++) {
         char dataItem = dataSource[i].charAt(0);
         if (dataItem == 'B') {
            int billValue = Integer.parseInt(dataSource[i].substring(1, dataSource[i].length()));
            wallet[i] = new Bill(billValue);
         } else if (dataItem == 'Q')
            wallet[i] = new Quarter();
         else if (dataItem == 'P') {
            wallet[i] = new Penny();
         } else if (dataItem == 'N') {
            wallet[i] = new Nickel();
         } else if (dataItem == 'D') {
            wallet[i] = new Dime();
         }
      }
      printWallet();
      System.out.println(sumWallet());
   }

   public static void printWallet() {
      for (int i = 0; i < wallet.length; i++) {
         if (wallet[i] instanceof Bill)
            System.out.println(wallet[i]);
         else
            System.out.println(wallet[i]);

      }
   }

   public static float sumWallet() {
      float total = 0.0f;
      

      for (int i = 0; i < wallet.length; i++) {
         if (wallet[i] instanceof Bill)
            total += wallet[i].getValue();
         else
            total += wallet[i].getValue() / 100.0f;

      }

      return total;
   }
}
