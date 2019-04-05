#include "FarmProduct.hpp"
#include "Point.hpp"
#include "Map.hpp"
#include "Land.hpp"
#include <stdlib.h>

#ifndef FarmAnimal_hpp
#define FarmAnimal_hpp

class FarmAnimal {
    /**Talk (pure virtual)
    Bergerak acak
    Merasa lapar (harus makan sblm 5 tick waktu) kalo ngelebihin bakal mati
    Otomatis makan rumput di land ketika lapar
    Menghasilkan farm product */
    public:
        /** ctor */
        FarmAnimal();
        /** talk berupa pure virtual karena tiap binatang berbeda-beda */
        virtual void Talk() = 0;
        /** tiap hewan bergerak secara random */
        void Move();
        /** penanda hewan tsb lapar atau tidak, apabila lapar maka hungryCountdown akan terus ditambah */
        bool isHungry();
        /** apabila hewan lapar maka hewan akan langsung makan */
        void Eat();

        /** getter waktu lapar */
        int static getHungryCountdown() const; /* ditambahin static (perubahan) */
        /** setter waktu lapar */ 
         /* setter dihapus (perubahan) */
        /** getter posisi binatang */
        Point getPetakBinatang() const; /* diganti jadi point (perubahan) */
        /** setter posisi binatang */
        /* setter dihapus (perubahan) */

    protected:
        /** menghitung waktu lapar */
        static int hungryCountdown;
        /** posisi binatang dengan kelas Cell */
        /* cell dihapus (perubahan) */
        /** untuk bergerak menggunakan point */
        Point letak; /* perubahan */
};
#endif