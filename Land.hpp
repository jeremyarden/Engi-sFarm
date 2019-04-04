#ifndef _LAND_HPP
#define _LAND_HPP

#include "Cell.hpp"
using namespace std;

class Land : public Cell
{
    protected:
        Land(Point P);
    private:
        bool grass;
};

#endif