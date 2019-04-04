#include "Product.hpp"
#include "MeatAnimal.hpp"
#include "RabbitMeat.hpp"

class Kelinci : public MeatAnimal {
    public:
        Kelinci(); ///ctor
        void Talk(); ///kelinci berbicara "cit cit"
        bool isKelinciDead(); ///penanda kelinci hidup atau mati

        RabbitMeat getDagingKelinci() const; ///getter daging kelinci
        void setDagingKelinci(); ///setter daging kelinci

    private:
        RabbitMeat dagingKelinci; ///produk yang dihasilkan berupa daging kelinci
}