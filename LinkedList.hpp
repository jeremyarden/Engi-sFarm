//
//  LinkedList.hpp
//  Engi's Farm
//
//  Created by Abiyyu Ismunandar on 3/17/19.
//  Copyright © 2019 Abiyyu Ismunandar. All rights reserved.
//

#ifndef LinkedList_hpp
#define LinkedList_hpp

#include <stdio.h>
#include <vector>


template<class T>
/**
 LinkedList class. Array generik untuk dipakai dalam permainan.
 */
class LinkedList{
private:
    T *arr;
    int size;
    int neff;
public:
    /**
     Constructor user defined untuk set size
     */
    LinkedList(int _size)
    {
        neff = 0;
        size = _size;
        arr = new T[size];
    }
    ~LinkedList()
    {
        neff = 0;
        size = 0;
        free(arr);
    }
    /**
     Me-return size LinkedList
     */
    int getSize()
    {
        return size;
    }
    /**
     Me-return neff LinkedList
     */
    int getNeff()
    {
        return neff;
    }
    /**
     Mengembalikan indeks dimana elemen ditemukan, -1 jika tidak ada
     */
    int find(T el)
    {
        int i = 0;
        while (arr[i] != el && i < neff - 1)
        {
            i++;
        }
        if(arr[i] == el)
        {
            return i;
        }
        else
        {
            return -1;
        }
    }
     /**
      Mengembalikan True jika linked list kosong
      */
    bool isempty()
    {
        return neff == 0;
    }
   /**
    Menambahkan elemen sebagai elemen paling akhir
    */
    void add(T el)
    {
        if(neff<size)
        {
            arr[neff] = el;
            neff++;
        }
        else
        {
            throw "Size limit reached";
        }
    }
     /**
      Membuang elemen dari linked list
      */
    void remove(T el)
    {
        int idxRem;
        int i;
        idxRem = find(el);
        if(idxRem != -1)
        {
            for(i = idxRem;i<neff;i++)
            {
                arr[i] = arr[i+1];
            }
            neff--;
        }
        else
        {
            throw "Element not found";
        }
    }
   /**
    Mengembalikan elemen pada indeks
    */
    T get(int idx)
    {
        if(idx>0 && idx<neff)
        {
            return arr[idx];
        }
        else
        {
            throw "Index out of bounds";
        }
    }
    
};
#endif /* LinkedList_hpp */
