#include "Product.hpp"
#include "MeatAnimal.hpp"
#include "MilkAnimal.hpp"
#include "Beef.hpp"
#include "CowMilk.hpp"
#include "Renderable.hpp"

#ifndef Sapi_hpp
#define Sapi_hpp

class Sapi : public MeatAnimal, public MilkAnimal {
    public:
        Sapi(); ///ctor
        void Talk(); ///sapi mengeluarkan suara "moo"
        bool isSapiDead(); ///penanda sapi hidup atau mati
        void render(); ///override dr renderable (perubahan)

        Beef getDagingSapi() const; ///getter daging sapi
        ///setter daging sapi
        ///dihapus (perubahan)
        CowMilk getSusuSapi() const; ///getter susu sapi
        ///setter susu sapi
        ///dihapus (perubahan)
        
    private:
        Beef dagingSapi; ///produk yang dihasilkan berupa beef
        CowMilk susuSapi; ///produk yang dihasilkan berupa susu sapi
};
#endif