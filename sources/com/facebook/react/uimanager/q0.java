package com.facebook.react.uimanager;

import C7.d;
import E7.a;
import M7.b;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class q0 {
    static Map a(C0 c02) {
        Map b10 = p0.b();
        b10.put("ViewManagerNames", new ArrayList(c02.a()));
        b10.put("LazyViewManagersEnabled", Boolean.TRUE);
        return b10;
    }

    static Map b(List list, Map map, Map map2) {
        Map b10 = p0.b();
        Map a10 = p0.a();
        Map c10 = p0.c();
        if (map != null) {
            map.putAll(a10);
        }
        if (map2 != null) {
            map2.putAll(c10);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ViewManager viewManager = (ViewManager) it.next();
            String name = viewManager.getName();
            Map c11 = c(viewManager, (Map) null, (Map) null, map, map2);
            if (!c11.isEmpty()) {
                b10.put(name, c11);
            }
        }
        b10.put("genericBubblingEventTypes", a10);
        b10.put("genericDirectEventTypes", c10);
        return b10;
    }

    static Map c(ViewManager viewManager, Map map, Map map2, Map map3, Map map4) {
        HashMap b10 = d.b();
        Map<String, Object> exportedCustomBubblingEventTypeConstants = viewManager.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants != null) {
            if (b.i() && b.r()) {
                exportedCustomBubblingEventTypeConstants = e(exportedCustomBubblingEventTypeConstants);
            }
            f(map3, exportedCustomBubblingEventTypeConstants);
            f(exportedCustomBubblingEventTypeConstants, map);
            b10.put("bubblingEventTypes", exportedCustomBubblingEventTypeConstants);
        } else if (map != null) {
            b10.put("bubblingEventTypes", map);
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants = viewManager.getExportedCustomDirectEventTypeConstants();
        g(viewManager.getName(), exportedCustomDirectEventTypeConstants);
        if (exportedCustomDirectEventTypeConstants != null) {
            if (b.i() && b.r()) {
                exportedCustomDirectEventTypeConstants = e(exportedCustomDirectEventTypeConstants);
            }
            f(map4, exportedCustomDirectEventTypeConstants);
            f(exportedCustomDirectEventTypeConstants, map2);
            b10.put("directEventTypes", exportedCustomDirectEventTypeConstants);
        } else if (map2 != null) {
            b10.put("directEventTypes", map2);
        }
        Map<String, Object> exportedViewConstants = viewManager.getExportedViewConstants();
        if (exportedViewConstants != null) {
            b10.put("Constants", exportedViewConstants);
        }
        Map<String, Integer> commandsMap = viewManager.getCommandsMap();
        if (commandsMap != null) {
            b10.put("Commands", commandsMap);
        }
        Map<String, String> nativeProps = viewManager.getNativeProps();
        if (!nativeProps.isEmpty()) {
            b10.put("NativeProps", nativeProps);
        }
        return b10;
    }

    public static Map d() {
        return d.e("bubblingEventTypes", p0.a(), "directEventTypes", p0.c());
    }

    static Map e(Map map) {
        String str;
        if (map == null) {
            return null;
        }
        HashSet<String> hashSet = new HashSet<>();
        for (Object next : map.keySet()) {
            if (next instanceof String) {
                String str2 = (String) next;
                if (!str2.startsWith(VerticalAlignment.TOP)) {
                    hashSet.add(str2);
                }
            }
        }
        if (!(map instanceof HashMap)) {
            map = new HashMap(map);
        }
        for (String str3 : hashSet) {
            Object obj = map.get(str3);
            if (str3.startsWith("on")) {
                str = str3.substring(2);
            } else {
                str = str3.substring(0, 1).toUpperCase() + str3.substring(1);
            }
            map.put(VerticalAlignment.TOP + str, obj);
        }
        return map;
    }

    private static void f(Map map, Map map2) {
        if (map != null && map2 != null && !map2.isEmpty()) {
            for (Object next : map2.keySet()) {
                Object obj = map2.get(next);
                Object obj2 = map.get(next);
                if (obj2 == null || !(obj instanceof Map) || !(obj2 instanceof Map)) {
                    map.put(next, obj);
                } else {
                    if (!(obj2 instanceof HashMap)) {
                        HashMap hashMap = new HashMap((Map) obj2);
                        map.replace(next, hashMap);
                        obj2 = hashMap;
                    }
                    f((Map) obj2, (Map) obj);
                }
            }
        }
    }

    private static void g(String str, Map map) {
        String str2;
        if (a.f30669b && map != null) {
            for (String str3 : map.keySet()) {
                Object obj = map.get(str3);
                if (obj != null && (obj instanceof Map) && (str2 = (String) ((Map) obj).get("registrationName")) != null && str3.startsWith(VerticalAlignment.TOP) && str2.startsWith("on") && !str3.substring(3).equals(str2.substring(2))) {
                    U5.a.m("UIManagerModuleConstantsHelper", String.format("Direct event name for '%s' doesn't correspond to the naming convention, expected 'topEventName'->'onEventName', got '%s'->'%s'", new Object[]{str, str3, str2}));
                }
            }
        }
    }
}
