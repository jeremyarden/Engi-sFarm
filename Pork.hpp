
#ifndef Pork_hpp
#define Pork_hpp
#include "FarmProduct.hpp"
#include <stdio.h>
class Pork : public FarmProduct{
public:
    Pork(std::string name,int price,int amount);
};
#endif /* ChickenEgg_hpp */
