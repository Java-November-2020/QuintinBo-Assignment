package com.quintinbowman.Puzzling_06;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
import java.util.Collections;
import java.util.List;

public class PuzzleJava {

	public static void main(String[] args) {  
		char[] letters ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q',
			'r','s','t','u','v','w','x','y','z'};
		int[] numbers = {3,5,1,2,7,9,8,13,25,32};
		String[] name = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
		
		puzzleArr(numbers, 10);
		arrShuffle(name);
		shuffleLetters(letters);
		randomArray(55,100);
	}
	
	public static ArrayList<Integer> puzzleArr(int[] value, int limit) {
		int sum = 0;
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		for (int i=0; i<value.length; i++) {
			if(value[i] > limit) {
				newArr.add(value[i]);
			}
			sum = sum + value[i];
		}
			System.out.println(sum);
			System.out.println(newArr);
			
		return newArr;
		}
	
	public static String[] arrShuffle(String[] names ) {
		Random r = new Random();
		ArrayList<String> newArr = new ArrayList<String>();
		for (int i=0; i < names.length; i++) {
			String temp = names[i];	
			int index = r.nextInt(names.length - i) + i;
			names[i] = names[index];
			names[index] = temp;
				System.out.print(names[i] + " ");
		if (names[i].length() > 5) {
			newArr.add(names[i]);
			}
			System.out.print(newArr);
		}
		return names;
	}
	
	public static void shuffleLetters(char[] letter) {
		List<char[]> alphabet = Arrays.asList(letter);
			Collections.shuffle(alphabet);
			Character[] letter1 = alphabet.toArray(new Character[alphabet.size()]); 
			System.out.println(String.format("%s is first", letter1[0]));
			System.out.println(String.format("%s is last", letter1[25]));
		
		if (isVowel(letter1[0])) {
		System.out.print("The first element is a Vowel.");
		}
	}
	
	private static boolean isVowel(char letter) {
			Random r = new Random();
			return (
				letter == 'a' ||
				letter == 'e' ||
				letter == 'i' ||
				letter == 'o' ||
				letter == 'u' ||
				letter == 'y' && r.nextInt(2) == 1);
		}
	
	public static void randomArray(int small, int large) {
		int[] ran = new int[10];
		int range = large - small;
		Random puzzle = new Random();
		for(int i = 0; i < ran.length; i++) {
			ran[i] = puzzle.nextInt(range) + small;
		}
		System.out.print(ran);
		Arrays.sort(ran);
		System.out.print(ran);
	}
	
	 public static String[] RandomStringArr() {
	        String[] arr = new String[10];
	        for (int i = 0; i < arr.length; i++)
	            arr[i] = StringManipulator.RandomString(5);
	        	System.out.print(arr);
	        return arr;
		}
}