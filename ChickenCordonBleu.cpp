//
//  ChickenCordonBleu.cpp
//  Engi's Farm
//
//  Created by Abiyyu Ismunandar on 4/5/19.
//  Copyright © 2019 Abiyyu Ismunandar. All rights reserved.
//

#include <stdio.h>
#include "ChickenCordonBleu.hpp"

ChickenCordonBleu::ChickenCordonBleu(int price,int amount) : SideProduct(price,amount)
{
    addRecipePart(* new CowMilk(1000,1));
    addRecipePart(* new ChickenMeat(2000,2));
    addRecipePart(* new CowCheese(3000,1));
}
