#ifndef _GRASSLAND_HPP
#define _GRASSLAND_HPP

#include "Land.hpp"
#include "Point.hpp"
using namespace std;

class Grassland : public Land
{
    public:
        Grassland(Point P);
        void render(); 
};

#endif
