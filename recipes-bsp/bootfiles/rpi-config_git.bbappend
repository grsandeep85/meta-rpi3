do_deploy_append() {
    echo 'dtoverlay=rpi-ft5406' >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "# Enable UART" >>${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "enable_uart=1" >>${DEPLOYDIR}/bcm2835-bootfiles/config.txt
}
