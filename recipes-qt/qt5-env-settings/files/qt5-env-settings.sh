#!/bin/sh

# Exporting QT environment variables
export PATH=${PATH}:/usr/bin/qt5
export QT_QPA_PLATFORM=eglfs

# Official Raspberry Pi 7" touchscreen
export QT_QPA_EGLFS_PHYSICAL_WIDTH=155
export QT_QPA_EGLFS_PHYSICAL_HEIGHT=86

# For Keyboard, Mouse, Fonts, Plugins and QML
#export QT_QPA_GENERIC_PLUGINS=evdevmouse,evdevkeyboard
#export QT_QPA_ENABLE_TERMINAL_KEYBOARD=1
#export QT_QPA_FONTDIR=/usr/share/fonts/truetype
#export QT_QPA_PLATFORM_PLUGIN_PATH=/usr/lib/qt5/plugins
#export QML2_IMPORT_PATH=/usr/lib/qt5/qml

# Generate dbus machine ID
#dbus-uuidgen > /var/lib/dbus/machine-id

# Run Qt OpenGL exmaple
#./usr/share/qt5/examples/gui/openglwindow/openglwindow &

# Kill running X11 session
#killall Xorg

# Exporting Display environment variables and start Xorg session
#export DISPLAY=:0.0
#/usr/bin/Xorg -depth 16&