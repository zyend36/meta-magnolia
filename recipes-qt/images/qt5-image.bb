SUMMARY = "A Qt5 image"
HOMEPAGE = ""
LICENSE = "MIT"

require qt5-basic-image.bb

inherit populate_sdk_qt5

QT5_PKGS = " \
    gstreamer1.0 \
    gst-plugins-base-app \
    gst-plugins-base \
    gst-plugins-good \
    gst-plugins-bad \
    qt3d \
    qt3d-qmlplugins \
    qtcharts \
    qtdeclarative \
    qtdeclarative-plugins \
    qtdeclarative-tools \
    qtdeclarative-qmlplugins \
    qtgraphicaleffects \
    qtlocation-plugins \
    qtmultimedia \
    qtmultimedia-plugins \
    qtmultimedia-qmlplugins \
    qtquickcontrols2 \
    qtsensors \
    qtsensors-plugins \
    qtserialbus \
    qtsystems \
    qtsystems-tools \
    qtsystems-qmlplugins \
    qtsvg \
    qtwebsockets-qmlplugins \
    qtvirtualkeyboard \
    qtxmlpatterns \
    alsa-lib alsa-tools alsa-state pulseaudio  \
"

IMAGE_INSTALL += " \
    ${QT5_PKGS} \
    cinematicexperience \
"

export IMAGE_BASENAME = "qt5-image"
