package trie;

public class Main {
    public static void main(String[] args){
        Trie trie = new Trie();

        trie.insert("get");
        trie.insert("go");
        trie.insert("got");
        trie.insert("gotten");
        trie.insert("hall");
        trie.insert("ham");
        trie.insert("hammer");
        trie.insert("hill");
        trie.insert("zebra");

        trie.printAll();
    }
}