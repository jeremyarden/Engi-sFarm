//
//  Point.hpp
//  Engi's Farm
//
//  Created by Abiyyu Ismunandar on 4/4/19.
//  Copyright © 2019 Abiyyu Ismunandar. All rights reserved.
//

#ifndef Point_hpp
#define Point_hpp
/**
 Kelas Point yang digunakan untuk menandakan posisi semua entitas pada map
 */
#include <stdio.h>
class Point
{
private:
    int x;
    int y;
public:
    /**
     Constructor user defined untuk menandakan langsung posisi entitas
     */
    Point(int _x, int _y);
    /**
     Mengambil nilai x dari Point
     */
    int getX();
    /**
     Mengambil nilai y dari Point
     */
    int getY();
    /**
     Mengubah nilai x dari Point
     */
    void setX(int _x);
    /**
     Mengubah nilai y dari Point
     */
    void setY(int _y);
    
};
#endif /* Point_hpp */
