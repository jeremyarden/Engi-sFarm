#ifndef _LAND_H
#define _LAND_H

#include "Cell.h"
using namespace std;

class Land : public Cell
{
    protected:
        Land();
    private:
        bool grass();
};

#endif