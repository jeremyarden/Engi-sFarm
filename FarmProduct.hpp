//
//  FarmProduct.hpp
//  Engi's Farm
//
//  Created by Abiyyu Ismunandar on 3/17/19.
//  Copyright © 2019 Abiyyu Ismunandar. All rights reserved.
//

#ifndef FarmProduct_hpp
#define FarmProduct_hpp
#include "Product.hpp"
#include <stdio.h>
/**
 FarmProduct class. FarmProduct adalah parent dari 
 */
class FarmProduct : public Product{

public:
    /**
     ctor default untuk FarmProduct
     */
    FarmProduct(int price, int amount);
    
};
#endif /* FarmProduct_hpp */
