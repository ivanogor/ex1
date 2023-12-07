public class Main {
    public static void main(String[] args) {
        System.out.println(task("101"));
    }

    public static boolean task(String word){
        word = word.toLowerCase();
        for (int i = 0; i < word.length() / 2; i++){
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}

