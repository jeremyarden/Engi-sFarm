#include "FarmProduct.hpp"
#include "MeatAnimal.hpp"
#include "EggAnimal.hpp"
#include "DuckEgg.hpp"
#include "DuckMeat.hpp"
#include "Renderable.hpp"

#ifndef Bebek_hpp
#define Bebek_hpp

class Bebek : public MeatAnimal, public EggAnimal, public Renderable {
    public:
        Bebek(); ///ctor
        void Talk(); ///bebek mengeluarkan suara "kwek"
        bool isBebekDead(); ///penanda bebek hidup atau mati
        void render(); ///override dr renderable (perubahan)

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
