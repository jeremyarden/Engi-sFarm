
#ifndef Player_hpp
#define Player_hpp
#include "Renderable.hpp"
#include "Product.hpp"
#include "LinkedList.hpp"
#include "Point.hpp"
#include "Map.hpp"
#include <string>
#include <stdio.h>

/**
 Player class. Kelas untuk mendefinisikan player yang akan digunakan untuk
 memainkan permainan.
 */
class Player : public Renderable{
private:
    int money;      /**Menyimpan jumlah uang yang dipunyai pemain*/
    int water;      /**Menyimpan jumlah air yang dipunyai pemain*/
    Point position;  /**Menyimpan dimana posisi pemain*/
    LinkedList<Product *> backpack;   /**menyimpan produk-produk yang dihasilkan dari hewan atau mixer*/

public:
    
    /**
     Constructor default yang men-inisialisasi atribut-atribut player.
     Tidak dibutuhkan constructor lain dan operator assignment karena hanya dibutuhkan satu objek
     player.
     */
    Player(int x, int y);
   
    /**
     Destructor objek Player
     */
    ~Player();
    
    /*====Getter Setter====*/
    /**
     Getter jumlah uang pemain
     */
    int getMoney();
    
    /**
     Getter jumlah air pemain
     */
    int getWater();
    
    /**
     Getter posisi pemain
     */
    Point getPosition();
    
    /**
     Getter produk didalam tas pemain sesuai indeks pada backpack
     */
    Product getItemAt(int idx);
    
    /**
     Getter produk didalam tas pemain sesuai nama produk
     */
    Product getItem(std::string name);
    
    /**
     Setter jumlah uang pemain
     */
    void setMoney(int _money);
    
    /**
     Setter jumlah air pemain
     */
    void setWater(int _water);
   
    /**
     Setter posisi pemain
     */
    void setPosition(Point p);
    
    /**
     Untuk memasukkan produk-produk baru
     */
    void addItem(Product newProd);
    
    /**
     Untuk mengeluarkan item dari backpack
     */
    void removeItem(std::string name);
    
    /*====Method-method Player====*/
    /**
     Method yang menggerekkan pemain. Pemain bisa bergerak ke arah atas, bawah, kiri, dan kanan.
     Pemain hanya bisa bergerak ke Cell yang bertipe Land selama tidak ada hewan di Cell tersebut.
     */
    void move(std::string);
    
    /**
     Pemain bisa berbicara kepada hewan dan hewan akan  bersuara sesuai jenisnya.
     */
    void talk(Map m,std::string direction);
    
    /**
     ◦    Pemain bisa berinteraksi dengan berbagai hewan dan fasilitas yang berbeda-beda:
     •    Interaksi dengan Well akan menambahkan supply air
     •    Interaksi dengan Truck akan mengosongkan dan menjual isi Backpack. Truck tidak dapat dipakai selama beberapa satuan waktu setelah dipakai.
     •    Interaksi dengan hewan yang memproduksi telur dapat menghasilkan telur
     •    Interaksi dengan hewan yang meproduksi susu dapat menghasilkan sus
     */
    void interact();
   
    /**
     Hanya bisa dilakukan pada hewan yang memproduksi daging. Pemain mendapatkan
     daging setelah melakukan perintah ini namun hewannya mati.
     */
    void kill();
   
    /**
     Menyiram Land untuk menumbuhkan rumput pada Cell player. Mengurangi jumlah air yang dipunyai player.
     */
    void grow();
    
    /**
     Command yang digunakan ketika sedang dekat dengan mixer. Mengkombinasikan
     produk dalam backpack dan mengasilkan sebuah Side Product.
     */
    void mix();
    
    void render(Map m);
    
    bool isAnimal(char El);
    
    bool isFaci(char El);
    
};
#endif /* Player_hpp */
