package Adapter;//AdpaterCLass

public class BankCustomer extends BankClass implements CreditCard
{


    public void giveBankdetails() {
    setAccountNumber("123");
    setBranch("ABC");
    setIfscCode(1334);
    }

    public String getCreditCard() {

        return new StringBuilder().append(getAccountNumber()).append(getBranch()).append(getIfscCode()).toString();
    }
}
