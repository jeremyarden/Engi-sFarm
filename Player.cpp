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
const int START_X = 5;
const int START_Y = 5;
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
    return *backpack.get(idx);
}

Product Player::getItem(std::string name)
{
    int idx;
    idx = 0;
    while (backpack.get(idx)->getProductName() != name && idx<backpack.getNeff() - 1)
    {
        idx++;
    }
    if(backpack.get(idx)->getProductName() == name)
    {
        return *backpack.get(idx);
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
    backpack.add(&newProd);
}

void Player::removeItem(std::string name)
{
    Product remove("",0,0);
    remove = getItem(name);
    backpack.remove(&remove);
}

void Player::move(std::string direction)
{
    if(direction == "UP")
    {
        position.setX(position.getX()-1);
    }
    else if (direction == "DOWN")
    {
        position.setX(position.getX()+1);
    }
    else if (direction == "RIGHT")
    {
        position.setY(position.getY()+1);
    }
    else if (direction == "LEFT")
    {
        position.setY(position.getY()-1);
    }
}

void Player::talk(Map m, std::string direction)
{
    if(direction == "UP")
    {
        if(isAnimal(m.getMapEl(position.getX()-1, position.getY())))
        {
            m.getEntity(position.getX()-1, position.getY())->talk();
        }
        else
        {
            std::cout<<"No one to talk to"<<std::endl;
        }
    }
    else if (direction == "DOWN")
    {
        if(isAnimal(m.getMapEl(position.getX()+1, position.getY())))
        {
            m.getEntity(position.getX()+1, position.getY())->talk();
        }
        else
        {
            std::cout<<"No one to talk to"<<std::endl;
        }
    }
    else if (direction == "RIGHT")
    {
        if(isAnimal(m.getMapEl(position.getX(), position.getY() + 1)))
        {
            m.getEntity(position.getX(), position.getY()+1)->talk();
        }
        else
        {
            std::cout<<"No one to talk to"<<std::endl;
        }
    }
    else if (direction == "LEFT")
    {
        if(isAnimal(m.getMapEl(position.getX(), position.getY() - 1)))
        {
            m.getEntity(position.getX(), position.getY()-1)->talk();
        }
        else
        {
            std::cout<<"No one to talk to"<<std::endl;
        }
    }
}



bool Player::isAnimal(char El)
{
    return El == 'C' || El == 'S' || El == 'R' || El == 'P' || El == 'G' || El == 'D';
}

bool Player::isFaci(char El)
{
    return El == 'W' || El == 'T' || El == 'M';
}

