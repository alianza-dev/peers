package net.sourceforge.peers.sip.core.useragent.message.builder;

import net.sourceforge.peers.sip.core.useragent.message.InviteDetails;

public class InviteBuilder {
    private final InviteDetails details;

    public InviteBuilder(final String toNumber, final String callId) {
        details = new InviteDetails();
        details.setRequestUri(toNumber);
        details.setCallId(callId);
    }

    public InviteDetails build() {
        return details;
    }
}
