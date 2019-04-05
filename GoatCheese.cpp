//
//  GoatCheese.cpp
//  Engi's Farm
//
//  Created by Abiyyu Ismunandar on 4/5/19.
//  Copyright © 2019 Abiyyu Ismunandar. All rights reserved.
//

#include <stdio.h>
#include "GoatCheese.hpp"

GoatCheese::GoatCheese(std::string name,int price, int amount) : SideProduct(name,price,amount)
{
    addRecipePart(* new GoatMilk("susuKambing",1000,1));
}
