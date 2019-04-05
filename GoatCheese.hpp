
#ifndef GoatCheese_hpp
#define GoatCheese_hpp
#include "SideProduct.hpp"
#include "GoatMilk.hpp"
#include <stdio.h>
class GoatCheese : public SideProduct{
public:
    GoatCheese(std::string name,int price, int amount);
};
#endif /* ChickenEgg_hpp */
