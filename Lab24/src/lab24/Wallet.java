package lab24;

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
      walletContents.printFirstToLast(walletContents.getHead().next);
      System.out.println("_____________");
      walletContents.printReverse(walletContents.getHead().next);
      
      System.out.println("___________");
      System.out.println("Sum with recurr: " + walletContents.sumWalletRecur(walletContents.getHead().next, 0.0f));
      System.out.println("Sum with Quarter: " + walletContents.sumQuarter(walletContents.getHead(), 0.0f));
   }

   public String getValue() {

      return Float.toString(walletContents.sumWallet());

   }
}
