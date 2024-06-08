package basic.print;

public class Print {
    public static void main(String[] args) {
        System.out.println("Mochi");
        System.out.println("Blog");
        // Mochi
        // Blog
        
        System.out.print("Mochi");
        System.out.print("Blog");
        // MochiBlog
        System.out.println();

        String a = "Mochi Blog";
        System.out.println(a);
        // Mochi Blog


        System.out.println("Mochi" + " " + "Blog");
        // Mochi - Blog

        String title = "Mochi Blog";
        System.out.println(title + "を読んでプログラミングスキルを磨こう");
        // Mochi Blogを読んでプログラミングスキルを磨こう

        int[] array = {1, 2, 3};
        System.out.println(array);
        // [I@1dbd16a6

        System.out.println(array[0]);
        // 1
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        // 1
        // 2
        // 3

    }
}
