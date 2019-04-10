#ifndef _FACILITY_HPP
#define _FACILITY_HPP

#include "Cell.hpp"
#include <iostream>
using namespace std;

class Facility : public Cell 
{
   public:
      Facility(Point P);
      virtual void render() = 0;
};

#endif
