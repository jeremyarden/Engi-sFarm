#include "FarmProduct.hpp"
#include "Cell.hpp"

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
        int getHungryCountdown() const;
        /** setter waktu lapar */ 
        void setHungryCountdown() const;
        /** getter posisi binatang */
        Cell getPetakBinatang() const;
        /** setter posisi binatang */
        void setPetakBinatang(Cell _C);

    protected:
        /** menghitung waktu lapar */
        static int hungryCountdown;
        /** posisi binatang dengan kelas Cell */
        Cell petakBinatang; 
}