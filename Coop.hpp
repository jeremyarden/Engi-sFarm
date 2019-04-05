#ifndef _COOP_HPP
#define _COOP_HPP

#include "Land.hpp"
#include "Renderable.hpp"
using namespace std;

class Coop : public Land, public Renderable
{
    public:
        Coop(Point P);
        void render();
};

#endif
