#include "Product.hpp"
#include "FarmAnimal.hpp"

class MilkAnimal : public FarmAnimal {
    public:
        /** ctor */
        MilkAnimal(); 
        /** penanda milk animal */
        bool isMilkAnimal();
}