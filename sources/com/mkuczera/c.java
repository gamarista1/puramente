package com.mkuczera;

import java.util.HashMap;
import java.util.Map;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    static Map f59168a;

    static {
        HashMap hashMap = new HashMap();
        f59168a = hashMap;
        hashMap.put("impactLight", new f(new long[]{0, 20}));
        f59168a.put("impactMedium", new f(new long[]{0, 40}));
        f59168a.put("impactHeavy", new f(new long[]{0, 60}));
        f59168a.put("notificationSuccess", new f(new long[]{0, 40, 60, 20}));
        f59168a.put("notificationWarning", new f(new long[]{0, 20, 60, 40}));
        f59168a.put("notificationError", new f(new long[]{0, 20, 40, 30, 40, 40}));
        f59168a.put("rigid", new f(new long[]{0, 30}));
        f59168a.put("soft", new f(new long[]{0, 10}));
        f59168a.put("clockTick", new g(4));
        f59168a.put("contextClick", new g(6));
        f59168a.put("keyboardPress", new g(3));
        f59168a.put("keyboardRelease", new g(7));
        f59168a.put("keyboardTap", new g(3));
        f59168a.put("longPress", new g(0));
        f59168a.put("textHandleMove", new g(9));
        f59168a.put("virtualKey", new g(1));
        f59168a.put("virtualKeyRelease", new g(8));
        f59168a.put("effectClick", new e(0));
        f59168a.put("effectDoubleClick", new e(1));
        f59168a.put("effectHeavyClick", new e(5));
        f59168a.put("effectTick", new e(2));
    }

    public static b a(String str) {
        return (b) f59168a.get(str);
    }
}
