#ifndef TRUCK_H
#define TRUCK_H

#include "Facility.h"
#include <iostream>

using namespace std;

class Truck : public Facility
{
    protected:
        int idleTime = 5;
    
    public:
        Truck();
};

#endif