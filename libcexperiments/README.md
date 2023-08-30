This library is used mainly for debug purposes and comparison between what jextract generates for C vs C++.

```
jextract -Djextract.debug=true \
 -Dlibclang.debug=true \
 --output cppexperiments/src/gen/java \
 --source \
 -t libcexperiments \
 --header-class-name Libcexperiments \
 -I libcexperiments/src/main/public \
 -lcexperiments \
 libcexperiments/src/main/public/cexperiments.h
```
