package org.asteriskjava.manager.event;

/**
 * Created by plhk on 1/15/15.
 */
public class AsyncAgiEndEvent extends AsyncAgiEvent {
    public AsyncAgiEndEvent(Object source) { super(source); setSubEvent(SUB_EVENT_END); }
}
