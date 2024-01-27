package project.com.Systems;

import project.com.Items.AccountInfo;

public class PaymentProcess {

    public boolean processPayment(AccountInfo account) {
        return account.getCardStatus().equals("verified");
    }

}
