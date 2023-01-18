package Trie;

public class trie_1 {
    static class Node{
        Node[] children;
        boolean eow; //end of word
        public Node(){
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }
    static Node root = new Node();
    public  static void insert(String word){
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i)-'a'; // to get index

            if (curr.children[idx] == null)
                curr.children[idx] = new Node(); // add new node
            if (i == word.length()-1)
                curr.children[idx].eow = true;
            curr = curr.children[idx];
        }
    }
    public  static boolean search(String key){ // O(L) : L = key length
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i)-'a';
            Node node = curr.children[idx]; // use node or root.children

            if (node == null)
                return false;
            if (i == key.length()-1 && node.eow == false)
                return false;
            curr = curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String words[] = {"the","a","there","their","any"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        System.out.println(search("thor"));
    }
}
