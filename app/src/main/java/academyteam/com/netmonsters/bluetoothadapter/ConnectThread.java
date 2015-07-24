package academyteam.com.netmonsters.bluetoothadapter;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import java.io.IOException;

/**
 * Created by mbarnard on 24/07/2015.
 */
public class ConnectThread extends Thread {

    private Handler mHandler;
    private BluetoothAdapter mBluetoothAdapter;
    private BluetoothSocket mSocket;
    private BluetoothDevice mDevice;

    public ConnectThread(Handler handler, BluetoothAdapter bluetoothAdapter, BluetoothSocket socket, BluetoothDevice device) {

        mHandler = handler;
        mBluetoothAdapter = bluetoothAdapter;
        mDevice = device;
        mSocket = socket;
    }

    public void run() {

        while(mSocket == null) {
            // Get a BluetoothSocket to connect with the given BluetoothDevice
            System.out.println("Loop");
            try {
                if (mDevice != null) {
                    // MY_UUID is the app's UUID string, also used by the server code
                    mSocket = mDevice.createRfcommSocketToServiceRecord(NetworkManager.UUID);
                }

            } catch (IOException e) {
            }
        }

        mBluetoothAdapter.cancelDiscovery();

        try {
            // Connect the device through the socket. This will block
            // until it succeeds or throws an exception
            mSocket.connect();
        } catch (IOException connectException) {
            // Unable to connect; close the socket and get out
            try {
                mSocket.close();
            } catch (IOException closeException) { }
            return;
        }

        // Package the message and send it via the handler
        Message message = new Message();
        Bundle bundle = new Bundle();
        bundle.putString("Message", new String("Connection Established"));
        message.setData(bundle);

        // Send the obtained bytes to the UI activity
        mHandler.sendMessage(message);
    }

    public void cancel() {
        try {
            mSocket.close();
        } catch (IOException e) { }
    }
}
