package academyteam.com.netmonsters.bluetoothadapter;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import java.io.IOException;

/**
 * Created by mbarnard on 24/07/2015.
 */
public class AcceptThread extends Thread {

    private Handler mHandler;
    private BluetoothAdapter mBluetoothAdapter;
    private BluetoothSocket  mSocket;

    private final BluetoothServerSocket mServerSocket;

    public AcceptThread(Handler handler, BluetoothAdapter bluetoothAdapter, BluetoothSocket socket) {

        mHandler = handler;
        mBluetoothAdapter = bluetoothAdapter;

        // Use a temporary object that is later assigned to mServerSocket,
        // because mmServerSocket is final
        BluetoothServerSocket tmp = null;
        try {
            // MY_UUID is the app's UUID string, also used by the client code
            tmp = mBluetoothAdapter.listenUsingRfcommWithServiceRecord(NetworkManager.NAME, NetworkManager.UUID);
        } catch (IOException e) { }
        mServerSocket = tmp;
    }

    public void run() {

        // Keep listening until exception occurs or a socket is returned
        while (true) {
            try {
                mSocket = mServerSocket.accept();
            } catch (IOException e) {
                break;
            }
            // If a connection was accepted
            if (mSocket != null) {

                try {
                    mServerSocket.close();
                }
                catch (IOException e) {

                }
                break;
            }

            // Package the message and send it via the handler
            Message message = new Message();
            Bundle bundle = new Bundle();
            bundle.putString("Message", new String("Connection Established"));
            message.setData(bundle);

            // Send the obtained bytes to the UI activity
            mHandler.sendMessage(message);
        }
    }

    /** Will cancel the listening socket, and cause the thread to finish */
    public void cancel() {
        try {
            mServerSocket.close();
        } catch (IOException e) {

        }
    }
}