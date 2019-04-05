//
//  SideProduct.hpp
//  Engi's Farm
//
//  Created by Abiyyu Ismunandar on 3/17/19.
//  Copyright © 2019 Abiyyu Ismunandar. All rights reserved.
//

#ifndef SideProduct_hpp
#define SideProduct_hpp

#include "FarmProduct.hpp"
#include "LinkedList.hpp"
#include <stdio.h>
class SideProduct : public Product{
private:
    LinkedList<Product> recipe;
public:
    /**ctor default untuk SideProduct*/
    SideProduct(std::string name,int price, int amount);
    /**Untuk mengambil isi resep pembuatan SideProduct*/
    Product getRecipePart(int idx);
   /**Memasukan resep yang diperlukan*/
    void addRecipePart(FarmProduct el);
    
};
#endif /* SideProduct_hpp */
