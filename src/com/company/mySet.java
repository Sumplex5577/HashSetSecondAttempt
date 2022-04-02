package com.company;

public interface mySet <E> {
    boolean add(String e) throws Exception;

    void clear() throws Exception;

    boolean contains(String o) throws Exception;

    boolean isEmpty();

    boolean remove(String o) throws Exception;

    int size();

    String[] toArray();

}
