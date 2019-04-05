#ifndef _GRASSLAND_HPP
#define _GRASSLAND_HPP

#include "Land.hpp"
#include "Renderable.hpp"
using namespace std;

class Grassland : public Land, public Renderable
{
    public:
        Grassland();
        void render();
};

#endif
