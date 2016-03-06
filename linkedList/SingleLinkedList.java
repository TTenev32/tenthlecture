package com.tenthlecture.linkedList;


import java.util.NoSuchElementException;

public class SingleLinkedList<T> {
	
	static class Item<T>{
		T data;
		Item<T> next;
		
		public Item(T data){
			this(data, null);
		}
		
		public Item(T data, Item<T> next){
			this.data = data;
			this.next = next;
		}
		public Item<T> getNext(){
			return next;
		}
		
		public void setNext(Item<T> next){
			this.next= next;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}
	}

	Item<T> head;
	int length;
	
	public SingleLinkedList(){
		this.head = new Item<T>(null, null);
		this.length =0;
	}

	
	public void addLast(T data){
		
		if (head == null){
			head = new Item<T>(data);
			length++;
			return;
		}
		Item<T> currentItem = head;
		while (head.getNext() != null ){
			currentItem =  currentItem.getNext();
		}
		currentItem.setNext(new Item<T>(data));
		length++;
	}
	
	public T getAt(int index) throws ArrayIndexOutOfBoundsException{
		if(length == 0 || length < index){
			throw new ArrayIndexOutOfBoundsException();
		}
		Item<T> itemAt = head;
		for(int i = 0; i < index; i++){
			itemAt = itemAt.getNext();
		}
		return itemAt.getData();
	}
	
	public void printAll(){
		Item<T> currentItem = head;
		while (head.getNext() != null ){
			System.out.println("CurrentItem data: " + currentItem.getData());
			currentItem =  currentItem.getNext();
		}
		System.out.println("CurrentItem data: " + currentItem.getData());
	}
	
	public T removeLast() throws NoSuchElementException{
		T ret;
		if (length == 0){
			throw new NoSuchElementException();
		}
		if(length == 1){
			head = null;
			ret = head.getData();
			return ret;
		}
		Item<T> currentItem = head;
		Item<T> deletedItem = currentItem;
		while(currentItem.getNext() != null){
			deletedItem = currentItem; 
			currentItem = currentItem.getNext();
		}
		ret = currentItem.getData();
		currentItem = null;
		deletedItem.setNext(null);
		length--;
		return ret;
	}
}	
