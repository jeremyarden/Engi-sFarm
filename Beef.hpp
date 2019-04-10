#include "FarmProduct.hpp"
#ifndef Beef_hpp
#define Beef_hpp

#include <stdio.h>
class Beef : public FarmProduct{
public:
    Beef(std::string name,int price, int amount);
};
#endif /* ChickenEgg_hpp */
