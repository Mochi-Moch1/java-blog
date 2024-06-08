package basic;

public class Comment {
    public static void main(String[] args) {
        // 変数に代入
        String title = "Mochi Blog";
        
        System.out.println(title); // Mochi Blogと表示する

        // System.out.println("Mochi Blog");


        /* 
        コメントアウト
        String title = "Mochi Blog";
        
        System.out.println(title);
        */

    }
    /**
     * printerメソッド
     * @param 引数なし
     * @return 戻り値なし
     */
    public static void printer(){
        System.err.println("Mochi Blog");
    }
}
