#ifndef MeatAnimal_hpp 
#define MeatAnimal_hpp
#include "FarmAnimal.hpp"
class MeatAnimal : public FarmAnimal
{
    public:
        /** ctor */
        MeatAnimal();
        /** penanda dia meat animal */
        bool isMeatAnimal();

    private:
        bool meat; /* perubahan */
};
#endif
