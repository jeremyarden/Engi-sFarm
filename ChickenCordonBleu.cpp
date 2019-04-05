//
//  ChickenCordonBleu.cpp
//  Engi's Farm
//
//  Created by Abiyyu Ismunandar on 4/5/19.
//  Copyright © 2019 Abiyyu Ismunandar. All rights reserved.
//

#include <stdio.h>
#include "ChickenCordonBleu.hpp"

ChickenCordonBleu::ChickenCordonBleu(std::string name, int price,int amount) : SideProduct(name,price,amount)
{
    addRecipePart(* new CowMilk("susuSapi",1000,1));
    addRecipePart(* new ChickenMeat("dagingAyam",2000,2));
    addRecipePart(* new CowCheese("kejuSapi",3000,1));
}
