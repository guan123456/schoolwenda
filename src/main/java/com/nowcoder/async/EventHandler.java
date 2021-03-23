package com.nowcoder.async;

import java.util.List;

/**
 * Created by guan on 2021/1/16.
 */
public interface EventHandler {
    void doHandle(EventModel model);

    List<EventType> getSupportEventTypes();
}
