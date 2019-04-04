//
//  Point.cpp
//  Engi's Farm
//
//  Created by Abiyyu Ismunandar on 4/4/19.
//  Copyright © 2019 Abiyyu Ismunandar. All rights reserved.
//

#include "Point.hpp"
Point::Point(int _x, int _y)
{
    x = _x;
    y = _y;
}

int Point::getX()
{
    return x;
}

int Point::getY()
{
    return y;
}

void Point::setX(int _x)
{
    x = _x;
}

void Point::setY(int _y)
{
    y = _y;
}
