DESCRIPTION = "Raspberry Pi3 core image with Qt5"

inherit core-image extrausers populate_sdk_qt5

IMAGE_FEATURES += "package-management ssh-server-dropbear tools-debug"

# Qt Packages
IMAGE_INSTALL += " \
    qtbase \
    qtbase-plugins \
    qtdeclarative \
    qtdeclarative-qmlplugins \
    qtdeclarative-tools \
    qtmultimedia \
    qtmultimedia-plugins \
    qtmultimedia-qmlplugins \
    qtwebkit \
    qtwebkit-qmlplugins \
    qtsvg \
    qtsvg-plugins \
    qt5-opengles2-test \
    qt5-env-settings \
    fontconfig \
    fontconfig-utils \
    ttf-bitstream-vera \
    tslib \
    tslib-conf \
    tslib-calibrate \
    tslib-tests \
    "

EXTRA_USERS_PARAMS = "usermod -P root root; "

export IMAGE_BASENAME = "core-image-qt5"