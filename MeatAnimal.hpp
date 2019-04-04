#include "Product.hpp"
#include "FarmAnimal.hpp"

class MeatAnimal : public FarmAnimal {
    public:
        /** ctor */
        MeatAnimal();
        /** penanda dia meat animal */
        bool isMeatAnimal();
}