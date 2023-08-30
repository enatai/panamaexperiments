#include "cexperiments.h"

struct B returnStruct() {
  struct B r;
  r.a.a = 10;
  r.a.b = 11;
  return r;
}