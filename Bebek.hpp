#ifndef Bebek_hpp
#define Bebek_hpp
#include "MeatAnimal.hpp"
#include "EggAnimal.hpp"
#include "DuckEgg.hpp"
#include "DuckMeat.hpp"


class Bebek : public MeatAnimal, public EggAnimal{
    public:
        Bebek(); ///ctor
        void Talk(); ///bebek mengeluarkan suara "kwek"
        bool isBebekDead(); ///penanda bebek hidup atau mati
        void render(Map m); ///override dr renderable (perubahan)

        DuckEgg getTelurBebek() const; ///getter produk telur bebek
        ///setter telur bebek
        ///dihapus (perubahan)
        DuckMeat getDagingBebek() const; ///getter produkk daging bebek
        ///setter daging bebek
        ///dihapus (perubahan)
    
    private:
        DuckEgg telurBebek; ///produk yang dihasilkan berupa telur bebek
        DuckMeat dagingBebek; ///produk yang dihasilkan berupa daging bebek
};
#endif
