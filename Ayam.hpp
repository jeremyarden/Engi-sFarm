#include "Product.hpp"
#include "EggAnimal.hpp"
#include "MeatAnimal.hpp"
#include "ChickenEgg.hpp"
#include "ChickenMeat.hpp"

class Ayam : public EggAnimal, public MeatAnimal {
    public:
        Ayam(); ///ctor
        void Talk(); ///ayam mengeluarkan suara "petok"
        bool isAyamDead(); ///penanda ayam hidup atau mati

        ChickenEgg getTelurAyam() const; ///getter produk telur ayam
        void setTelurAyam(); ///setter telur ayam
        ChickenMeat getDagingAyam() const; ///getter produkk daging ayam
        void setDagingAyam(); ///setter daging ayam
    
    private:
        ChickenEgg telurAyam; ///produk yang dihasilkan berupa telur ayam
        ChickenMeat dagingAyam; ///produk yang dihasilkan berupa daging ayam
}