//
//  SideProduct.cpp
//  Engi's Farm
//
//  Created by Abiyyu Ismunandar on 3/17/19.
//  Copyright © 2019 Abiyyu Ismunandar. All rights reserved.
//

#include "SideProduct.hpp"

SideProduct::SideProduct(int price, int amount) : recipe(3), Product(price,amount)
{
    
}

FarmProduct SideProduct::getRecipePart(int idx)
{
    return recipe.get(idx);
}

void SideProduct::addRecipePart(FarmProduct el)
{
    recipe.add(el);
}
