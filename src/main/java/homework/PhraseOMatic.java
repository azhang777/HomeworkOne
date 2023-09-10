package homework;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"Sweet", "Fresh", "Tasty", "Juicy", "Ripe", "Tart", "Delicious",
                                "Tropical", "Citrusy", "Exotic", "Zesty", "Aromatic", "Crisp"};
        String[] wordListTwo = {"Red", "Yellow", "Green", "Purple", "Orange", "Pink",
                                "Gold", "Blue", "Brown", "Lavender", "Turquoise"};
        String[] wordListThree = {"Apple", "Banana", "Orange", "Grape", "Berry", "Pear", "Kiwi",
                                  "Mango", "Pineapple", "Lemon", "Watermelon", "Papaya"};

        int listLengthOne = wordListOne.length;
        int listLengthTwo = wordListTwo.length;
        int listLengthThree = wordListThree.length;

        int randOne = (int) (Math.random() * listLengthOne);
        int randTwo = (int) (Math.random() * listLengthTwo);
        int randThree = (int) (Math.random() * listLengthThree);

        String phrase = wordListOne[randOne] + " " + wordListTwo[randTwo] + " " + wordListThree[randThree];

        System.out.println("What we need is a " + phrase + ".");
    }
}
