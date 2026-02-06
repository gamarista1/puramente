package Ub;

import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import com.adjust.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.lang.Thread;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;

public class c {

    /* renamed from: l  reason: collision with root package name */
    private static final AtomicInteger f53332l = new AtomicInteger(0);

    /* renamed from: m  reason: collision with root package name */
    private static final Charset f53333m = Charset.forName(Constants.ENCODING);

    /* renamed from: n  reason: collision with root package name */
    private static ThreadFactory f53334n = Executors.defaultThreadFactory();

    /* renamed from: o  reason: collision with root package name */
    private static b f53335o = new a();

    /* renamed from: a  reason: collision with root package name */
    private volatile d f53336a = d.NONE;

    /* renamed from: b  reason: collision with root package name */
    private volatile Socket f53337b = null;

    /* renamed from: c  reason: collision with root package name */
    private d f53338c = null;

    /* renamed from: d  reason: collision with root package name */
    private final URI f53339d;

    /* renamed from: e  reason: collision with root package name */
    private final String f53340e;

    /* renamed from: f  reason: collision with root package name */
    private final h f53341f;

    /* renamed from: g  reason: collision with root package name */
    private final i f53342g;

    /* renamed from: h  reason: collision with root package name */
    private final f f53343h;

    /* renamed from: i  reason: collision with root package name */
    private final Sb.c f53344i;

    /* renamed from: j  reason: collision with root package name */
    private final int f53345j;

    /* renamed from: k  reason: collision with root package name */
    private final Thread f53346k;

    class a implements b {
        a() {
        }

        public void a(Thread thread, String str) {
            thread.setName(str);
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            c.this.n();
        }
    }

