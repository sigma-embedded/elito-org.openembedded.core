SUMMARY = "Utilities for manipulating filesystem extended attributes"
HOMEPAGE = "http://savannah.nongnu.org/projects/attr/"
SECTION = "libs"

DEPENDS = "virtual/libintl"

LICENSE = "LGPLv2.1+ & GPLv2+"
LICENSE_${PN} = "GPLv2+"
LICENSE_lib${BPN} = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://doc/COPYING;md5=2d0aa14b3fce4694e4f615e30186335f \
                    file://tools/attr.c;endline=17;md5=be0403261f0847e5f43ed5b08d19593c \
                    file://libattr/libattr.c;endline=17;md5=7970f77049f8fa1199fff62a7ab724fb"

SRC_URI = "${SAVANNAH_GNU_MIRROR}/attr/${BP}.tar.gz"
SRC_URI[md5sum] = "bc1e5cb5c96d99b24886f1f527d3bb3d"
SRC_URI[sha256sum] = "5ead72b358ec709ed00bbf7a9eaef1654baad937c001c044fe8b74c57f5324e7"

inherit autotools gettext update-alternatives

BBCLASSEXTEND = "native nativesdk"

ALTERNATIVE_PRIORITY = "100"
ALTERNATIVE_${PN} = "setfattr"
ALTERNATIVE_TARGET[setfattr] = "${bindir}/setfattr"

PACKAGES =+ "lib${BPN}"
FILES_lib${BPN} = "${libdir}/lib*${SOLIBS}"
