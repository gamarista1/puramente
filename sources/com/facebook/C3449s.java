package com.facebook;

import android.content.ContentProvider;
import java.util.Arrays;
import java.util.UUID;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;

/* renamed from: com.facebook.s  reason: case insensitive filesystem */
public abstract class C3449s extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    public static final a f42386a = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private static final String f42387b = C3449s.class.getName();

    /* renamed from: com.facebook.s$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String str, UUID uuid, String str2) {
            C6496s.h(uuid, "callId");
            U u10 = U.f71764a;
            String format = String.format("%s%s/%s/%s", Arrays.copyOf(new Object[]{"content://com.facebook.app.FacebookContentProvider", str, uuid.toString(), str2}, 4));
            C6496s.g(format, "format(format, *args)");
            return format;
        }

        private a() {
        }
    }
}
