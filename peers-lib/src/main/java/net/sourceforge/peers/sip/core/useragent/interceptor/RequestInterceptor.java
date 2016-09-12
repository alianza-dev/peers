package net.sourceforge.peers.sip.core.useragent.interceptor;

import net.sourceforge.peers.sip.transport.SipRequest;

public interface RequestInterceptor {
    void postProcess(SipRequest request);
}
