#ifndef Steak_hpp
#define Steak_hpp
#include "Beef.hpp"
#include <stdio.h>
#include "SideProduct.hpp"
class Steak : public SideProduct{
public:
    Steak(std::string name,int price, int amount);
};
#endif /* ChickenEgg_hpp */
