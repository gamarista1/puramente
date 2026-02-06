package com.amazon.a.a.n.a.a;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.amazon.a.a.d.b;

public class d extends b {

    /* renamed from: a  reason: collision with root package name */
    private static final long f37317a = 1;

    public d(RemoteException remoteException) {
        super(a(remoteException));
    }

    private static String a(RemoteException remoteException) {
        if (remoteException instanceof DeadObjectException) {
            return "COMMAND_SERVICE_DEAD_OBJECT_EXCEPTION";
        }
        return "COMMAND_SERVICE_REMOTE_EXCEPTION";
    }
}
