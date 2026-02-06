package com.facebook.react.devsupport;

interface N {
    void closeQuietly();

    void connect();

    void sendEventToAllConnections(String str);
}
