package org.sid.commonapi.events;

import lombok.Getter;

//=> type generic
public abstract class BaseEvent<T> {
    @Getter private T id;

    public BaseEvent(T id) {
        this.id = id;
    }
}
