package telran.arrays;

import java.util.Arrays;

public class ArrayChar {
	private char[] array;
	
	public ArrayChar(char[] array) {
		this.array = array;
	}
	
	public int compareTo(ArrayChar another) {
		int length = Math.min(this.array.length, another.array.length);
		int index = 0;

		while(index < length && this.array[index] == another.array[index]) {
			
			index++;
		}
		
		return index == length ?  this.array.length - another.array.length : 
			this.array[index] - another.array[index];
	}
	
	public int indexOf(char character) {
		int index = 0;
		
		while(index < array.length && array[index] != character) {			
			index++;
		}
		
		return index == array.length ?  -1 : index;
	}
	
	public int lastIndexOf(char character) {
		int index = array.length -1;
		
		while(index > -1 && array[index] != character) {			
			index--;
		}
		
		return index;
	}
	
	public int count(char character) {
		int countOfChar = 0;
		for(int i = 0; i < this.array.length; i++) {
			if (this.array[i] == character) countOfChar++;
		}
		
		return countOfChar;
	}
	
	public int compareToIgnoreCase(ArrayChar another) {
		int length = Math.min(this.array.length, another.array.length);
		int index = 0;
		
		while(index < length && 
				Character.toLowerCase(this.array[index]) == 
				Character.toLowerCase(another.array[index])) {
			
			index++;
		}
		
		
		return index == length ?  this.array.length - another.array.length : 
			Character.toLowerCase(this.array[index]) - Character.toLowerCase(another.array[index]);
	}
	
	public boolean contains(char character) {
		int index = 0;
		
		while(index < array.length && array[index] != character) {			
			index++;
		}
		
		return index == array.length ? false : true;
	}
	
	public boolean equals(ArrayChar another) {
		int result = this.compareTo(another);
		return result == 0 ? true : false;
	}
	
	public boolean equalsIgnoreCase(ArrayChar another) {
		int result = this.compareToIgnoreCase(another);
		return result == 0 ? true : false;
	}	
}
