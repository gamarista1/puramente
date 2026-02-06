package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4536s;

public class m extends ub.m {

    /* renamed from: a  reason: collision with root package name */
    private final int f58087a;

    /* renamed from: b  reason: collision with root package name */
    private final int f58088b;

    /* renamed from: c  reason: collision with root package name */
    private Throwable f58089c;

    m(int i10, Throwable th2, int i11) {
        super(g(i10));
        this.f58089c = th2;
        this.f58087a = i10;
        this.f58088b = i11;
        Log.e("StorageException", "StorageException has occurred.\n" + g(i10) + "\n Code: " + i10 + " HttpResult: " + i11);
        Throwable th3 = this.f58089c;
        if (th3 != null) {
            Log.e("StorageException", th3.getMessage(), this.f58089c);
        }
    }

    private static int a(Status status) {
        if (status.isCanceled()) {
            return -13040;
        }
        if (status.equals(Status.f53910i)) {
            return -13030;
        }
        return -13000;
    }

    private static int b(Throwable th2, int i10) {
        if (i10 == -2) {
            return -13030;
        }
        if (i10 == 401) {
            return -13020;
        }
        if (i10 == 409) {
            return -13031;
        }
        if (i10 != 403) {
            return i10 != 404 ? -13000 : -13010;
        }
        return -13021;
    }

    public static m c(Status status) {
        C4536s.l(status);
        C4536s.a(!status.s0());
        return new m(a(status), (Throwable) null, 0);
    }

    public static m d(Throwable th2) {
        return e(th2, 0);
    }

    public static m e(Throwable th2, int i10) {
        if (th2 instanceof m) {
            return (m) th2;
        }
        if (!h(i10) || th2 != null) {
            return new m(b(th2, i10), th2, i10);
        }
        return null;
    }

    static String g(int i10) {
        if (i10 == -13040) {
            return "The operation was cancelled.";
        }
        if (i10 == -13031) {
            return "Object has a checksum which does not match. Please retry the operation.";
        }
        if (i10 == -13030) {
            return "The operation retry limit has been exceeded.";
        }
        if (i10 == -13021) {
            return "User does not have permission to access this object.";
        }
        if (i10 == -13020) {
            return "User is not authenticated, please authenticate using Firebase Authentication and try again.";
        }
        switch (i10) {
            case -13013:
                return "Quota for bucket exceeded, please view quota on www.firebase.google.com/storage.";
            case -13012:
                return "Project does not exist.";
            case -13011:
                return "Bucket does not exist.";
            case -13010:
                return "Object does not exist at location.";
            default:
                return "An unknown error occurred, please check the HTTP result code and inner exception for server response.";
        }
    }

    private static boolean h(int i10) {
        return i10 == 0 || (i10 >= 200 && i10 < 300);
    }

    public int f() {
        return this.f58087a;
    }

    public synchronized Throwable getCause() {
        Throwable th2 = this.f58089c;
        if (th2 == this) {
            return null;
        }
        return th2;
    }
}
