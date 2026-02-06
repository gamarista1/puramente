package com.google.protobuf;

import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.protobuf.k  reason: case insensitive filesystem */
public class C4873k {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f58503b = true;

    /* renamed from: c  reason: collision with root package name */
    private static volatile C4873k f58504c;

    /* renamed from: d  reason: collision with root package name */
    static final C4873k f58505d = new C4873k(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map f58506a = Collections.emptyMap();

    C4873k(boolean z10) {
    }

    public static C4873k a() {
        C4873k kVar = f58504c;
        if (kVar == null) {
            synchronized (C4873k.class) {
                try {
                    kVar = f58504c;
                    if (kVar == null) {
                        if (f58503b) {
                            kVar = C4872j.a();
                        } else {
                            kVar = f58505d;
                        }
                        f58504c = kVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return kVar;
    }
}
