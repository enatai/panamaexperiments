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

class Point2d {
    int x;
    int y;
public:
    Point2d(int x, int y);
    int getX();
    int getY();
    int distance();
};

} /* namespace happy */

#endif /* HAPPY_HPP_ */
