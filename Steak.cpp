//
//  Steak.cpp
//  Engi's Farm
//
//  Created by Abiyyu Ismunandar on 4/5/19.
//  Copyright © 2019 Abiyyu Ismunandar. All rights reserved.
//
#include "Steak.hpp"
#include <stdio.h>

Steak::Steak(std::string name, int price, int amount) : SideProduct(name,price,amount)
{
    addRecipePart(*new Beef("dagingSapi",100,1));
}
