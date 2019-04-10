#ifndef _CELL_HPP
#define _CELL_HPP

#include "Point.hpp"
#include "Renderable.hpp"

class Cell : public Renderable
{
    private:
        int x;
        int y;
    public:
        Cell(Point P);
        void talk();
};

#endif
