DESCRIPTION = "Qt5 supported Packages"
LICENSE = "MIT"

QT_PACKAGES = " \
    ruby \
	cpufrequtils \
	qtbase \
	qtbase-mkspecs \
	qtbase-plugins \
	qtsystems \
	qtsystems-mkspecs \
	qtbase-staticdev \
	qttranslations-qt \
	qttranslations-qtbase \
	qttranslations-qtconfig \
	qttranslations-qthelp \
	qtconnectivity \
	qtconnectivity-mkspecs \
	qttranslations-qtconnectivity \
	qtdeclarative \
	qtdeclarative-mkspecs \
	qtdeclarative-plugins \
	qtdeclarative-staticdev \
	qtdeclarative-qmlplugins \
	qttranslations-qmlviewer \
	qtdeclarative-tools \
	qttranslations-qtdeclarative \
	qtenginio \
	qtenginio-mkspecs \
	qtimageformats \
	qtimageformats-plugins \
	qtlocation \
	qtlocation-mkspecs \
	qtlocation-plugins \
    qtmultimedia \
    qtmultimedia-plugins \
    qtmultimedia-qmlplugins \
	qttranslations-qtmultimedia \
	qtscript \
	qtscript-mkspecs \
	qttranslations-qtscript \
	qtsensors \
	qtsensors-mkspecs \
	qtsensors-plugins \
	qtserialport \
	qtserialport-mkspecs \
	qtsvg \
	qtsvg-mkspecs \
	qtsvg-plugins \
	qttools \
	qttools-mkspecs \
	qttools-staticdev \
	qttools-tools \
	qtwebsockets \
	qtwebsockets-mkspecs \
	qttranslations-qtwebsockets \
	qtwebchannel \
	qtwebchannel-mkspecs \
	qtxmlpatterns \
	qtxmlpatterns-mkspecs \
	qttranslations-qtxmlpatterns \
	qtbase-examples \
	qtquick1 \
	qtquick1-mkspecs \
	qtquick1-plugins \
	qttranslations-qtquick1 \
	qtwebkit \
	qtwebkit-examples-examples \
	qtwebkit-mkspecs \
	qtquickcontrols-qmlplugins \
	qttools-plugins \
	qtcharts \
	"
RDEPENDS_${PN} += "${QT_PACKAGES}"