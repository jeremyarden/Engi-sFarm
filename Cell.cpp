#include "Cell.hpp"
#include "Point.hpp"
#include <iostream>

Cell::Cell(Point P)
{
    x = P.getX();
    y = P.getY();
}