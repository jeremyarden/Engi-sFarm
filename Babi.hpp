#ifndef Babi_hpp
#define Babi_hpp

#include "Pork.hpp"
#include "MeatAnimal.hpp"

class Babi : public MeatAnimal
{
    public:
        Babi(); ///ctor
        void Talk(); ///babi mengeluarkan suara "oink"
        bool isBabiDead(); ///penanda babi hidup atau mati
        void render(Map m); ///override dr renderable (perubahan)

        Pork getDagingBabi();  ///getter produk   pork
        ///setter daging babi
        ///dihapus (perubahan)
        
    private:
       Pork dagingBabi; ///produk yang dihasilkan berupa pork
};
#endif
