#ifndef EggAnimal_hpp
#define EggAnimal_hpp
#include "FarmAnimal.hpp"

class EggAnimal : public FarmAnimal {
    public:
        /** ctor */
        EggAnimal();
        /** penanada dia egg animal */
        bool isEggAnimal();
    
    private:
        bool egg; /* perubahan */
};
#endif
