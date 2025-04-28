package kadai_021;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        String[] words = {"apple", "banana", "grape", "orange"};

        for (String word : words) {
            String meaning = dictionary.searchWord(word);


            if (meaning.equals("辞書に登録されていません")) {
                System.out.println(word + "は辞書に存在しません");
            } else {
                System.out.println(word + "の意味は" + meaning);
            }
        }
    }
}
