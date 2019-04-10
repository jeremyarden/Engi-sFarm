//
//  Well.hpp
//  Engi's Farm
//
//  Created by Abiyyu Ismunandar on 4/5/19.
//  Copyright © 2019 Abiyyu Ismunandar. All rights reserved.
//

#ifndef Well_hpp
#define Well_hpp
#include "Facility.hpp"
#include "Point.hpp"
#include <stdio.h>
class Well : public Facility
{
public:
    Well(Point P);
    void render();
};
#endif /* Well_hpp */
