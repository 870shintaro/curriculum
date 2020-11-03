package study;

// ① TaskクラスにCalculatorクラスを継承させなさい。
public class Task extends Calculator {

    /**
     * タスクの実行
     */
    public void doTask() {
        Calculator task = new Calculator();
        int taskValue1 = task.plus(10);
        int taskValue2 = task.plus(10, 20);
        int taskValue3 = task.plus(10, 20, 30);
        System.out.println("plusメゾットの因数が一つの場合" + (taskValue1));
        System.out.println("plusメゾットの因数が二つの場合" + (taskValue2));
        System.out.println("plusメゾットの因数が三つの場合" + (taskValue3));
        // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
        // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。

    }
}