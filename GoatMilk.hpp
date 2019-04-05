#ifndef GoatMilk_hpp
#define GoatMilk_hpp

#include "FarmProduct.hpp"
#include <stdio.h>
class GoatMilk : public FarmProduct{
public:
    GoatMilk(std::string name,int price,int amount);
};
#endif /* ChickenEgg_hpp */
