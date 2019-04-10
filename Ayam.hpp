

#ifndef Ayam_hpp
#define Ayam_hpp
#include "ChickenEgg.hpp"
#include "EggAnimal.hpp"
#include "MeatAnimal.hpp"
#include "ChickenMeat.hpp"

class Ayam : public EggAnimal, public MeatAnimal{
    public:
        Ayam(); ///ctor
        void Talk(); ///ayam mengeluarkan suara "petok"
        bool isAyamDead(); ///penanda ayam hidup atau mati
        void render(Map m); ///override dr    renderable (perubahan)

        ChickenEgg getTelurAyam() const;  ///getter produk telur ayam
        ///setter telur ayam
        ///dihapus (perubahan)
        ChickenMeat getDagingAyam() const; ///getter produkk daging ayam
        ///setter daging ayam
        ///dihapus (perubahan)
    
    private:
        ChickenEgg telurAyam; ///produk yang  dihasilkan berupa telur ayam
        ChickenMeat dagingAyam; ///produk yang dihasilkan berupa daging ayam
};

#endif
