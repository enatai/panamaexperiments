/*
 * Namespace with use cases currently not supported by Panama Project
 *
 * @author maurizio.cimadamore@oracle.com
 * @author Rel enatai@proton.me
 */

#ifndef UNHAPPY_HPP_
#define UNHAPPY_HPP_

#include <iostream>
#include <string>
#include "happy.hpp"

namespace unhappy
{

/**
 * Template classes
 *
 * std::string is a template class and it does not work
 * jextract fails with: "java.util.NoSuchElementException: Invalid Cursor kind value: 31"
 * where 31 is CXCursorKind.CXCursor_ClassTemplate
 */
std::string helloWorld();

/**
 * Template functions
 *
 * When library is compiled template functions are not included into its binary file.
 * As the results there is no symbols for it, and calling it from Java through FFM does not work.
 */
template<class T>
T minTemplate(T a, T b)
{
    return a < b ? a : b;
}

/**
 * Inline functions
 */
inline int inlineFunc() {
    std::cout << "Hello from inlined function" << std::endl;
    return 1;
}

/**
 * References as arguments are not supported by jextract as of now. But it is not a blocker and can be
 * supported later.
 */
int calcDistanceByRef(happy::Point& p);

} /* namespace unhappy */

#endif /* UNHAPPY_HPP_ */
