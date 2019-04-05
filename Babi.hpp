#include "FarmProduct.hpp"
#include "MeatAnimal.hpp"
#include "Pork.hpp"

#ifndef Babi_hpp
#define Babi_hpp

class Babi : public MeatAnimal {
    public:
        Babi(); ///ctor
        void Talk(); ///babi mengeluarkan suara "oink"
        bool isBabiDead(); ///penanda babi hidup atau mati
        void render(); ///override dr renderable (perubahan)

        Pork getDagingBabi() const; ///getter produk pork
        ///setter daging babi
        ///dihapus (perubahan)
        
    private:
        Pork dagingBabi; ///produk yang dihasilkan berupa pork
};
#endif