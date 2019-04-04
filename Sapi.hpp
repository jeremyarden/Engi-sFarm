#include "Product.hpp"
#include "MeatAnimal.hpp"
#include "MilkAnimal.hpp"
#include "Beef.hpp"
#include "CowMilk.hpp"

class Sapi : public MeatAnimal, public MilkAnimal {
    public:
        Sapi(); ///ctor
        void Talk(); ///sapi mengeluarkan suara "moo"
        bool isSapiDead(); ///penanda sapi hidup atau mati

        Beef getDagingSapi() const; ///getter daging sapi
        void setDagingSapi(); ///setter daging sapi
        CowMilk getSusuSapi() const; ///getter susu sapi
        void setSusuSapi(); ///setter susu sapi
        
    private:
        Beef dagingSapi; ///produk yang dihasilkan berupa beef
        CowMilk susuSapi; ///produk yang dihasilkan berupa susu sapi
}