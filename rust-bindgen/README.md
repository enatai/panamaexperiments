As part of discussion in [jextract C++ support](https://mail.openjdk.org/pipermail/jextract-dev/2023-May/000756.html) mail thread [rust-bindgen](https://github.com/rust-lang/rust-bindgen) were identified as an example of "simple" approach of how C++ support can be implemented (except it is for Rust).

Such "simple" approach has certain issues but it does not require to maintain "shim" libraries.

To use `rust-bindgen`:

```bash
apt install cargo
cargo install bindgen
apt install rustfmt
~/.cargo/bin/bindgen unhappy.hpp -o unhappy.rs -- -x c++
```

# rust-bindgen examples

Example of what `rust-bindgen` produces for different C++ use cases:

- for [unhappy.hpp](/libcppexperiments/src/main/public/unhappy.hpp) - [unhappy.rs](unhappy.rs)

- [Open3D](https://github.com/isl-org/Open3D) library header [PointCloud.h](https://github.com/isl-org/Open3D/blob/10128192e6c444e3b37f28077489db555265418a/cpp/open3d/geometry/PointCloud.h) is in [PointCloud.rs](PointCloud.rs)

# C++ std::string

Here is an example of what `rust-bindgen` generates for C++ `std::string`:

``` bash
pub type std_string = std_basic_string<::std::os::raw::c_char>;

#[repr(C)]
pub struct std_basic_string<_CharT> {
    pub _M_dataplus: std_basic_string__Alloc_hider,
    pub _M_string_length: std_basic_string_size_type,
    pub __bindgen_anon_1: std_basic_string__bindgen_ty_2<_CharT>,
    pub _phantom_0: ::std::marker::PhantomData<::std::cell::UnsafeCell<_CharT>>,
}

#[repr(C)]
pub struct std_basic_string__Alloc_hider {
    pub _M_p: std_basic_string_pointer,
}

pub type std_basic_string_pointer = [u8; 0usize];

#[repr(C)]
pub struct std_basic_string__bindgen_ty_2<_CharT> {
    pub _M_local_buf: __BindgenUnionField<*mut _CharT>,
    pub _M_allocated_capacity: __BindgenUnionField<std_basic_string_size_type>,
    pub bindgen_union_field: u64,
    pub _phantom_0: ::std::marker::PhantomData<::std::cell::UnsafeCell<_CharT>>,
}
```
