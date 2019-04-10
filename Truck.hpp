#ifndef TRUCK_H
#define TRUCK_H

#include "Facility.hpp"
#include "LinkedList.hpp"
#include "Product.hpp"
#include <iostream>

using namespace std;

class Truck : public Facility
{ 
    protected:
        int idleTime = 5;
        int capacity = 5;
        LinkedList<Product> load;
        int totalPrice;
    public:
        Truck(Point P);
        void putLoad(Product p);
        int getPrice();
        void render();
};

#endif
