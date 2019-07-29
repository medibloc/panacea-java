package org.medibloc.panacea.ledger.common;

import java.io.IOException;

public interface BTChipTransport {
    byte[] exchange(byte[] command) throws IOException;

    void close() throws IOException;
}
