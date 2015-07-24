package academyteam.com.netmonsters.bluetoothadapter;

import android.bluetooth.BluetoothSocket;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by mbarnard on 24/07/2015.
 */
public class ProcessMessagesThread extends Thread {

    private BluetoothSocket mSocket;
    private Handler mHandler;

    public ProcessMessagesThread(Handler handler, BluetoothSocket socket) {

        mHandler = handler;
        mSocket = socket;
    }

    public void run() {

        InputStream InStream = null;

        // Get the input and output streams
        try {
            InStream = mSocket.getInputStream();
        } catch (IOException e) {
        }

        while (true) {

            byte[] buffer = new byte[1024];  // buffer store for the stream
            int bytes; // bytes returned from read()

            // Keep listening to the InputStream until an exception occurs
            while (true) {

                System.out.println("ITS WORKING");
                try {
                    // Read from the InputStream
                    bytes = InStream.read(buffer);

                    // Package the message and send it via the handler
                    Message message = new Message();
                    Bundle bundle = new Bundle();
                    bundle.putString("Message", new String(String.valueOf(bytes)));
                    message.setData(bundle);

                    // Send the obtained bytes to the UI activity
                    mHandler.sendMessage(message);

                } catch (IOException e) {
                    break;
                }
            }
        }
    }
}
