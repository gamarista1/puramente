package Gh;

import Sg.p;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.jvm.internal.C6496s;

abstract /* synthetic */ class I {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f63217a = Logger.getLogger("okio.Okio");

    public static final U b(File file) {
        C6496s.h(file, "<this>");
        return H.h(new FileOutputStream(file, true));
    }

    public static final boolean c(AssertionError assertionError) {
        boolean z10;
        C6496s.h(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        if (message != null) {
            z10 = p.O(message, "getsockname failed", false, 2, (Object) null);
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return false;
    }

    public static final U d(File file) {
        C6496s.h(file, "<this>");
        return h(file, false, 1, (Object) null);
    }

    public static final U e(File file, boolean z10) {
        C6496s.h(file, "<this>");
        return H.h(new FileOutputStream(file, z10));
    }

    public static final U f(OutputStream outputStream) {
        C6496s.h(outputStream, "<this>");
        return new L(outputStream, new X());
    }

    public static final U g(Socket socket) {
        C6496s.h(socket, "<this>");
        V v10 = new V(socket);
        OutputStream outputStream = socket.getOutputStream();
        C6496s.g(outputStream, "getOutputStream(...)");
        return v10.z(new L(outputStream, v10));
    }

    public static /* synthetic */ U h(File file, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return H.g(file, z10);
    }

    public static final W i(File file) {
        C6496s.h(file, "<this>");
        return new C5417s(new FileInputStream(file), X.f63257e);
    }

    public static final W j(InputStream inputStream) {
        C6496s.h(inputStream, "<this>");
        return new C5417s(inputStream, new X());
    }

    public static final W k(Socket socket) {
        C6496s.h(socket, "<this>");
        V v10 = new V(socket);
        InputStream inputStream = socket.getInputStream();
        C6496s.g(inputStream, "getInputStream(...)");
        return v10.A(new C5417s(inputStream, v10));
    }
}
