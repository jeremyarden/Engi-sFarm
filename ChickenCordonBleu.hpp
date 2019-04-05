
#ifndef ChickenCordonBleu_hpp
#define ChickenCordonBleu_hpp
#include "SideProduct.hpp"
#include <stdio.h>
#include "CowMilk.hpp"
#include "CowCheese.hpp"
#include "ChickenMeat.hpp"
class ChickenCordonBleu : public SideProduct{
public:
    ChickenCordonBleu(std::string name,int price, int amount);
};
#endif /* ChickenEgg_hpp */
