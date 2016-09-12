package net.sourceforge.peers.sip.core.useragent.interceptor;

import net.sourceforge.peers.sip.transport.SipResponse;

public interface ResponseInterceptor {
    void responseProcess(SipResponse response);
}
