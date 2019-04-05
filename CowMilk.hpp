#include "FarmProduct.hpp"
#ifndef CowMilk_hpp
#define CowMilk_hpp

#include <stdio.h>
class CowMilk : public FarmProduct{
public:
    CowMilk(std::string name, int price, int amount);
};
#endif /* ChickenEgg_hpp */
