package com.bible.java.chapter11.donghwan;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyVector implements List {

	Object[] data = null;
	int capacity = 0;
	int size = 0;
	
	public MyVector(int capacity) {
		if(capacity <0){
			throw new IllegalArgumentException("유효하지 않은 값입니다.:"+capacity);
		}
		this.capacity = capacity;
		data = new Object[capacity];
	}
	
	public MyVector() {
		this(10);
	}
	
	public void ensureCapacity(int minCapacity) {
		if(minCapacity - data.length > 0)
			setCapacity(minCapacity);
	}

	private void setCapacity(int capacity) {
		if(this.capacity == capacity) return;
		
		Object[] tmp = new Object[capacity];
		System.arraycopy(data, 0, tmp, 0, size);
		data = tmp;
		this.capacity = capacity;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Object obj) {
		ensureCapacity(size+1);
		data[size++] = obj;
		return true;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		for(int i =0; i < size; i++) {
			data[i] = null;
		}
		size = 0;
	}

	@Override
	public Object get(int index) {
		if(index < 0 || index >= size)
				throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		return data[index];
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object remove(int index) {
		Object oldObj = null;
		
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
}
