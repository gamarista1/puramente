package com.amazon.a.a.c;

import com.amazon.a.a.c.a;
import com.amazon.a.a.o.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class e<EventType extends a> implements Comparator<c<EventType>> {

    /* renamed from: a  reason: collision with root package name */
    private static final c f37150a = new c("EventListenerNotificationQueue");

    /* renamed from: b  reason: collision with root package name */
    private List<c<EventType>> f37151b = new ArrayList();

    public void a(c<EventType> cVar) {
        if (c.f37534a) {
            c cVar2 = f37150a;
            cVar2.a("Adding listener: " + cVar);
        }
        this.f37151b.add(cVar);
        Collections.sort(this.f37151b, this);
    }

    public void a(EventType eventtype) {
        for (c next : this.f37151b) {
            if (c.f37534a) {
                c cVar = f37150a;
                cVar.a("Notifying listener: " + next);
            }
            next.a(eventtype);
        }
    }

    /* renamed from: a */
    public int compare(c<EventType> cVar, c<EventType> cVar2) {
        return cVar.b().compareTo(cVar2.b());
    }
}
