package lab18;

import java.util.*;

public class Wallet {
   private MoneyList walletContents = new MoneyList();
   ArrayList<Integer> billList = new ArrayList();

   public Wallet() {

      billList.add(1);
      billList.add(5);
      billList.add(10);
      billList.add(20);
      billList.add(50);
      billList.add(100);

   }

   public void addToWallet(Money m) {
      if (!billList.contains(m.getValue()) && m instanceof Bill) {
         throw new IllegalBillException(m.getValue() + " is Bad bill value");
      }
      walletContents.append(m);
   }

   public void print() {
      System.out.println(walletContents.toString());
   }

   public String getValue() {

      return Float.toString(walletContents.sumWallet()) ;

   }
}
