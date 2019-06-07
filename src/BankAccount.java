public class BankAccount {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    private Person person;

    public BankAccount(int balance, Person person) {
        this.balance = balance;
        if(person==null){
            throw new NullPointerException();
        }else{
        this.person = person;
    }}


    void deposit(int value){
        balance+=value;
    }

    void withdraw(int value){
        if(balance>=value) {
            if(value<balance/2) {
                balance -= value;
            }else{
                throw new ToMuchForOneTransaction("To much for one transaction");
            }
        }else{
            throw new NotEnoughBalanceException("Not enought money on account, balance: "+balance +
                    " withdraw: "+value);
        }
    }

}
