#include "Truck.hpp"

//ctor truck
Truck::Truck(Point P) : Facility(P)
{
    totalPrice = 0;
    load = LinkedList<Product>(capacity);
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