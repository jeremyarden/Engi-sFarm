#ifndef DuckMeat_hpp
#define DuckMeat_hpp
#include "FarmProduct.hpp"
#include <stdio.h>
class DuckMeat : public FarmProduct{
    DuckMeat(std::string name,int price, int amount);
};
#endif /* ChickenEgg_hpp */
