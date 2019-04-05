//
//  Steak.cpp
//  Engi's Farm
//
//  Created by Abiyyu Ismunandar on 4/5/19.
//  Copyright © 2019 Abiyyu Ismunandar. All rights reserved.
//
#include "Steak.hpp"
#include <stdio.h>

Steak::Steak(int price, int amount) : SideProduct(price,amount)
{
    addRecipePart(*new Beef(100,1));
}
