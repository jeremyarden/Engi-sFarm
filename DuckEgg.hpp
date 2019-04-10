#include "FarmProduct.hpp"
#ifndef DuckEgg_hpp
#define DuckEgg_hpp

#include <stdio.h>
class DuckEgg : public FarmProduct{
public:
    DuckEgg(std::string name,int price,int amount);
};
#endif /* ChickenEgg_hpp */
