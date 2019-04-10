#ifndef _COOP_HPP
#define _COOP_HPP

#include "Land.hpp"
using namespace std;

class Coop : public Land
{
    public:
        Coop(Point P);
        void render();
};

#endif
