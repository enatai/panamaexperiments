/*
 * Namespace with use cases which are supported by Panama Project
 *
 * @author maurizio.cimadamore@oracle.com
 * @author Rel enatai@proton.me
 */

#ifndef HAPPY_HPP_
#define HAPPY_HPP_

namespace happy
{

  class Point {
  public:
    virtual int distance() = 0;
    virtual ~Point() {}
  };

  class Point2d: public Point {
    int x;
    int y;
  public:
    Point2d(int x, int y);
    int getX();
    int getY();
    virtual int distance();
  };

  class Point3d: public Point2d {
    int z;
  public:
    Point3d(int x, int y, int z);
    int getZ();
    virtual int distance();
  };
} /* namespace happy */

int calcDistance(happy::Point* p);

#endif /* HAPPY_HPP_ */
