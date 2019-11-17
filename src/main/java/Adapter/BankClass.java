package Adapter;

class BankClass
{
    private String AccountNumber;
    private String Branch;
    private int ifscCode;
    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    public int getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(int ifscCode) {
        this.ifscCode = ifscCode;
    }


}