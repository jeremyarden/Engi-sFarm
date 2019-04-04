#include "Product.hpp"
#include "MeatAnimal.hpp"
#include "Pork.hpp"

class Babi : public MeatAnimal {
    public:
        Babi(); ///ctor
        void Talk(); ///babi mengeluarkan suara "oink"
        bool isBabiDead(); ///penanda babi hidup atau mati

        Pork getDagingBabi() const; ///getter produk pork
        void setDagingBabi(); ///setter daging babi
        
    private:
        Pork dagingBabi; ///produk yang dihasilkan berupa pork
}