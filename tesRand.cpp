#include <stdlib.h>
#include <stdio.h>
#include <time.h>

int random(int min, int max) { /* perubahan */
   static bool first = true;
   if (first) {  
      srand(time(NULL));
      first = false;
   }
   return min + rand() % (( max + 1 ) - min);
}