package org.asteriskjava.manager.event;

/**
 * Created by plhk on 1/15/15.
 */
public class AgiExecEndEvent extends AgiExecEvent {
    public AgiExecEndEvent(Object source) { super(source); setSubEvent(SUB_EVENT_END); }
}
