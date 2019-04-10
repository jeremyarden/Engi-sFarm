

#ifndef Kelinci_hpp
#define Kelinci_hpp
#include "MeatAnimal.hpp"
#include "RabbitMeat.hpp"
class Kelinci : public MeatAnimal
{
    public:
        Kelinci(); ///ctor
        void Talk(); ///kelinci berbicara "cit cit"
        bool isKelinciDead(); ///penanda kelinci hidup atau mati
        void render(); ///override dr renderable (perubahan)

        RabbitMeat getDagingKelinci() const; ///getter daging kelinci
        ///setter daging kelinci
        ///dihapus (perubahan)

    private:
        RabbitMeat dagingKelinci; ///produk yang dihasilkan berupa daging kelinci
};
#endif
