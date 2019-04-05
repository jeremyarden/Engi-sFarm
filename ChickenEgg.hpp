
#ifndef Pork_hpp
#define Pork_hpp
#include "FarmProduct.hpp"
#include <stdio.h>
class ChickenEgg : public FarmProduct{
public:
    ChickenEgg(std::string name,int price,int amount);
};
#endif /* ChickenEgg_hpp */
