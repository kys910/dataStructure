package trie;

import java.util.HashMap;
import java.util.Map;

public class Node {
    // 자식노드
    Map<Character, Node> chiledNode = new HashMap<Character, Node>();
    // 단어의 끝인지 아닌지 체크
    boolean endOfword;
}
