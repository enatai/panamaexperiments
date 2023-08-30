/*
 * @author Rel enatai@proton.me
 */

#ifndef C_EXPERIMENTS_H
#define C_EXPERIMENTS_H

struct A {
  int a;
  int b;
};

struct B {
  struct A a;
  int c;
};

struct B returnStruct();

#endif /* C_EXPERIMENTS_H */
