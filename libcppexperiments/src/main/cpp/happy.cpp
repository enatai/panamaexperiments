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

  Point3d::Point3d(int x, int y, int z) : Point2d(x, y), z(z) {
    cout << "Point3(" << x << ", " << y << ", " << z << ")" << endl;
  }

  int Point3d::getZ(){ return z;}

  int Point3d::distance(){ return 222;}

} /* namespace happy */

int calcDistance(happy::Point* p) {
  return p->distance();
}
