// is-Aの関係とインスタンスへの参照 (メソッドの引数で検証)

class TimeAccountTester1 {

    // どちらの預金残高が多いか
    static int compBalance(Account a, Account b) {
        if (a.getBalance() > b.getBalance())        // aの方が多い
            return 1;
        else if (a.getBalance() < b.getBalance())   // bの方が多い
            return -1;
        return 0;
    }

    public static void main(String[] args) {
        Account adachi = new Account("足立幸一", "123456", 1000);
        TimeAccount nakata = new TimeAccount("仲田真二", "654321", 200, 500);

        switch (compBalance(adachi, nakata)) {
            case 0 : System.out.println("足立君と仲田君の預金残高は同じ."); break;
            case 1 : System.out.println("足立君の方が預金残高が多い.");    break;
            case -1: System.out.println("仲田君の方が預金残高が多い.");    break;
        }
    }
}
