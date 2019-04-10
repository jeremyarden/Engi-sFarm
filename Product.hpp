//
//  Product.hpp
//  Engi's Farm
//
//  Created by Abiyyu Ismunandar on 3/15/19.
//  Copyright © 2019 Abiyyu Ismunandar. All rights reserved.
//

#ifndef Product_hpp
#define Product_hpp

#include <stdio.h>
#include <string>
/**
 Product class. Kelas parent dari FarmProduct dan SideProduct.
 */
class Product{
    
private:
    std::string name;   /**Menyimpan nama produk*/
    int price;          /**Menyimpan harga produk*/
    int amount;         /**Menyimpan banyak produk*/
    
public:
    /**Product default ctr
     */
    Product();
    /**
     User defined constructor untuk menginisialisasi produk-produk yang akan dijual
     */
    Product(std::string name, int price, int amount);
    /**
     */
    std::string getProductName();
    /**
     Untuk mengambil harga produk
     */
    int getProductPrice();
    /**
     Mengambil jumlah product yang dimiliki*/
    int getAmount();
    /**Menambah jumlah amount*/
    void addAmount();
    /**
     Untuk mengganti harga produk
     */
    void setProductPrice(int _price);
    
};
#endif /* Product_hpp */
