#ifndef RabbitMeat_hpp
#define RabbitMeat_hpp
#include "FarmProduct.hpp"
#include <stdio.h>
class RabbitMeat : public FarmProduct{
public:
    RabbitMeat(std::string name, int price, int amount);
};
#endif /* ChickenEgg_hpp */
