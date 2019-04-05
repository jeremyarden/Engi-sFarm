#ifndef _LAND_HPP
#define _LAND_HPP

#include "Cell.hpp"
using namespace std;

class Land : public Cell
{
    public:
        Land(Point P);
        void eatGrass();
    private:
        bool grass;
};

#endif