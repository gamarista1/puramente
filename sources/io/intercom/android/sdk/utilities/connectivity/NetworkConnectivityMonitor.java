package io.intercom.android.sdk.utilities.connectivity;

import android.content.Context;
import android.content.IntentFilter;
import androidx.core.content.c;
import io.intercom.android.sdk.utilities.connectivity.ConnectivityBroadcastReceiver;

public class NetworkConnectivityMonitor implements ConnectivityBroadcastReceiver.ConnectivityUpdateListener {
    private boolean didRegister = false;
    private NetworkState lastState = NetworkState.UNKNOWN;
    private ConnectivityEventListener listener;
    private final ConnectivityBroadcastReceiver receiver = new ConnectivityBroadcastReceiver(this);

    public interface ConnectivityEventListener {
        void onDisconnect();

        void onReconnect();
    }

    /* access modifiers changed from: package-private */
    public ConnectivityEventListener getListener() {
        return this.listener;
    }

    public void onUpdate(NetworkState networkState) {
        NetworkState networkState2 = this.lastState;
        if (networkState != networkState2) {
            ConnectivityEventListener connectivityEventListener = this.listener;
            if (connectivityEventListener != null) {
                NetworkState networkState3 = NetworkState.NOT_CONNECTED;
                if (networkState == networkState3) {
                    connectivityEventListener.onDisconnect();
                } else if (networkState == NetworkState.CONNECTED && networkState2 == networkState3) {
                    connectivityEventListener.onReconnect();
                }
            }
            this.lastState = networkState;
        }
    }

    public void setListener(ConnectivityEventListener connectivityEventListener) {
        this.listener = connectivityEventListener;
    }

    public synchronized void startListening(Context context) {
        if (!this.didRegister) {
            c.registerReceiver(context, this.receiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), 4);
            this.didRegister = true;
        }
    }

    public synchronized void stopListening(Context context) {
        if (this.didRegister) {
            context.unregisterReceiver(this.receiver);
            this.didRegister = false;
        }
    }
}
