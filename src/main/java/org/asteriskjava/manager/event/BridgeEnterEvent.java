package org.asteriskjava.manager.event;

/**
 * Created by Alexander Polakov <apolyakov@beget.ru> on 1/26/15.
 */
public class BridgeEnterEvent extends AbstractBridgeEvent {
    private String channel;

    public BridgeEnterEvent(Object source) { super(source); }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}