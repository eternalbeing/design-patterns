package creational.builder;

public class BankAccount {

    private String name;
    private String accountNumber;
    private String email;
    private boolean newsLetter;

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getEmail() {
        return email;
    }

    public boolean isNewsLetter() {
        return newsLetter;
    }

    private BankAccount(){

    }

    private BankAccount(BankAccountBuilder builder){

        this.name = builder.name;
        this.accountNumber = builder.accountNumber;
        this.email = builder.email;
        this.newsLetter = builder.newsLetter;

    }


    public static class BankAccountBuilder {

        private String name;
        private String accountNumber;
        private String email;
        private boolean newsLetter;

        public BankAccountBuilder setName(String name){
            this.name = name;
            return this;
        }

        public BankAccountBuilder setAccountNumber(String accountNumber){
            this.accountNumber = accountNumber;
            return this;
        }

        public BankAccountBuilder setEmail(String email){
            this.email = email;
            return this;
        }

        public BankAccountBuilder setNewsLetter(boolean newsLetter){
            this.newsLetter = newsLetter;
            return this;
        }


        public BankAccount build(){
            return new BankAccount(this);
        }


    }


}
