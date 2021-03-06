package io.example;

/**
 * An event that encapsulates a state transition for the {@link Friend}
 * domain object.
 *
 * @link Kenny Bastani
 */
public class FriendEvent {

    private FriendMessage subject;
    private EventType eventType;

    public FriendEvent() {
    }

    public FriendEvent(FriendMessage subject, EventType eventType) {
        this.subject = subject;
        this.eventType = eventType;
    }

    public FriendMessage getSubject() {
        return subject;
    }

    public void setSubject(FriendMessage subject) {
        this.subject = subject;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }
}
