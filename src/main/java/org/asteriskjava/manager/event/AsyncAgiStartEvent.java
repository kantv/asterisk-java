package org.asteriskjava.manager.event;

/**
 * Created by plhk on 1/15/15.
 */
public class AsyncAgiStartEvent extends AsyncAgiEvent
{
    public AsyncAgiStartEvent(Object source) {  super(source); setSubEvent(SUB_EVENT_START); }
}
