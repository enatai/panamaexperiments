/*
 * Namespace with use cases currently not supported by Panama Project
 *
 * @author maurizio.cimadamore@oracle.com
 * @author Rel enatai@proton.me
 */

#ifndef UNHAPPY_HPP_
#define UNHAPPY_HPP_

#include <iostream>

#include "happy.hpp"

namespace unhappy
{

class Point3d : happy::Point2d {
    int z;
public:
    Point3d(int x, int y, int z);
    virtual int distance();
};

int inlineFunc() {
    std::cout << "Hello from inlined function" << std::endl;
    return 1;
}

} /* namespace unhappy */

#endif /* UNHAPPY_HPP_ */
