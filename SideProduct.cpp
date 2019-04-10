//
//  SideProduct.cpp
//  Engi's Farm
//
//  Created by Abiyyu Ismunandar on 3/17/19.
//  Copyright © 2019 Abiyyu Ismunandar. All rights reserved.
//

#include "SideProduct.hpp"

SideProduct::SideProduct(std::string name,int price, int amount) : recipe(3), Product(name,price,amount)
{
    
}

Product SideProduct::getRecipePart(int idx)
{
    return recipe.get(idx);
}

void SideProduct::addRecipePart(Product el)
{
    recipe.add(el);
}
