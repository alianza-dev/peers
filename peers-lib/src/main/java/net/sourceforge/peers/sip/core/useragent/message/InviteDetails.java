package net.sourceforge.peers.sip.core.useragent.message;

import net.sourceforge.peers.sip.core.useragent.interceptor.RequestInterceptor;
import net.sourceforge.peers.sip.core.useragent.interceptor.ResponseInterceptor;
import net.sourceforge.peers.sip.transport.SipRequest;
import net.sourceforge.peers.sip.transport.SipResponse;

import java.util.ArrayList;
import java.util.List;

public class InviteDetails {
    private String toTag;
    private String fromTag;
    private String requestUri;
    private String callId;
    private List<RequestInterceptor> requestInterceptors;
    private List<ResponseInterceptor> responseInterceptors;

    public InviteDetails() {
        requestInterceptors = new ArrayList<RequestInterceptor>();
        responseInterceptors = new ArrayList<ResponseInterceptor>();
    }

    public String getToTag() {
        return toTag;
    }

    public void setToTag(String toTag) {
        this.toTag = toTag;
    }

    public String getFromTag() {
        return fromTag;
    }

    public void setFromTag(String fromTag) {
        this.fromTag = fromTag;
    }

    public String getRequestUri() {
        return requestUri;
    }

    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri;
    }

    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
    }

    public void addRequestInterceptor(RequestInterceptor interceptor) {
        requestInterceptors.add(interceptor);
    }

    public void addResponseInterceptor(ResponseInterceptor interceptor) {
        responseInterceptors.add(interceptor);
    }

    public void triggerRequest(SipRequest request) {
        for (RequestInterceptor i : requestInterceptors) {
            i.postProcess(request);
        }
    }

    public void triggerResponse(SipResponse response) {
        for (ResponseInterceptor i : responseInterceptors) {
            i.responseProcess(response);
        }
    }
}
