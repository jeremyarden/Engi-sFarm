#ifndef MilkAnimal_hpp
#define MilkAnimal_hpp
#include "FarmAnimal.hpp"
class MilkAnimal : public FarmAnimal
{
    public:
        /** ctor */
        MilkAnimal(); 
        /** penanda milk animal */
        bool isMilkAnimal();
    
    private:
        bool milk; /*perubahan */
};
#endif
