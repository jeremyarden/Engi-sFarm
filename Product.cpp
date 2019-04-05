//
//  Product.cpp
//  Engi's Farm
//
//  Created by Abiyyu Ismunandar on 3/15/19.
//  Copyright © 2019 Abiyyu Ismunandar. All rights reserved.
//

#include "Product.hpp"

Product::Product(std::string name, int price, int amount)
{
    this->name = name;
    this->price = price;
    this->amount = amount;
}
std::string Product::getProductName()
{
    return name;
}
int Product::getProductPrice()
{
    return price;
}

int Product::getAmount()
{
    return amount;
}

void Product::addAmount()
{
    amount++;
}

void Product::setProductPrice(int _price)
{
    price = _price;
}
