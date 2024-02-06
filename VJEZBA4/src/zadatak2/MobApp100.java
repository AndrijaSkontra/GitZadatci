package zadatak2;

public class MobApp100 {
    public static void main(String[] args) {
        Account checkingAccount = new CheckingAccount();
        Account foreignCurrencyAccount = new ForeignCurrencyAccount();

        MobAppInvoker invoker = new MobAppInvoker();

        invoker.executeCommand(new DepositMoney(checkingAccount, 100));
        invoker.executeCommand(new WithdrawMoney(foreignCurrencyAccount, 50));

        invoker.undo();
        invoker.redo();
    }
}
