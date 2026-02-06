package org.slf4j.helpers;

import java.util.HashMap;
import java.util.Map;

public class a implements ei.a {

    /* renamed from: a  reason: collision with root package name */
    private InheritableThreadLocal f72453a = new C1045a();

    /* renamed from: org.slf4j.helpers.a$a  reason: collision with other inner class name */
    class C1045a extends InheritableThreadLocal {
        C1045a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Map childValue(Map map) {
            if (map == null) {
                return null;
            }
            return new HashMap(map);
        }
    }
}
