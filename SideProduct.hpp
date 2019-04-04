//
//  SideProduct.hpp
//  Engi's Farm
//
//  Created by Abiyyu Ismunandar on 3/17/19.
//  Copyright © 2019 Abiyyu Ismunandar. All rights reserved.
//

#ifndef SideProduct_hpp
#define SideProduct_hpp

#include <stdio.h>
#include "Product.hpp"
#include "LinkedList.hpp"
#include <stdio.h>
class SideProduct : public Product{
private:
    LinkedList<Product> recipe;
public:
    SideProduct();
    /*ctor default untuk SideProduct*/
    getRecipePart(int idx);
    /*Untuk mengambil isi resep pembuatan SideProduct*/
    
};
#endif /* SideProduct_hpp */
