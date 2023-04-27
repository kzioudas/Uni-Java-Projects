import java.util.HashSet;
import java.util.Scanner;
import java.util.HashMap;

public class LetterCount
{
	public static void main(String[] args){
		HashMap<Character,Integer> myMap = new HashMap<Character,Integer>();
		Scanner input1 = new Scanner(System.in);
		int counter = 0;
		System.out.println("Please enter a long string of characters and hit <ENTER>");
		String strA = input1.nextLine();
		while(counter<strA.length()){
			char chara = strA.charAt(counter);
			if(!myMap.containsKey(chara)){
				myMap.put(chara,1);
				counter ++;
			}
			else{
				int number = myMap.get(chara);
				number ++;
				myMap.put(chara,number);
				counter ++;
			}
		}
		HashSet<Character> mySet = new HashSet<Character>();
		Scanner input2 = new Scanner(System.in);
		int i = 0;
		System.out.println("Now enter a word and hit <ENTER>");
		String strB = input2.next();
		while(i<strB.length()){
			char b = strB.charAt(i);
			if(!mySet.contains(b)){
				mySet.add(b);
				i++;
			}
			else{
				i++;
			}
		}
		System.out.println("The frequences of the word's letters in the string are as follows:");
		for(char y: mySet){
			if(myMap.containsKey(y)){
				System.out.println(y+": "+myMap.get(y));
			}
			else{
				System.out.println(y+": "+0);
			}
		}
	}
}
