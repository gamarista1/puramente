package com.google.protobuf;

import java.io.IOException;

/* renamed from: com.google.protobuf.v  reason: case insensitive filesystem */
public class C4883v extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    /* renamed from: a  reason: collision with root package name */
    private K f58667a = null;

    /* renamed from: com.google.protobuf.v$a */
    public static class a extends C4883v {
        private static final long serialVersionUID = 3283890091615336259L;

        public a(String str) {
            super(str);
        }
    }

    public C4883v(String str) {
        super(str);
    }

    static a a() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static C4883v b() {
        return new C4883v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static C4883v c() {
        return new C4883v("Failed to parse the message.");
    }

    static C4883v d() {
        return new C4883v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