    /* renamed from: Ub.c$c  reason: collision with other inner class name */
    static /* synthetic */ class C0811c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f53348a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                Ub.c$d[] r0 = Ub.c.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f53348a = r0
                Ub.c$d r1 = Ub.c.d.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f53348a     // Catch:{ NoSuchFieldError -> 0x001d }
                Ub.c$d r1 = Ub.c.d.CONNECTING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f53348a     // Catch:{ NoSuchFieldError -> 0x0028 }
                Ub.c$d r1 = Ub.c.d.CONNECTED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f53348a     // Catch:{ NoSuchFieldError -> 0x0033 }
                Ub.c$d r1 = Ub.c.d.DISCONNECTING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f53348a     // Catch:{ NoSuchFieldError -> 0x003e }
                Ub.c$d r1 = Ub.c.d.DISCONNECTED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Ub.c.C0811c.<clinit>():void");
        }
    }

    private enum d {
        NONE,
        CONNECTING,
        CONNECTED,
        DISCONNECTING,
        DISCONNECTED
    }

    public c(Jb.c cVar, URI uri, String str, Map map) {
        int incrementAndGet = f53332l.incrementAndGet();
        this.f53345j = incrementAndGet;
        this.f53346k = j().newThread(new b());
        this.f53339d = uri;
        this.f53340e = cVar.g();
        Sb.d f10 = cVar.f();
        this.f53344i = new Sb.c(f10, "WebSocket", "sk_" + incrementAndGet);
        this.f53343h = new f(uri, str, map);
        this.f53341f = new h(this);
        this.f53342g = new i(this, "TubeSock", incrementAndGet);
    }

    private synchronized void d() {
        if (this.f53336a != d.DISCONNECTED) {
            this.f53341f.h();
            this.f53342g.i();
            if (this.f53337b != null) {
                try {
                    this.f53337b.close();
                } catch (Exception e10) {
                    this.f53338c.b(new e("Failed to close", e10));
                }
            }
            this.f53336a = d.DISCONNECTED;
            this.f53338c.a();
        }
    }

    private Socket f() {
        String scheme = this.f53339d.getScheme();
        String host = this.f53339d.getHost();
        int port = this.f53339d.getPort();
        if (scheme != null && scheme.equals("ws")) {
            if (port == -1) {
                port = 80;
            }
            try {
                return new Socket(host, port);
            } catch (UnknownHostException e10) {
                throw new e("unknown host: " + host, e10);
            } catch (IOException e11) {
                throw new e("error while creating socket to " + this.f53339d, e11);
            }
        } else if (scheme == null || !scheme.equals("wss")) {
            throw new e("unsupported protocol: " + scheme);
        } else {
            if (port == -1) {
                port = 443;
            }
            SSLSessionCache sSLSessionCache = null;
            try {
                if (this.f53340e != null) {
                    sSLSessionCache = new SSLSessionCache(new File(this.f53340e));
                }
            } catch (IOException e12) {
                this.f53344i.a("Failed to initialize SSL session cache", e12, new Object[0]);
            }
            try {
                SSLSocket sSLSocket = (SSLSocket) SSLCertificateSocketFactory.getDefault(60000, sSLSessionCache).createSocket(host, port);
                if (HttpsURLConnection.getDefaultHostnameVerifier().verify(host, sSLSocket.getSession())) {
                    return sSLSocket;
                }
                throw new e("Error while verifying secure socket to " + this.f53339d);
            } catch (UnknownHostException e13) {
                throw new e("unknown host: " + host, e13);
            } catch (IOException e14) {
                throw new e("error while creating secure socket to " + this.f53339d, e14);
            }
        }
    }

    static b i() {
        return f53335o;
    }

    static ThreadFactory j() {
        return f53334n;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r1 = new java.io.DataInputStream(r0.getInputStream());
        r0 = r0.getOutputStream();
        r0.write(r12.f53343h.c());
        r3 = new byte[1000];
        r4 = new java.util.ArrayList();
        r6 = false;
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        if (r6 != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004a, code lost:
        r9 = r1.read();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        if (r9 == -1) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0051, code lost:
        r3[r7] = (byte) r9;
        r9 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
        if (r3[r7] != 10) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0062, code lost:
        if (r3[r7 - 1] != 13) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
        r7 = new java.lang.String(r3, f53333m);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0075, code lost:
        if (r7.trim().equals("") == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0077, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0079, code lost:
        r4.add(r7.trim());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        r3 = new byte[1000];
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008a, code lost:
        if (r9 == 1000) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008c, code lost:
        r7 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ab, code lost:
        throw new Ub.e("Unexpected long line in handshake: " + new java.lang.String(r3, f53333m));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b3, code lost:
        throw new Ub.e("Connection closed before handshake was complete");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b4, code lost:
        r12.f53343h.f((java.lang.String) r4.get(0));
        r4.remove(0);
        r2 = new java.util.HashMap();
        r3 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cf, code lost:
        if (r3.hasNext() == false) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
        r4 = ((java.lang.String) r3.next()).split(": ", 2);
        r6 = r4[0];
        r7 = java.util.Locale.US;
        r2.put(r6.toLowerCase(r7), r4[1].toLowerCase(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f0, code lost:
        r12.f53343h.e(r2);
        r12.f53342g.h(r0);
        r12.f53341f.g(r1);
        r12.f53336a = Ub.c.d.f53351c;
        r12.f53342g.d().start();
        r12.f53338c.c();
        r12.f53341f.f();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n() {
        /*
            r12 = this;
            java.net.Socket r0 = r12.f()     // Catch:{ e -> 0x0087, all -> 0x0084 }
            monitor-enter(r12)     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r12.f53337b = r0     // Catch:{ all -> 0x001a }
            Ub.c$d r1 = r12.f53336a     // Catch:{ all -> 0x001a }
            Ub.c$d r2 = Ub.c.d.DISCONNECTED     // Catch:{ all -> 0x001a }
            if (r1 != r2) goto L_0x0024
            java.net.Socket r0 = r12.f53337b     // Catch:{ IOException -> 0x001d }
            r0.close()     // Catch:{ IOException -> 0x001d }
            r0 = 0
            r12.f53337b = r0     // Catch:{ all -> 0x001a }
            monitor-exit(r12)     // Catch:{ all -> 0x001a }
            r12.c()
            return
        L_0x001a:
            r0 = move-exception
            goto L_0x011a
        L_0x001d:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x001a }
            r1.<init>(r0)     // Catch:{ all -> 0x001a }
            throw r1     // Catch:{ all -> 0x001a }
        L_0x0024:
            monitor-exit(r12)     // Catch:{ all -> 0x001a }
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ e -> 0x0087, all -> 0x0084 }
            java.io.InputStream r2 = r0.getInputStream()     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r1.<init>(r2)     // Catch:{ e -> 0x0087, all -> 0x0084 }
            java.io.OutputStream r0 = r0.getOutputStream()     // Catch:{ e -> 0x0087, all -> 0x0084 }
            Ub.f r2 = r12.f53343h     // Catch:{ e -> 0x0087, all -> 0x0084 }
            byte[] r2 = r2.c()     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r0.write(r2)     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r2 = 1000(0x3e8, float:1.401E-42)
            byte[] r3 = new byte[r2]     // Catch:{ e -> 0x0087, all -> 0x0084 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r4.<init>()     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r5 = 0
            r6 = r5
            r7 = r6
        L_0x0047:
            r8 = 1
            if (r6 != 0) goto L_0x00b4
            int r9 = r1.read()     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r10 = -1
            if (r9 == r10) goto L_0x00ac
            byte r9 = (byte) r9     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r3[r7] = r9     // Catch:{ e -> 0x0087, all -> 0x0084 }
            int r9 = r7 + 1
            byte r10 = r3[r7]     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r11 = 10
            if (r10 != r11) goto L_0x008a
            int r7 = r7 + -1
            byte r7 = r3[r7]     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r10 = 13
            if (r7 != r10) goto L_0x008a
            java.lang.String r7 = new java.lang.String     // Catch:{ e -> 0x0087, all -> 0x0084 }
            java.nio.charset.Charset r9 = f53333m     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r7.<init>(r3, r9)     // Catch:{ e -> 0x0087, all -> 0x0084 }
            java.lang.String r3 = r7.trim()     // Catch:{ e -> 0x0087, all -> 0x0084 }
            java.lang.String r9 = ""
            boolean r3 = r3.equals(r9)     // Catch:{ e -> 0x0087, all -> 0x0084 }
            if (r3 == 0) goto L_0x0079
            r6 = r8
            goto L_0x0080
        L_0x0079:
            java.lang.String r3 = r7.trim()     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r4.add(r3)     // Catch:{ e -> 0x0087, all -> 0x0084 }
        L_0x0080:
            byte[] r3 = new byte[r2]     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r7 = r5
            goto L_0x0047
        L_0x0084:
            r0 = move-exception
            goto L_0x011c
        L_0x0087:
            r0 = move-exception
            goto L_0x013e
        L_0x008a:
            if (r9 == r2) goto L_0x008e
            r7 = r9
            goto L_0x0047
        L_0x008e:
            java.lang.String r0 = new java.lang.String     // Catch:{ e -> 0x0087, all -> 0x0084 }
            java.nio.charset.Charset r1 = f53333m     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r0.<init>(r3, r1)     // Catch:{ e -> 0x0087, all -> 0x0084 }
            Ub.e r1 = new Ub.e     // Catch:{ e -> 0x0087, all -> 0x0084 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r2.<init>()     // Catch:{ e -> 0x0087, all -> 0x0084 }
            java.lang.String r3 = "Unexpected long line in handshake: "
            r2.append(r3)     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r2.append(r0)     // Catch:{ e -> 0x0087, all -> 0x0084 }
            java.lang.String r0 = r2.toString()     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r1.<init>(r0)     // Catch:{ e -> 0x0087, all -> 0x0084 }
            throw r1     // Catch:{ e -> 0x0087, all -> 0x0084 }
        L_0x00ac:
            Ub.e r0 = new Ub.e     // Catch:{ e -> 0x0087, all -> 0x0084 }
            java.lang.String r1 = "Connection closed before handshake was complete"
            r0.<init>(r1)     // Catch:{ e -> 0x0087, all -> 0x0084 }
            throw r0     // Catch:{ e -> 0x0087, all -> 0x0084 }
        L_0x00b4:
            Ub.f r2 = r12.f53343h     // Catch:{ e -> 0x0087, all -> 0x0084 }
            java.lang.Object r3 = r4.get(r5)     // Catch:{ e -> 0x0087, all -> 0x0084 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r2.f(r3)     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r4.remove(r5)     // Catch:{ e -> 0x0087, all -> 0x0084 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r2.<init>()     // Catch:{ e -> 0x0087, all -> 0x0084 }
            java.util.Iterator r3 = r4.iterator()     // Catch:{ e -> 0x0087, all -> 0x0084 }
        L_0x00cb:
            boolean r4 = r3.hasNext()     // Catch:{ e -> 0x0087, all -> 0x0084 }
            if (r4 == 0) goto L_0x00f0
            java.lang.Object r4 = r3.next()     // Catch:{ e -> 0x0087, all -> 0x0084 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ e -> 0x0087, all -> 0x0084 }
            java.lang.String r6 = ": "
            r7 = 2
            java.lang.String[] r4 = r4.split(r6, r7)     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r6 = r4[r5]     // Catch:{ e -> 0x0087, all -> 0x0084 }
            java.util.Locale r7 = java.util.Locale.US     // Catch:{ e -> 0x0087, all -> 0x0084 }
            java.lang.String r6 = r6.toLowerCase(r7)     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r4 = r4[r8]     // Catch:{ e -> 0x0087, all -> 0x0084 }
            java.lang.String r4 = r4.toLowerCase(r7)     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r2.put(r6, r4)     // Catch:{ e -> 0x0087, all -> 0x0084 }
            goto L_0x00cb
        L_0x00f0:
            Ub.f r3 = r12.f53343h     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r3.e(r2)     // Catch:{ e -> 0x0087, all -> 0x0084 }
            Ub.i r2 = r12.f53342g     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r2.h(r0)     // Catch:{ e -> 0x0087, all -> 0x0084 }
            Ub.h r0 = r12.f53341f     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r0.g(r1)     // Catch:{ e -> 0x0087, all -> 0x0084 }
            Ub.c$d r0 = Ub.c.d.CONNECTED     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r12.f53336a = r0     // Catch:{ e -> 0x0087, all -> 0x0084 }
            Ub.i r0 = r12.f53342g     // Catch:{ e -> 0x0087, all -> 0x0084 }
            java.lang.Thread r0 = r0.d()     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r0.start()     // Catch:{ e -> 0x0087, all -> 0x0084 }
            Ub.d r0 = r12.f53338c     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r0.c()     // Catch:{ e -> 0x0087, all -> 0x0084 }
            Ub.h r0 = r12.f53341f     // Catch:{ e -> 0x0087, all -> 0x0084 }
            r0.f()     // Catch:{ e -> 0x0087, all -> 0x0084 }
        L_0x0116:
            r12.c()
            goto L_0x0144
        L_0x011a:
            monitor-exit(r12)     // Catch:{ all -> 0x001a }
            throw r0     // Catch:{ e -> 0x0087, all -> 0x0084 }
        L_0x011c:
            Ub.d r1 = r12.f53338c     // Catch:{ all -> 0x013c }
            Ub.e r2 = new Ub.e     // Catch:{ all -> 0x013c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x013c }
            r3.<init>()     // Catch:{ all -> 0x013c }
            java.lang.String r4 = "error while connecting: "
            r3.append(r4)     // Catch:{ all -> 0x013c }
            java.lang.String r4 = r0.getMessage()     // Catch:{ all -> 0x013c }
            r3.append(r4)     // Catch:{ all -> 0x013c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x013c }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x013c }
            r1.b(r2)     // Catch:{ all -> 0x013c }
            goto L_0x0116
        L_0x013c:
            r0 = move-exception
            goto L_0x0145
        L_0x013e:
            Ub.d r1 = r12.f53338c     // Catch:{ all -> 0x013c }
            r1.b(r0)     // Catch:{ all -> 0x013c }
            goto L_0x0116
        L_0x0144:
            return
        L_0x0145:
            r12.c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ub.c.n():void");
    }

    private synchronized void o(byte b10, byte[] bArr) {
        if (this.f53336a != d.CONNECTED) {
            this.f53338c.b(new e("error while sending data: not connected"));
        } else {
            try {
                this.f53342g.g(b10, true, bArr);
            } catch (IOException e10) {
                this.f53338c.b(new e("Failed to send frame", e10));
                c();
            }
        }
    }

    private void q() {
        try {
            this.f53336a = d.DISCONNECTING;
            this.f53342g.i();
            this.f53342g.g((byte) 8, true, new byte[0]);
        } catch (IOException e10) {
            this.f53338c.b(new e("Failed to send close frame", e10));
        }
    }

    public void b() {
        if (this.f53342g.d().getState() != Thread.State.NEW) {
            this.f53342g.d().join();
        }
        h().join();
    }

    public synchronized void c() {
        int i10 = C0811c.f53348a[this.f53336a.ordinal()];
        if (i10 == 1) {
            this.f53336a = d.DISCONNECTED;
        } else if (i10 == 2) {
            d();
        } else if (i10 == 3) {
            q();
        } else if (i10 == 4) {
        } else {
            if (i10 == 5) {
            }
        }
    }

    public synchronized void e() {
        if (this.f53336a != d.NONE) {
            this.f53338c.b(new e("connect() already called"));
            c();
            return;
        }
        b i10 = i();
        Thread h10 = h();
        i10.a(h10, "TubeSockReader-" + this.f53345j);
        this.f53336a = d.CONNECTING;
        h().start();
    }

    /* access modifiers changed from: package-private */
    public d g() {
        return this.f53338c;
    }

    /* access modifiers changed from: package-private */
    public Thread h() {
        return this.f53346k;
    }

    /* access modifiers changed from: package-private */
    public void k(e eVar) {
        this.f53338c.b(eVar);
        if (this.f53336a == d.CONNECTED) {
            c();
        }
        d();
    }

    /* access modifiers changed from: package-private */
    public void l() {
        d();
    }

    /* access modifiers changed from: package-private */
    public synchronized void m(byte[] bArr) {
        o((byte) 10, bArr);
    }

    public synchronized void p(String str) {
        o((byte) 1, str.getBytes(f53333m));
    }

    public void r(d dVar) {
        this.f53338c = dVar;
    }
}
