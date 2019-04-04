#include "Product.hpp"
#include "FarmAnimal.hpp"

#ifndef MilkAnimal_hpp
#define MilkAnimal_hpp

class MilkAnimal : public FarmAnimal {
    public:
        /** ctor */
        MilkAnimal(); 
        /** penanda milk animal */
        bool isMilkAnimal();
    
    private:
        bool milk; /*perubahan */
};
#endif