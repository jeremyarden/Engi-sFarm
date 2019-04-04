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
    LinkedList<FarmProduct> recipe;
public:
    /**ctor default untuk SideProduct*/
    SideProduct(int price, int amount);
    /**Untuk mengambil isi resep pembuatan SideProduct*/
    FarmProduct getRecipePart(int idx);
   /**Memasukan resep yang diperlukan*/
    void addRecipePart(FarmProduct el);
    
};
#endif /* SideProduct_hpp */
