SUMMARY = "A basic Qt5 qwidgets dev image"
LICENSE = "MIT"

#require console-image.bb

QT_TOOLS = " \
    qtbase \
    qtbase-dev \
    qtbase-mkspecs \
    qtbase-plugins \
    qtbase-tools \
"

FONTS = " \
    fontconfig \
    fontconfig-utils \
    ttf-bitstream-vera \
"

QT_SERIALPORT = " \
    qtserialport-dev \
    qtserialport-mkspecs \
"

TSLIB = " \
    tslib-conf \
    tslib-calibrate \
    tslib-dev \
    tslib \
"

IMAGE_INSTALL += " \
    ${FONTS} \
    ${QT_TOOLS} \
    ${QT_SERIALPORT} \
    ${TSLIB} \
"

export IMAGE_BASENAME = "qt5-basic-image"
