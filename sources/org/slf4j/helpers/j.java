package org.slf4j.helpers;

import ci.a;
import ci.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

public class j implements a {

    /* renamed from: a  reason: collision with root package name */
    volatile boolean f72468a = false;

    /* renamed from: b  reason: collision with root package name */
    final Map f72469b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    final LinkedBlockingQueue f72470c = new LinkedBlockingQueue();

    public synchronized c a(String str) {
        i iVar;
        iVar = (i) this.f72469b.get(str);
        if (iVar == null) {
            iVar = new i(str, this.f72470c, this.f72468a);
            this.f72469b.put(str, iVar);
        }
        return iVar;
    }

    public void b() {
        this.f72469b.clear();
        this.f72470c.clear();
    }

    public LinkedBlockingQueue c() {
        return this.f72470c;
    }

    public List d() {
        return new ArrayList(this.f72469b.values());
    }

    public void e() {
        this.f72468a = true;
    }
}
