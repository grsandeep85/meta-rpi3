#
# This file is the Qt5 environment settings recipe.
#

SUMMARY = "Qt5 Qt5 environment settings"
AUTHOR = "Sandeep Gundlupet Raju <grsandeep85@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " \
    file://qt5-env-settings.sh \
"

PR = "r1"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${sysconfdir}/profile.d
    install -m 0755 qt5-env-settings.sh ${D}${sysconfdir}/profile.d
}

FILES_${PN} = "${sysconfdir}"
