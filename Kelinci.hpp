#include "Product.hpp"
#include "MeatAnimal.hpp"
#include "RabbitMeat.hpp"

#ifndef Kelinci_hpp
#define Kelinci_hpp

class Kelinci : public MeatAnimal {
    public:
        Kelinci(); ///ctor
        void Talk(); ///kelinci berbicara "cit cit"
        bool isKelinciDead(); ///penanda kelinci hidup atau mati

        RabbitMeat getDagingKelinci() const; ///getter daging kelinci
        ///setter daging kelinci
        ///dihapus (perubahan)

    private:
        RabbitMeat dagingKelinci; ///produk yang dihasilkan berupa daging kelinci
};
#endif