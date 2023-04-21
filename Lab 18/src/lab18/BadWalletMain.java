package lab18;

public class BadWalletMain {
   
   static String[] dataSource =  {"B5","Q","B18","Q","B10","P","N","BAD","D","Q","D"};
   static Wallet myWallet = new Wallet();
   
   public static void main (String[] args) {
   // try / catch begins here 
      
      for (int i=0;i<dataSource.length;i++){
         try {
            char dataItem = dataSource[i].charAt(0);
            if (dataItem == 'B') {
               int billValue= Integer.parseInt(dataSource[i].substring(1,dataSource[i].length()));
               myWallet.addToWallet(new Bill(billValue));
            }   
            else
               if (dataItem == 'Q')
                  myWallet.addToWallet(new Quarter());
               else
               if (dataItem == 'D')
                  myWallet.addToWallet(new Dime());
               else
               if (dataItem == 'N')
                  myWallet.addToWallet(new Nickel());
               else
               if (dataItem == 'P')
                  myWallet.addToWallet(new Penny());
            
         } catch(IllegalBillException ibe) {
            System.out.println(ibe.getMessage());
         } catch (NumberFormatException nfe) {
            System.out.print(nfe.getMessage());
            System.out.println(" and you cannot add String as a bill or coin");
         }
         
         }
      
	  myWallet.print();
	  System.out.println("My wallet contains: $"+myWallet.getValue());
   }
   
   }

