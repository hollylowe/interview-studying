/*********
PERFORMANCE: best case O(1)
			 worst case O(n)

This implementation uses linear collision resolution which doesn't have the best perfomrance. 

Other solutions: 
	- make all buckets of hashtable actually linked lists 
	- make a bigger hashtable and rehash

********/


public class hashTable {

	private class hashEntry {

		private int key; 
		private int value; 

		public hashEntry(int key, int value){
			this.key = key; 
			this.value = value; 
		}

		public int getKey(){
			return key; 
		}
		public int getValue(){
			return value;
		}
	}

	private static final int TABLE_SIZE = 128; 

	hashEntry[] table; 

	public hashTable(){
		table = new hashEntry[TABLE_SIZE];

		// initialize teh hashtable to nulls 
		for (int i = 0; i < TABLE_SIZE; i++){
			table[i] = null; 
		}
	}

	public int get(int key){
		//compute the hash; 
		int hash = key % TABLE_SIZE;


		while (table[hash] != null && table[hash].getKey() != key){
			hash = hash + 1 % TABLE_SIZE; 
		}
		//not found. 
		if (table[hash] == null){
			return -1; 
		}
		return table[hash].getValue();
	}

	public void put(int key, int value){
		int hash = key % TABLE_SIZE; 

		while (table[hash] != null && table[hash].getKey() != key){
			hash = hash + 1 % TABLE_SIZE; 
		}

		table[hash] = new hashEntry(key, value);

	}

	public static void main (String [] args){
		hashTable ht = new hashTable(); 

		ht.put(1,2);
		ht.put(4,5);
		System.out.println(ht.get(3)); 
	}



}











