//
//  Player.cpp
//  Engi's Farm
//
//  Created by Abiyyu Ismunandar on 3/15/19.
//  Copyright © 2019 Abiyyu Ismunandar. All rights reserved.
//

#include "Player.hpp"
const int START_MONEY = 10;
const int START_WATER = 5;
const int START_X = 0;
const int START_Y = 0;
const int START_SIZE  = 10;

Player::Player(int x, int y) : position(x,y), backpack(START_SIZE)
{
    money = START_MONEY;
    water = START_WATER;
}

Player::~Player()
{
    backpack.~LinkedList();
}

int Player::getMoney()
{
    return money;
}

int Player::getWater()
{
    return water;
}

Point Player::getPosition()
{
    return position;
}

Product Player::getItemAt(int idx)
{
    return backpack.get(idx);
}

Product Player::getItem(std::string name)
{
    int idx;
    idx = 0;
    while (backpack.get(idx).getProductName() != name && idx<backpack.getNeff() - 1)
    {
        idx++;
    }
    if(backpack.get(idx).getProductName() == name)
    {
        return backpack.get(idx);
    }else
    {
        throw "Item not found";
    }
}

void Player::setMoney(int _money)
{
    money = _money;
}

void Player::setWater(int _water)
{
    water = _water;
}

void Player::setPosition(Point p)
{
    position = p;
}

void Player::addItem(Product newProd)
{
    backpack.add(newProd);
}

void Player::removeItem(std::string name)
{
    backpack.remove(getItem(name));
}


