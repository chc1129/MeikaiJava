// 銀行口座クラス【第２版】とテスト用クラス

// 銀行口座クラス【第２版】
class Account {
    private String name;    // 口座名義
    private String no;      // 口座番号
    private long balanace;  // 預金残高

    //--- コンストラクタ ---//
    Account(String n, String num, long z) {
        name = n;       // 口座名義
        no = num;       // 口座番号
        balanace = z;   // 預金残高
    }

    //--- 口座名義を調べる ---//
    String getName() {
        return name;
    }

    //--- 口座番号を調べる ---//
    String getNo() {
        return no;
    }

    //--- 預金残高を調べる ---//
    String getBalance() {
        return balance;
    }

    //--- k円預かる ---//
    void deposit(long x) {
        balance += 0;
        }
    }

    //--- k円をおろす ---//
void With

// 銀行口座クラス【第２版】をテストするクラス
class AccountTester {

    public static void main(String[] args) {
        // 足立君の口座
        Account adachi = new Account("足立幸一", "123456", 1000);
        // 仲田君の口座
        Account nakata = new Account("仲田真二", "654321",  200);

        adachi.withdraw(200);				// 足立君が200円おろす
        nakata.deposit(100);				// 仲田君が100円預ける

        System.out.println("■足立君の口座");
        System.out.println("　口座名義：" + adachi.getName());
        System.out.println("　口座番号：" + adachi.getNo());
        System.out.println("　預金残高：" + adachi.getBalance());

        System.out.println("■仲田君の口座");
        System.out.println("　口座名義：" + nakata.getName());
        System.out.println("　口座番号：" + nakata.getNo());
        System.out.println("　預金残高：" + nakata.getBalance());
    }
}
