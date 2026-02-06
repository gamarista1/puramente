package Jb;

import Jb.q;
import Sb.d;
import java.util.HashMap;
import java.util.Map;

class b implements q.c {

    /* renamed from: f  reason: collision with root package name */
    private static long f51216f;

    /* renamed from: a  reason: collision with root package name */
    private f f51217a;

    /* renamed from: b  reason: collision with root package name */
    private q f51218b;

    /* renamed from: c  reason: collision with root package name */
    private a f51219c;

    /* renamed from: d  reason: collision with root package name */
    private c f51220d = c.REALTIME_CONNECTING;

    /* renamed from: e  reason: collision with root package name */
    private final Sb.c f51221e;

    public interface a {
        void d(String str);

        void f(Map map);

        void m(String str);

        void o(long j10, String str);

        void q(C0787b bVar);
    }

    /* renamed from: Jb.b$b  reason: collision with other inner class name */
    public enum C0787b {
        SERVER_RESET,
        OTHER
    }

    private enum c {
        REALTIME_CONNECTING,
        REALTIME_CONNECTED,
        REALTIME_DISCONNECTED
    }

    public b(c cVar, f fVar, String str, a aVar, String str2, String str3) {
        long j10 = f51216f;
        f51216f = 1 + j10;
        this.f51217a = fVar;
        this.f51219c = aVar;
        d f10 = cVar.f();
        this.f51221e = new Sb.c(f10, "Connection", "conn_" + j10);
        this.f51218b = new q(cVar, fVar, str, str3, this, str2);
    }

    private void e(long j10, String str) {
        if (this.f51221e.f()) {
            this.f51221e.b("realtime connection established", new Object[0]);
        }
        this.f51220d = c.REALTIME_CONNECTED;
        this.f51219c.o(j10, str);
    }

    private void f(String str) {
        if (this.f51221e.f()) {
            this.f51221e.b("Connection shutdown command received. Shutting down...", new Object[0]);
        }
        this.f51219c.d(str);
        c();
    }

    private void g(Map map) {
        if (this.f51221e.f()) {
            Sb.c cVar = this.f51221e;
            cVar.b("Got control message: " + map.toString(), new Object[0]);
        }
        try {
            String str = (String) map.get("t");
            if (str == null) {
                if (this.f51221e.f()) {
                    Sb.c cVar2 = this.f51221e;
                    cVar2.b("Got invalid control message: " + map.toString(), new Object[0]);
                }
                c();
            } else if (str.equals("s")) {
                f((String) map.get("d"));
            } else if (str.equals("r")) {
                j((String) map.get("d"));
            } else if (str.equals("h")) {
                i((Map) map.get("d"));
            } else if (this.f51221e.f()) {
                Sb.c cVar3 = this.f51221e;
                cVar3.b("Ignoring unknown control message: " + str, new Object[0]);
            }
        } catch (ClassCastException e10) {
            if (this.f51221e.f()) {
                Sb.c cVar4 = this.f51221e;
                cVar4.b("Failed to parse control message: " + e10.toString(), new Object[0]);
            }
            c();
        }
    }

    private void h(Map map) {
        if (this.f51221e.f()) {
            Sb.c cVar = this.f51221e;
            cVar.b("received data message: " + map.toString(), new Object[0]);
        }
        this.f51219c.f(map);
    }

    private void i(Map map) {
        long longValue = ((Long) map.get("ts")).longValue();
        this.f51219c.m((String) map.get("h"));
        String str = (String) map.get("s");
        if (this.f51220d == c.REALTIME_CONNECTING) {
            this.f51218b.y();
            e(longValue, str);
        }
    }

    private void j(String str) {
        if (this.f51221e.f()) {
            Sb.c cVar = this.f51221e;
            cVar.b("Got a reset; killing connection to " + this.f51217a.b() + "; Updating internalHost to " + str, new Object[0]);
        }
        this.f51219c.m(str);
        d(C0787b.SERVER_RESET);
    }

    private void l(Map map, boolean z10) {
        if (this.f51220d != c.REALTIME_CONNECTED) {
            this.f51221e.b("Tried to send on an unconnected connection", new Object[0]);
            return;
        }
        if (z10) {
            this.f51221e.b("Sending data (contents hidden)", new Object[0]);
        } else {
            this.f51221e.b("Sending data: %s", map);
        }
        this.f51218b.v(map);
    }

    public void a(boolean z10) {
        this.f51218b = null;
        if (z10 || this.f51220d != c.REALTIME_CONNECTING) {
            if (this.f51221e.f()) {
                this.f51221e.b("Realtime connection lost", new Object[0]);
            }
        } else if (this.f51221e.f()) {
            this.f51221e.b("Realtime connection failed", new Object[0]);
        }
        c();
    }

    public void b(Map map) {
        try {
            String str = (String) map.get("t");
            if (str == null) {
                if (this.f51221e.f()) {
                    Sb.c cVar = this.f51221e;
                    cVar.b("Failed to parse server message: missing message type:" + map.toString(), new Object[0]);
                }
                c();
            } else if (str.equals("d")) {
                h((Map) map.get("d"));
            } else if (str.equals("c")) {
                g((Map) map.get("d"));
            } else if (this.f51221e.f()) {
                Sb.c cVar2 = this.f51221e;
                cVar2.b("Ignoring unknown server message type: " + str, new Object[0]);
            }
        } catch (ClassCastException e10) {
            if (this.f51221e.f()) {
                Sb.c cVar3 = this.f51221e;
                cVar3.b("Failed to parse server message: " + e10.toString(), new Object[0]);
            }
            c();
        }
    }

    public void c() {
        d(C0787b.OTHER);
    }

    public void d(C0787b bVar) {
        c cVar = this.f51220d;
        c cVar2 = c.REALTIME_DISCONNECTED;
        if (cVar != cVar2) {
            if (this.f51221e.f()) {
                this.f51221e.b("closing realtime connection", new Object[0]);
            }
            this.f51220d = cVar2;
            q qVar = this.f51218b;
            if (qVar != null) {
                qVar.k();
                this.f51218b = null;
            }
            this.f51219c.q(bVar);
        }
    }

    public void k() {
        if (this.f51221e.f()) {
            this.f51221e.b("Opening a connection", new Object[0]);
        }
        this.f51218b.t();
    }

    public void m(Map map, boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put("t", "d");
        hashMap.put("d", map);
        l(hashMap, z10);
    }
}
