package com.nowcoder.async;

import java.util.List;

/**
 * Created by guan on 2018/7/10.
 */
public interface EventHandler {
    void doHandle(EventModel model);

    List<EventType> getSupportEventTypes();
}
