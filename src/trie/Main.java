package trie;

public class Main {
    public static void main(String[] args){
        Trie trie = new Trie();

        trie.insert("test");
        trie.insert("busy");
        trie.insert("card");
        trie.insert("cap");

        System.out.println(trie.search("busy"));
        System.out.println(trie.search("bus"));
    }
}
