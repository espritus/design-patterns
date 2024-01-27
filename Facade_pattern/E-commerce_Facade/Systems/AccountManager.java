package project.com.Systems;

import project.com.Items.AccountInfo;
import project.com.Items.Order;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {

    private final List<AccountInfo> userList = new ArrayList<>();

    public AccountInfo getUserByUsername(String username) {
        for (AccountInfo accountInfo : userList) {
            if (accountInfo.getUsername().equals(username)) {
                return accountInfo;
            }
        }
        return null;

    }

    public void createAccount(String name, String cardData){
        if(verifyCard(cardData)){
            AccountInfo account = new AccountInfo(name, "verified");
            userList.add(account);
        }
        else{
            System.out.println("We are sorry, the system cannot create an account");
        }

    }
    public boolean verifyCard(String cardData){
        return cardData.equals("MasterCard") || cardData.equals("Visa");

    }
    public List<Order> orderHistory(AccountInfo account){
         return account.getOrders();
    }

    public void addOrder(AccountInfo account,Order order) {
        account.addOrder(order);
    }

}
