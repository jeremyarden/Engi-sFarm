#include "FarmProduct.hpp"
#include "MeatAnimal.hpp"
#include "MilkAnimal.hpp"
#include "GoatMilk.hpp"
#include "GoatMeat.hpp"

#ifndef Kambing_hpp
#define KAmbing_hpp

class Kambing : public MeatAnimal, public MilkAnimal {
    public:
        Kambing(); ///ctor
        void Talk(); ///kambing mengeluarkan suara "mbek"
        bool isKambingDead(); ///penanda kambing hidup atau mati
        
        GoatMilk getSusuKambing() const; ///getter susu kambing
        ///setter susu kambing
        ///dihapus (perubahan)
        GoatMeat getDagingKambing() const; ///getter daging kambing
        ///setter daging kambing
        ///dihapus (perubahan)
    
    private:
        GoatMilk susuKambing; ///produk yang dihasilkan berupa susu kambing
        GoatMeat dagingKambing; ///produk yang dihasilkan berupa daging kambing
};
#endif