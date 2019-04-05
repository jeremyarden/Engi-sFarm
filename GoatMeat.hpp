
#ifndef GoatMeat_hpp
#define GoatMeat_hpp
#include "FarmProduct.hpp"
#include <stdio.h>
class GoatMeat : public FarmProduct{
public:
    GoatMeat(std::string name,int price, int amount);
};
#endif /* ChickenEgg_hpp */
