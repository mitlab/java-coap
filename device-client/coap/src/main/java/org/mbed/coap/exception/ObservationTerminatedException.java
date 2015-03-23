/**
 * Copyright (C) 2011-2014 ARM Limited. All rights reserved.
 */
package org.mbed.coap.exception;

import org.mbed.coap.packet.CoapPacket;

/**
 *
 * @author szymon
 */
public class ObservationTerminatedException extends CoapException {

    private final CoapPacket packet;

    public ObservationTerminatedException(CoapPacket packet) {
        super("Coap message exception");
        this.packet = packet;
    }

    public CoapPacket getNotification() {
        return packet;
    }

}
