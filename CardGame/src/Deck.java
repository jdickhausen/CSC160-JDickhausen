/*
 * Copyright (c) 2022 Joshua Dickhausen
 */

import java.util.Arrays;
import java.util.Random;

/** 
 *this deck models a deck of cards and adds methods to manipulate the deck
 * @author Joshua Dickhausen
 *
 */

public class Deck {
	/**
	 * Card array holds each card of the deck
	 */
	public Card[] cards;
	private static final Random random = new Random();
	
	/**
	 * initializes a deck of 52 cards
	 */
	public Deck () {
		this.cards = new Card [52];
		int index = 0;
		for (int i = 0; i < 4; i ++) {
			for (int j = 1; j < 14; j++) {
				cards[index] = new Card(j, i);
				index++;
			}
		}
	}
	/**
	 * initializes array and does not assign any specific number of cards 
	 * @param n is number of cards
	 */
	public Deck (int n) {
		this.cards = new Card[n];
	}
	public Deck subdeck(int start, int end) {
		Deck subdeck = new Deck (end - start +1);
		for (int i = start, j = 0; i <= end; i++, j++) {
			subdeck.cards[j] = this.cards[i];
		}
		return subdeck;
	}
	/**
	 * return cards as a String
	 */
	public String toString() {
		return Arrays.toString(this.cards);
	}
	/**
	 * getting random number
	 * @param low
	 * @param high
	 * @return random integer that represents card
	 */
	public static int randomInt(int low, int high){
	      return random.nextInt(Math.max(high,low) - Math.min(high,low) + 1) + low;
	}
	/**
	 * returns each card of the deck in array cards
	 * @return cards
	 */
	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	/**
	 * swaps cards in the deck
	 * @param i
	 * @param j
	 */
	public void swapCards (int i, int j) {
		Card temp = cards[i];
		cards[i] = cards[j];
		cards[j] = temp;
	}
	/**
	 * shuffles elements in cards array
	 */
	public void shuffle () {
		for (int i = 0; i < cards.length; i++) {
			int j = random.nextInt(cards.length);
			swapCards(i, j);
			
		}
	}
	/**
	 * uses selection sort to put elements of cards array in order
	 * @param n
	 */
	public void selectionSort(int n) {
		for (int i = 0; i < n-1; i++){
			int min_idx = i;
			for (int j = i+1; j < n; j++) {
				if (cards[j].compareTo(cards[min_idx]) < 0) {
					min_idx = j;
				}
			}
			swapCards(min_idx, i);
		}
	}
	public void recursiveSelectionSort() {
		recursiveHelper(cards, 0, cards.length-1);
		
	}
	private void recursiveHelper(Card cards[], int low, int high) {
		if (low < high) {
			int index = low;
			Card min = cards[low];
			for (int i = index+1; i <= high; i++) {
				if (cards[i].compareTo(cards[low]) < 0) {
					index = i;
				}
			}
		}
	} 
	public void mergeSort() {
		mergeHelper(cards, 0, cards.length-1);
	}
	private void mergeHelper(Card cards[], int low, int high) {
		if (low >= high) {
		
		}
		mergeHelper(cards, low,(low+high)/2);
		mergeHelper (cards, ((low + high)/2) + 1, high);
		
	}
}
