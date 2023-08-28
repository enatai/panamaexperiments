Experiments related to [Panama project](https://jdk.java.net/panama/) (mainly C++ bindings using Java FFM).
- [libcppexperiments](libcppexperiments) - C++ library covering different kinds of C++ APIs
- [cppexperiments](cppexperiments) - Java project with FFM bindings to `libcppexperiments`

# Usage

```
gradle clean build -Pjdk21_home=...
```

It will build `libcppexperiments` and run tests for bindings.

Tests are configured for "linux/x86-64" in case of different arch they may fail. In this case update "java.library.path" in [build.gradle](cppexperiments/build.gradle). 

# Run jextract to generate bindings for libcppexperiments

Checkout "cxx2" branch and build [jextract with C++ support](https://github.com/enatai/jextractcpp.git)

Run `jextract`:

```
jextract -Djextract.debug=true \
 -Dlibclang.debug=true \
 --output cppexperiments/src/gen/java \
 --source \
 -t libcppexperiments \
 --header-class-name Happy \
 -I libcppexperiments/src/main/public \
 -lcppexperiments \
 libcppexperiments/src/main/public/happy.hpp
```

# Navigation

- [rust-bindgen](rust-bindgen/README.md)
