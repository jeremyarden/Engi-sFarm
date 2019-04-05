#include "Land.hpp"
using namespace std;

Land::Land(Point P) : Cell(P)
{
    grass = false;
}
void Land::eatGrass()
{
    grass = false;
}