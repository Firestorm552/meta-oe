require quagga.inc

PR = "${INC_PR}.0"

SRC_URI += "file://0001-doc-fix-makeinfo-errors-and-one-warning.patch \
            file://lingering-IP-address-after-deletion-BZ-486.patch \
            file://build-fix-extract.pl-for-cross-compilation.patch \
"

SRC_URI[quagga-0.99.21.md5sum] = "99840adbe57047c90dfba6b6ed9aec7f"
SRC_URI[quagga-0.99.21.sha256sum] = "9b8aea9026b4771a28e254a66cbd854723bcd0d71eebd0201d11838d4eb392ee"

QUAGGASUBDIR = ""
