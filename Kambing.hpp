#include "Product.hpp"
#include "MeatAnimal.hpp"
#include "MilkAnimal.hpp"
#include "GoatMilk.hpp"
#include "GoatMeat.hpp"

class Kambing : public MeatAnimal, public MilkAnimal {
    public:
        Kambing(); ///ctor
        void Talk(); ///kambing mengeluarkan suara "mbek"
        bool isKambingDead(); ///penanda kambing hidup atau mati
        
        GoatMilk getSusuKambing() const; ///getter susu kambing
        void setSusuKambing(); ///setter susu kambing
        GoatMeat getDagingKambing() const; ///getter daging kambing
        void setDagingKambing(); ///setter daging kambing
    
    private:
        GoatMilk susuKambing; ///produk yang dihasilkan berupa susu kambing
        GoatMeat dagingKambing; ///produk yang dihasilkan berupa daging kambing
}