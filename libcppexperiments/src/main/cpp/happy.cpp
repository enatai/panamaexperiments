#include "happy.hpp"
#include <iostream>

namespace happy
{
using namespace std;

Point2d::Point2d(int x, int y) : x(x), y(y) {
    cout << "Point2d(" << x << ", " << y << ")" << endl;
}

int Point2d::getX(){ return x;}

int Point2d::getY(){ return y;}

int Point2d::distance(){ return 123;}

} /* namespace happy */
