import java.util.Map;
import java.util.HashMap;

public class TrieNode {
	
	private char data;
	private Map <Character, TrieNode> children;
	private boolean isCompleteWord;

	public TrieNode(char c, boolean isCompleteWord) {
		this.data = c;
		this.children = new HashMap <Character, TrieNode> ();
		this.isCompleteWord = isCompleteWord;
	}

	public void addChild(char child, TrieNode childNode) {
		children.put(child, childNode);
	}

	public int noOfChildren() {
		return children.size();
	}

	public boolean isCompleteWord() {
		return isCompleteWord;
	}
	
}
