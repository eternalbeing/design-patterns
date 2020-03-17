package creational.builder;

public class Client {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount.BankAccountBuilder()
                .setName("Goga Master")
                .setAccountNumber("123333333")
                .setEmail("gaga@gmail.com")
                .setNewsLetter(false)
                .build();
        System.out.println(bankAccount.getName());

    }

}
