import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrieImplementation {

	private static final int ALPHABETS_COUNT = 26;
	private static final char START_CHAR = 'a';
	TrieNode[] trie = new TrieNode[ALPHABETS_COUNT];

	static class TrieNode {
		TrieNode[] children = new TrieNode[ALPHABETS_COUNT];
		boolean isEndOfWord;

		public TrieNode() {

		}

		public void setChildren(TrieNode[] children) {
			this.children = children;
		}

		public void setEndOfWord(boolean endOfWord) {
			isEndOfWord = endOfWord;
		}

		public TrieNode[] getChildren() {
			return children;
		}

		public boolean isEndOfWord() {
			return isEndOfWord;
		}
	}

	public void insert(String word) {
		char[] arr = word.toCharArray();
		if (arr.length == 0) {
			return;
		}
		TrieNode[] trie = this.trie;
		TrieNode node = null;
		for (char x : arr) {
			node = trie[x - START_CHAR];
			if (node == null) {
				node = new TrieNode();
				trie[x - START_CHAR] = node;
			}
			trie = node.getChildren();
		}
		node.setEndOfWord(true);
	}

	public boolean search(String word) {
		char[] arr = word.toCharArray();
		if (arr.length == 0) {
			return true;
		}
		TrieNode[] trie = this.trie;
		TrieNode node = null;
		for (char x : arr) {
			node = trie[x - START_CHAR];
			if (node == null) {
				return false;
			}
			trie = node.getChildren();
		}
		return node.isEndOfWord;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		TrieImplementation t = new TrieImplementation();
		while (true) {
			System.out.println("choose appropriate option: \n 1. Insert word \n 2. Find word");
			int o = Integer.parseInt(bf.readLine());
			String word = bf.readLine().trim();
			if (o == 1) {
				t.insert(word);
			} else {
				if (t.search(word)) {
					System.out.println("Word Found!!!");
				} else {
					System.out.println("Word NOT Found!!!");
				}
			}
		}
	}
}
