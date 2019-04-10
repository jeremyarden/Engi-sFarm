#include "Truck.hpp"

//ctor truck
Truck::Truck(Point P) : Facility(P), load(capacity)
{
    totalPrice = 0;
}
void Truck::putLoad(Product p)
{
    if (load.getSize() != 5)
    {
        totalPrice += p.getProductPrice();
        load.add(p);
    }
    else
    {
        cout<<"Truck is full"<<endl;
    }
    
}

void Truck::render()
{
    
}
