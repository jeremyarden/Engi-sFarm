//
//  ChickenMeat.hpp
//  Engi's Farm
//
//  Created by Abiyyu Ismunandar on 3/19/19.
//  Copyright © 2019 Abiyyu Ismunandar. All rights reserved.
//
#include "FarmProduct.hpp"
#ifndef ChickenMeat_hpp
#define ChickenMeat_hpp

#include <stdio.h>
class ChickenMeat : public FarmProduct
{
public:
    ChickenMeat(int price, int amount);
};
#endif /* ChickenMeat_hpp */
