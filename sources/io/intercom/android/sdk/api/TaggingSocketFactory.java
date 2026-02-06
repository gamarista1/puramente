package io.intercom.android.sdk.api;

import android.net.TrafficStats;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;

public class TaggingSocketFactory extends SocketFactory {
    private final SocketFactory defaultFactory;
    private final int threadStatsTag;

    public TaggingSocketFactory(SocketFactory socketFactory, int i10) {
        this.defaultFactory = socketFactory;
        this.threadStatsTag = i10;
    }

    private Socket withTag(Socket socket) {
        TrafficStats.setThreadStatsTag(this.threadStatsTag);
        return socket;
    }

    public Socket createSocket() {
        return withTag(this.defaultFactory.createSocket());
    }

    public Socket createSocket(String str, int i10) {
        return withTag(this.defaultFactory.createSocket(str, i10));
    }

    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) {
        return withTag(this.defaultFactory.createSocket(str, i10, inetAddress, i11));
    }

    public Socket createSocket(InetAddress inetAddress, int i10) {
        return withTag(this.defaultFactory.createSocket(inetAddress, i10));
    }

    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        return withTag(this.defaultFactory.createSocket(inetAddress, i10, inetAddress2, i11));
    }
}
