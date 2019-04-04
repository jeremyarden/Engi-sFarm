#include "Product.hpp"
#include "FarmAnimal.hpp"

class EggAnimal : public FarmAnimal {
    public:
        /** ctor */
        EggAnimal();
        /** penanada dia egg animal */
        bool isEggAnimal();
}